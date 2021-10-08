package core.application.specifications;

import org.yaml.snakeyaml.Yaml;

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

public class Specification {
    private static final String DEFAULT_ANCHOR_FILE_NAME = "pubspec.yaml";
    private static final String DEFAULT_CHUNKS_DIRECTORY_POSTFIX = "_chunks";

    private Path pathToSpecification;

    /**
     * Имя файла (или относительный путь от начала проекта), который позволяет понять, что программа будет выполняться с корректного места.
     * Т.е., это такой опорный файл. В случае если его нет, то выбрасывается исключение.
     * Нужно для безопасности и уверенности того, что действия будут выполнятся от ожидаемого места.
     * Эту проверку можно отключить через параметр check_anchor = false в спецификации
     */
    private final String anchorFileName;
    private final String chunksDirectoryPostfix;
    private final boolean checkAnchor;
    private Map map;

    public Specification(Path pathToSpecification) throws IOException {
        this.pathToSpecification = pathToSpecification;

        File specFile = pathToSpecification.toFile();
        if(!specFile.exists()) {
            throw new NoSuchFileException("Нет файла спецификации: " + pathToSpecification);
        }
        readFile();

        anchorFileName = map.get(SpecificationKeys.ANCHOR_FILE_NAME_FIELD) == null
                ? DEFAULT_ANCHOR_FILE_NAME
                : (String) map.get(SpecificationKeys.ANCHOR_FILE_NAME_FIELD);

        checkAnchor = map.get(SpecificationKeys.CHECK_ANCHOR_FIELD) == null
                ? true
                : (boolean) map.get(SpecificationKeys.CHECK_ANCHOR_FIELD);

        chunksDirectoryPostfix = map.get(SpecificationKeys.CHUNKS_DIRECTORY_POSTFIX_FIELD) == null
                ? DEFAULT_CHUNKS_DIRECTORY_POSTFIX
                : (String) map.get(SpecificationKeys.CHUNKS_DIRECTORY_POSTFIX_FIELD);
    }

    private void readFile() throws IOException {
        String document = new String(Files.readAllBytes(pathToSpecification), StandardCharsets.UTF_8);
        Yaml yaml = new Yaml();
        map = yaml.load(document);
    }

    public CommandSpecification getCommandByName(String name) throws Exception {
        if(map.get(SpecificationKeys.COMMANDS_FIELD) == null) {
            throw new Exception("В спецификации нет поля команд: " + SpecificationKeys.COMMANDS_FIELD);
        }

        Map commands = (Map) map.get(SpecificationKeys.COMMANDS_FIELD);

        if(commands.get(name) == null) {
            throw new Exception("В спецификации нет команды с именем " + name);
        }

        Map command = (Map) commands.get(name);
        return new CommandSpecification(name, command);
    }

    public Path getPathToTemplateProject() throws Exception {
        Path path;

        if(map.get(SpecificationKeys.PATH_TO_TEMPLATE_PROJECT_FIELD) == null) {
            Path specificationDirectory =  pathToSpecification.getParent();
            Path pathToPubspecYaml = specificationDirectory.resolve(Paths.get(DEFAULT_ANCHOR_FILE_NAME));
            if(!pathToPubspecYaml.toFile().exists()) {
                throw new Exception("В спецификации нет поля " + SpecificationKeys.PATH_TO_TEMPLATE_PROJECT_FIELD
                        + " или оно = null, а в директории со спецификацией нету файла " + DEFAULT_ANCHOR_FILE_NAME
                        + ", чтобы считать директорию шаблонным проектом"
                );
            }

            path = specificationDirectory;
        } else {
            path = Paths.get((String) map.get(SpecificationKeys.PATH_TO_TEMPLATE_PROJECT_FIELD));
        }

        if(!path.isAbsolute()) {
            throw new Exception("Путь до проекта должен быть абсолютным. Указан путь: " + path);
        }

        if(!path.toFile().exists()) {
            throw new Exception("Пути до проекта не существует: " + path);
        }

        return path;
    }

    public String getAnchorFileName() {
        return anchorFileName;
    }

    public String getChunksDirectoryPostfix() {
        return chunksDirectoryPostfix;
    }

    public boolean isCheckAnchor() {
        return checkAnchor;
    }

    public Map<String, String> getHelps() throws Exception {
        Map<String, String> result = new HashMap<>();

        if(map.get(SpecificationKeys.COMMANDS_FIELD) == null) {
            return result;
        }

        Map<String, Map> commands = (Map) map.get(SpecificationKeys.COMMANDS_FIELD);

        for(Map.Entry pair: commands.entrySet()) {
            String commandName = (String) pair.getKey();
            CommandSpecification commandSpecification = getCommandByName(commandName);
            String help = commandSpecification.getHelp();
            result.put(commandName, help);
        }

        return result;
    }

    public String getCommonHelp() {
        return SpecificationHelper.buildHelp(map);
    }
}
