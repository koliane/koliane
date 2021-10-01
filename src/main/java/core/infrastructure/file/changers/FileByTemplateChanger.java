package core.infrastructure.file.changers;

import core.application.mappers.ScenarioImplInterface;
import core.infrastructure.helpers.PathHelper;
import core.infrastructure.services.replacers.adding_replacer.AddingReplacer;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FileByTemplateChanger {
    protected final ScenarioImplInterface optionsMapper;
    protected final Path pathToProject;

    public FileByTemplateChanger(Path pathToProject, ScenarioImplInterface optionsMapper) {
        this.pathToProject = pathToProject;
        this.optionsMapper = optionsMapper;
    }

    public void change(String strRelativePath) throws Exception {
        Path relativePath = Paths.get(strRelativePath);
        Path absolutePathToProductFile = pathToProject.resolve(relativePath);
        Path templateDirectory = PathHelper.getDefaultTemplateDirectory();
        Path pathToTemplateFile = templateDirectory.resolve(relativePath);
        File templateFile = pathToTemplateFile.toFile();

        if(!templateFile.exists()) {
            throw new NoSuchFileException("Нет шаблона для файла: " + relativePath.toString());
        }

        String templateText = new String(Files.readAllBytes(pathToTemplateFile), StandardCharsets.UTF_8);

        HashMap<String, String> chunksMap = optionsMapper.getChunksMap(relativePath);
        if(chunksMap.isEmpty()) {
            System.out.println("Нет шаблонов-заменителей для файла "+ strRelativePath);
            return;
        }

//        Path absolutePathToRelease = pathToProject.resolve(relativePath);
        Path absolutePathToRelease = templateDirectory.resolve(Paths.get("test2.dart"));

        File releaseFile = pathToTemplateFile.toFile();
        if(!releaseFile.exists()) {
            throw new NoSuchFileException("Нет файла для вывода результата: " + absolutePathToRelease);
        }
        String releaseText = new String(Files.readAllBytes(absolutePathToRelease), StandardCharsets.UTF_8);

        AddingReplacer replacer = new AddingReplacer(releaseText, templateText, chunksMap);
        String newReleaseText = replacer.replace();
        System.out.println(newReleaseText);


    }
}
