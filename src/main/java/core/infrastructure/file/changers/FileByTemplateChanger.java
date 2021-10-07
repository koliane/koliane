package core.infrastructure.file.changers;

import core.infrastructure.file.FileByTemplateAction;
import core.infrastructure.helpers.YamlHelper;
import core.infrastructure.helpers.placeholder.CodePlaceholderHelper;
import core.infrastructure.helpers.placeholder.FilePlaceholderHelper;
import core.infrastructure.services.replacers.adding_replacer.AddingReplacer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
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
        File templateFile = pathToTemplateFile.toFile();

        if(!templateFile.exists()) {
            throw new NoSuchFileException("Нет шаблона для файла: " + pathToTemplateFile);
        }

        String templateText = new String(Files.readAllBytes(pathToTemplateFile), StandardCharsets.UTF_8);
        templateText = (new CodePlaceholderHelper()).replaceAllPlaceholders(templateText, options);

        Map<String, String> chunksMap = getChunksMap(pathToTemplateFile);
        if(chunksMap.isEmpty()) {
            System.out.println("Нет шаблонов-заменителей для файла "+ strRelativePath);
            return;
        }

        File releaseFile = absolutePathToRelease.toFile();
        if(!releaseFile.exists()) {
            throw new NoSuchFileException("Нет файла для вывода результата: " + absolutePathToRelease);
        }
        String releaseText = new String(Files.readAllBytes(absolutePathToRelease), StandardCharsets.UTF_8);

        AddingReplacer replacer = new AddingReplacer(releaseText, templateText, chunksMap);
        String newReleaseText = replacer.replace();

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

    private Map<String, String> getChunksMap(Path pathToTemplateFile) throws IOException {
        String chunksDirectoryName = pathToTemplateFile.getFileName().toString() + chunksDirectoryPostfix;
        Path pathToChunksDirectory = pathToTemplateFile.getParent().resolve(chunksDirectoryName);
        Path pathToYamlChunks = pathToChunksDirectory.resolve(Paths.get(commandName+".yaml"));

        if(!pathToYamlChunks.toFile().exists()) {
            throw new NoSuchFileException("Файла с чанками не существует: " + pathToYamlChunks);
        }

        Map<String, String> chunksMap = YamlHelper.getYamlMap(pathToYamlChunks);
        CodePlaceholderHelper codePlaceholderHelper = new CodePlaceholderHelper();

        for(Map.Entry<String, String> chunkPair: chunksMap.entrySet()) {
            String chunkName = chunkPair.getKey();
            String chunkText = chunkPair.getValue();

            chunkText = codePlaceholderHelper.replaceAllPlaceholders(chunkText, options);
            chunkText = codePlaceholderHelper.deleteUnusedPlaceholders(chunkText, options);

            chunksMap.put(chunkName, chunkText);
        }

        return chunksMap;
    }
}
