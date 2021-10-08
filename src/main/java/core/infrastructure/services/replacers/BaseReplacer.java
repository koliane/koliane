package core.infrastructure.services.replacers;

import core.infrastructure.helpers.YamlHelper;

import java.io.File;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

abstract public class BaseReplacer {

    protected final Path absolutePathToRelease;

    protected final Path absolutePathToTemplate;

//    protected final Path pathToYamlChunks;

    protected Map<String, ?> chunksMap;

    /**
     * После наследования от этого класса мы можем быть уверены, что файл шаблона и файл для записи существуют
     * @param absolutePathToRelease
     * @param absolutePathToTemplate
     * @param chunksMap
     * @throws NoSuchFileException
     */
//    protected BaseReplacer(Path absolutePathToRelease, Path absolutePathToTemplate, Map<String, String> chunksMap) throws NoSuchFileException {
    protected BaseReplacer(Path absolutePathToRelease, Path absolutePathToTemplate, String chunksDirectoryPostfix, String commandName) throws IOException {
        File releaseFile = absolutePathToRelease.toFile();
        if(!releaseFile.exists()) {
            throw new NoSuchFileException("Нет файла для вывода результата: " + absolutePathToRelease);
        }

        File templateFile = absolutePathToTemplate.toFile();

        if(!templateFile.exists()) {
            throw new NoSuchFileException("Нет шаблона " + absolutePathToTemplate + " для файла "+absolutePathToRelease);
        }

        String chunksDirectoryName = absolutePathToTemplate.getFileName().toString() + chunksDirectoryPostfix;
        Path pathToChunksDirectory = absolutePathToTemplate.getParent().resolve(chunksDirectoryName);
        Path pathToYamlChunks = pathToChunksDirectory.resolve(Paths.get(commandName+".yaml"));

        if(!pathToYamlChunks.toFile().exists()) {
            throw new NoSuchFileException("Файла с чанками не существует: " + pathToYamlChunks);
        }


        this.absolutePathToRelease = absolutePathToRelease;
        this.absolutePathToTemplate = absolutePathToTemplate;
//        this.pathToYamlChunks = pathToYamlChunks;
        this.chunksMap = YamlHelper.getYamlMap(pathToYamlChunks);;
    }

    abstract public String replace() throws Exception;
}
