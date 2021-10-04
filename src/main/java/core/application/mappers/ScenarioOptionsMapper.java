package core.application.mappers;

import core.infrastructure.helpers.PathHelper;
import core.infrastructure.helpers.ReplacementHelper;
import core.infrastructure.helpers.placeholder.CodePlaceholderHelper;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ScenarioOptionsMapper extends BaseOptionsMapper implements GetMapByPath {
    protected ScenariosEnum scenario;

    ScenarioOptionsMapper(String projectName, ScenariosEnum scenario){
        super(projectName);
        this.scenario = scenario;
    }

    private String getChunkResultText(String templateText, HashMap<String, String> optionsMap) {
        CodePlaceholderHelper codePlaceholderHelper = new CodePlaceholderHelper();
        for(HashMap.Entry<String, String> pair: optionsMap.entrySet()) {
            String key = pair.getKey();
            String optionValue = pair.getValue();
//            String replacementWord = ReplacementHelper.getReplacementWord(key);
            String replacementWord = codePlaceholderHelper.buildPlaceholder(key);
            templateText = templateText.replaceAll(replacementWord, optionValue);
        }

        return templateText;
    }

// Пример файла с шаблонами:
/*

#-MAIN_MOUNT_POINT-#
hello#-ENTITY_NAME-#world();


asdf
  kj

#-ZZZ-#
as#-PROJECT_NAME-#df

*/

    /**
     *
     * @param relativePath
     * @param map - map, по которой заменяются ключи в chunks файле
     * @return
     */
    public HashMap<String, String> getChunksMap(Path relativePath, HashMap<String, String> map)
            throws Exception {

        Path templateDirectory = PathHelper.getDefaultTemplateDirectory();
        Path pathToTemplate = templateDirectory.resolve(relativePath);

        Path fileName = pathToTemplate.getFileName();
        Path pathToDirectory = pathToTemplate.getParent();
        Path pathToChunks = Paths.get(
                pathToDirectory.toString(),
                ReplacementHelper.getChunksDirectoryName(fileName.toString()),
                scenario.toString());

        File pathToChunksFile = pathToChunks.toFile();
        if(!pathToChunksFile.exists()) {
            return map;
        }

        HashMap<String, String> chunksMap = new HashMap<String, String>();
        StringBuilder templateText = new StringBuilder();
        String strTemplateText = "";
        List<String> lines = Files.readAllLines(pathToChunks, StandardCharsets.UTF_8);
        String chunkAlias = "";
        int n = lines.size();

        for (int i = 0; i < n; i++) {
            String line = lines.get(i);
//            boolean isChunkAlias = line.trim().startsWith(ReplacementHelper.ALIAS_PREFIX)
//                    && line.trim().endsWith(ReplacementHelper.ALIAS_POSTFIX);
            boolean isChunkAlias = (new CodePlaceholderHelper()).isPlaceholder(line.trim());

            if(isChunkAlias) {
                if(templateText.length() > 0) {
                    strTemplateText = templateText.toString();
                    strTemplateText = strTemplateText.substring(0, strTemplateText.length()-4);
                    String resultChunkText = getChunkResultText(strTemplateText, map);
                    chunksMap.put(chunkAlias, resultChunkText);
                    templateText = new StringBuilder();

                }


                chunkAlias = line;
//                chunkAlias = chunkAlias.trim().replaceAll(ReplacementHelper.ALIAS_PREFIX, "");
//                chunkAlias = chunkAlias.trim().replaceAll(ReplacementHelper.ALIAS_POSTFIX, "");
                chunkAlias = (new CodePlaceholderHelper()).getClearedPlaceholder(chunkAlias.trim());

                continue;
            }

            boolean canAddRN = i < n-1 || line.trim().isEmpty();
            templateText.append(canAddRN ? line + "\r\n" : line);
        }

        if(chunkAlias.length() > 0) {
            strTemplateText = templateText.toString();

            if(strTemplateText.substring(strTemplateText.length()-2,strTemplateText.length()).equals("\r\n")) {
                strTemplateText = strTemplateText.substring(0, strTemplateText.length()-2);
            }

            String resultChunkText = getChunkResultText(strTemplateText, map);
            chunksMap.put(chunkAlias, resultChunkText);
        }

        return chunksMap;
    }


    public HashMap<String, String> getMap(Path pathToTemplate, HashMap<String, String> replacementMap) throws Exception {

        HashMap<String, String> chunksMap = getChunksMap(pathToTemplate, replacementMap);
        HashMap<String, String> resultMap = (HashMap<String, String>) replacementMap.clone();
        resultMap.putAll(chunksMap);

        return resultMap;
    }
}
