package core.application.executors.specification;

import core.application.commands.specification_command.SpecificationCommand;
import core.application.executors.BaseExecutor;
import core.application.executors.specification.path_commands.CreatePathCommand;
import core.application.executors.specification.path_commands.UpdatePathCommand;
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

        List<CreatePathCommand> pathsCommands = commandSpecification.getCreatePathsCommands();
        if(pathsCommands.isEmpty()) {
            System.out.println("Нет файлов для добавления");
            return;
        }

        FileByTemplateCreator fileByTemplateCreator = new FileByTemplateCreator(
                inputCommand.getPathToProject(),
                specification.getPathToTemplateProject(),
                inputCommand.getOptions()
        );

        for (CreatePathCommand pathCommand: pathsCommands) {
            Path relativePath = pathCommand.getPath();
            if(pathCommand.isSoftMode()) {
                fileByTemplateCreator.softCreate(relativePath.toString());
            } else {
                fileByTemplateCreator.forceCreate(relativePath.toString());
            }

        }

        System.out.println("---------- CREATED ----------------");
    }

    private void update() throws Exception {
        System.out.println("---------- START UPDATING ----------------");

        List<UpdatePathCommand> pathsCommands = commandSpecification.getUpdatePathsCommands();
        if(pathsCommands.isEmpty()) {
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

        for (UpdatePathCommand pathCommand: pathsCommands) {
            Path relativePath = pathCommand.getPath();
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
