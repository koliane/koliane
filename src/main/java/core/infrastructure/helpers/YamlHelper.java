package core.infrastructure.helpers;

import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class YamlHelper {
    public static Map getYamlMap(Path pathToYamlFile) throws IOException {
        Yaml yaml = new Yaml();
        String document = new String(Files.readAllBytes(pathToYamlFile), StandardCharsets.UTF_8);

        return yaml.load(document);
    }

    public static Map buildMapByText(String text) {
        Yaml yaml = new Yaml();

        return yaml.load(text);
    }
}
