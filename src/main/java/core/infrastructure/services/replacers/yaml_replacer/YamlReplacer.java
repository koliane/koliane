package core.infrastructure.services.replacers.yaml_replacer;

import core.infrastructure.helpers.YamlHelper;
import core.infrastructure.services.replacers.TextReplacer;
import core.infrastructure.utils.MapUtilities;
import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class YamlReplacer extends TextReplacer {

    public YamlReplacer(
            Path absolutePathToRelease,
            Path absolutePathToTemplate,
            String chunksDirectoryPostfix,
            String commandName,
            Map<String, String> options
    ) throws IOException {
        super(absolutePathToRelease, absolutePathToTemplate, chunksDirectoryPostfix, commandName, options);

    }

    @Override
    public String replace() throws Exception {
        Map releaseYamlMap = YamlHelper.buildMapByText(releaseText);
        String newReleaseText = releaseText;

        boolean hasMatches = false;
        for(Map.Entry<String, ?> pair: chunksMap.entrySet()) {
            String key = pair.getKey();
            Object chunkValue = pair.getValue();
            List<String> pathToKey = MapUtilities.buildPathToKey(key, releaseYamlMap);

            if(pathToKey.isEmpty()) {
                continue;
            }
            hasMatches = true;

            Map<String, ?> releaseFieldMap = (Map<String, ?>) MapUtilities.getMapValueByPath(releaseYamlMap, pathToKey);

            if(chunkValue instanceof Map) {
                newReleaseText = addChunkMapToReleaseText(
                        key,
                        (Map<String, String>) chunkValue,
                        newReleaseText,
                        releaseFieldMap
                );
            } else {
                //TODO
                new Exception("Не реализованная обработка для "+pathToKey+" value = " + chunkValue.toString());
            }
        }

        if(!hasMatches) {
            throw new Exception("Нет ни одного подходящего чанка для файла " + absolutePathToRelease);
        }

        return newReleaseText;
    }

    private String addChunkMapToReleaseText(
            String chunkParentName,
            Map<String, String> chunkParentValue,
            String newReleaseText,
            Map<String, ?> releaseFieldMap
    ) {
        Map<String, String> chunkMap = chunkParentValue;
        for(Map.Entry<String, String> chunkPair:  chunkMap.entrySet()) {
            String chunkItemName = chunkPair.getKey();
            String chunkItemValue = chunkPair.getValue();

            if(!(releaseFieldMap instanceof Map)) {
                new Exception("Найденное значение в пути до нужного ключа файла = " + absolutePathToRelease.toString()
                        + " не является Map");
            }

            if(releaseFieldMap.containsKey(chunkItemName)) {
                System.out.println("Ключ " + chunkItemName + " уже существует");
                if(!releaseFieldMap.get(chunkItemName).toString().equals(chunkItemValue)) {
                    System.out.println("Значения по ключу " + chunkItemName
                            + " различны: релиз="+releaseFieldMap.get(chunkItemName).toString()
                            + " чанк="+chunkItemValue
                    );
                }
                continue;
            }
            newReleaseText = addChunkToReleaseText(newReleaseText, chunkParentName, chunkItemName, chunkItemValue);
        }

        return newReleaseText;
    }

    private String addChunkToReleaseText(String newReleaseText, String parentKey, String chunkName, String chunkValue) {
        String replacementValue = chunkName + ": " + chunkValue;

        String strPattern = "([ ]*)"+parentKey + "[ ]*:[ ]*\r?\n";
        Pattern pattern = Pattern.compile(strPattern);
        Matcher matcher = pattern.matcher(newReleaseText);

        if(matcher.find()) {
            String offset = "";
            if(matcher.group(1) != null) {
                offset = matcher.group(1);
            }
            offset += "  ";

            String replacement = matcher.group(0) + offset + replacementValue + "\r\n";
            newReleaseText = newReleaseText.replaceFirst(strPattern, replacement);
        }

        return newReleaseText;
    }

}
