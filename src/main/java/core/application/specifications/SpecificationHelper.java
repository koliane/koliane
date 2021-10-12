package core.application.specifications;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class SpecificationHelper {
    public static String buildHelp(Map commandMap){
        String result = "";

        Object helpValue = commandMap.get(SpecificationKeys.HELP_FIELD);

        if(helpValue instanceof String) {
            result += helpValue + "\r\n";

        } else if(helpValue instanceof List) {
            int size = ((List<?>) helpValue).size();
            for(int i=0; i < size; i++) {
                String row = (String) ((List<?>) helpValue).get(i);
                result += row + "\r\n";
            }


        } if(helpValue instanceof Map) {
            for(Map.Entry<?, ?> pair : ((Map<?, ?>) helpValue).entrySet()) {
                String key = (String) pair.getKey();
                String value = (String) pair.getValue();
                result += key + ": " + value + "\r\n";
            }
        }

        // приведем placeholders к строке
        if(commandMap.get(SpecificationKeys.PLACEHOLDERS_FIELD) != null
                && commandMap.get(SpecificationKeys.PLACEHOLDERS_FIELD) instanceof Map
        ) {
            result += buildPlaceholdersHelp((Map<String, String>) commandMap.get(SpecificationKeys.PLACEHOLDERS_FIELD));
        }

        if (commandMap.get(SpecificationKeys.HELP_FIELD) == null) {
            return result;
        }

        return result;
    }

    private static String buildPlaceholdersHelp(Map<String, String> placeholdersMap) {
        String result = "";
        List<String> placeholders = new ArrayList<>(placeholdersMap.keySet());
        if(placeholders.isEmpty()) {
            return "";
        }
        Collections.sort(placeholders);


        int size = placeholders.size();
        result += "Плейсхолдеры:\r\n";

        for (int i = 0; i < size; i++) {
            String placeholderName = placeholders.get(i);
            String placeholderDesc = placeholdersMap.get(placeholderName) == null
                    ? ""
                    : placeholdersMap.get(placeholderName);
            result += " - " + placeholderName + ": " + placeholderDesc + "\r\n";
        }

//        result += "\r\n";

        return result;
    }
}
