package core.application;

import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class PubspecYaml {

    public String getProjectName(String pathToProject) throws NoSuchFileException, Exception  {
        Yaml yaml = new Yaml();
        String name;

        try {
            Path path = Paths.get(pathToProject + File.separator + "pubspec.yaml");
            String document = new String(Files.readAllBytes(path), StandardCharsets.UTF_8);
//            LinkedHashMap map = yaml.load(document);
            Map<String,String> map = yaml.load(document);
            name = map.get("name");

        } catch (NoSuchFileException e) {
            throw new NoSuchFileException("В текущей директории нет файла pubspec.yaml");
        } catch (Exception e) {
            throw new Exception("Ошибка при чтении/анализе pubspec.yaml");

        }

        if( name == null || name.isEmpty()) {
            throw new Exception("Пустое имя проекта в pubspec.yaml");
        }

        return name;
    }
}
