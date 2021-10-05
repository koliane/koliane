package core.application.executors.specification;

import core.application.commands.specification_command.SpecificationCommand;
import core.application.executors.BaseExecutor;
import core.application.specifications.CommandSpecification;
import core.application.specifications.Specification;
import core.infrastructure.file.changers.FileByTemplateChanger;
import core.infrastructure.file.creators.FileByTemplateCreator;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SpecificationExecutor extends BaseExecutor<SpecificationCommand> {
    /**
     * Спецификация из файла .yaml для определенной команды
     */
    CommandSpecification commandSpecification;


    public SpecificationExecutor(SpecificationCommand command) throws Exception {
        super(command);
        commandSpecification = specification.getCommandByName(inputCommand.getName());
    }

    @Override
    public void exec() throws Exception {
        checkAnchor();

        create();
        update();

    }

    private void create() throws Exception {
        System.out.println("---------- START CREATING ----------------");
        List<String> strPaths = commandSpecification.getCreateStrPaths();
        if(strPaths.isEmpty()) {
            System.out.println("Нет файлов для добавления");
            return;
        }

        FileByTemplateCreator fileByTemplateCreator = new FileByTemplateCreator(
                inputCommand.getPathToProject(),
                specification.getPathToTemplateProject(),
                inputCommand.getOptions()
        );

        for (String strPath: strPaths) {
            Path relativePath = Paths.get(strPath);
            if(relativePath.isAbsolute()) {
                throw new Exception("Путь до файлов в спецификации должен быть относительным. Команда create. " + relativePath);
            }

            fileByTemplateCreator.forceCreate(relativePath.toString());

        }

        System.out.println("---------- CREATED ----------------");
    }

    private void update() throws Exception {
        System.out.println("---------- START UPDATING ----------------");
        List<String> strPaths = commandSpecification.getUpdateStrPaths();
        if(strPaths.isEmpty()) {
            System.out.println("Нет файлов для обновления");
            return;
        }

        FileByTemplateChanger fileByTemplateChanger = new FileByTemplateChanger(
            inputCommand.getPathToProject(),
            specification.getPathToTemplateProject(),
            inputCommand.getOptions(),
            inputCommand.getName(),
            specification.getChunksDirectoryPostfix()
        );

        for (String strPath: strPaths) {
            Path relativePath = Paths.get(strPath);
            if(relativePath.isAbsolute()) {
                throw new Exception("Путь до файлов в спецификации должен быть относительным. Команда update. " + relativePath);
            }

            fileByTemplateChanger.change(relativePath.toString());

        }


        System.out.println("---------- UPDATED -----------------------");
    }

    private void checkAnchor() throws Exception {
        if(!specification.isCheckAnchor()) {
            return;
        }

        Path path = inputCommand.getPathToProject().resolve(specification.getAnchorFileName());

        if(!path.toFile().exists()) {
            throw new NoSuchFileException("В текущей директории "+ inputCommand.getPathToProject()
                    +" нет файла " + specification.getAnchorFileName());
        }
    }

}
