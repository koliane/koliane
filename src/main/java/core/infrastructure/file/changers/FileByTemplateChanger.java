package core.infrastructure.file.changers;

import core.infrastructure.file.FileByTemplateAction;
import core.infrastructure.helpers.YamlHelper;
import core.infrastructure.helpers.placeholder.CodePlaceholderHelper;
import core.infrastructure.helpers.placeholder.FilePlaceholderHelper;
import core.infrastructure.services.replacers.BaseReplacer;
import core.infrastructure.services.replacers.dart_replacer.DartReplacer;
import core.infrastructure.services.replacers.yaml_replacer.YamlReplacer;
import core.infrastructure.utils.FormatUtilities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FileByTemplateChanger extends FileByTemplateAction {
    private final String chunksDirectoryPostfix;
    private final String commandName;

    public FileByTemplateChanger(
            Path pathToProject,
            Path pathToTemplateProject,
            Map<String, String> options,
            String commandName,
            String chunksDirectoryPostfix
    ) {
        super(pathToProject, pathToTemplateProject, options);
        this.chunksDirectoryPostfix = chunksDirectoryPostfix;
        this.commandName = commandName;
    }

    public void change(String strRelativePath) throws Exception {
        String strProjectRelativePath = strRelativePath;
        FilePlaceholderHelper filePlaceholderHelper = new FilePlaceholderHelper();
        if(filePlaceholderHelper.hasPlaceholder(strRelativePath)) {
            validatePathWithPlaceholders(strRelativePath);
            strProjectRelativePath = filePlaceholderHelper.replaceAllPlaceholdersToSnakeCase(strProjectRelativePath, options);
        }

        Path templateRelativePath = Paths.get(strRelativePath);
        Path projectRelativePath = Paths.get(strProjectRelativePath);
        Path absolutePathToRelease = pathToProject.resolve(projectRelativePath);
        Path pathToTemplateFile = pathToTemplateProject.resolve(templateRelativePath);


        BaseReplacer replacer;

        if(FormatUtilities.isYaml(absolutePathToRelease.toString())) {
            replacer = new YamlReplacer(absolutePathToRelease, pathToTemplateFile, chunksDirectoryPostfix, commandName, options);

        } else {
            replacer = new DartReplacer(absolutePathToRelease, pathToTemplateFile, chunksDirectoryPostfix, commandName, options);
        }

        String newReleaseText = replacer.replace();

        File releaseFile = absolutePathToRelease.toFile();
        write(releaseFile, newReleaseText);

        System.out.println("Файл обновлен " + absolutePathToRelease);
    }

    private void write(File releaseFile, String newReleaseText) throws IOException {
        FileWriter writer = null;
        try {
            writer = new FileWriter(releaseFile);
            writer.write(newReleaseText);
        } catch (IOException e) {
            System.out.println("Ошибка открытия или записи в файл " + releaseFile.getPath());
            e.printStackTrace();
            throw e;
        }finally {
            try {
                writer.close();
            }catch (IOException e){
                System.out.println("Ошибка закрытия файла " + releaseFile.getPath());
                e.printStackTrace();
                throw e;
            }

        }
    }
}
