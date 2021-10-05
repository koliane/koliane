package core.application.specifications;

import java.util.List;
import java.util.Map;

public class SpecificationHelper {
    public static String buildHelp(Map commandMap){
        if (commandMap.get(SpecificationKeys.HELP_FIELD) == null) {
            return "";
        }

        Object helpValue = commandMap.get(SpecificationKeys.HELP_FIELD);

        if(helpValue instanceof String) {
            return helpValue + "\r\n";
        }

        String result = "";

        if(helpValue instanceof List) {
            int size = ((List<?>) helpValue).size();
            for(int i=0; i < size; i++) {
                String row = (String) ((List<?>) helpValue).get(i);
                result += row + "\r\n";
            }

            return result;
        }

        if(helpValue instanceof Map) {
            for(Map.Entry<?, ?> pair : ((Map<?, ?>) helpValue).entrySet()) {
                String key = (String) pair.getKey();
                String value = (String) pair.getValue();
                result += key + ": " + value + "\r\n";
            }

            return result;
        }

        return result;
    }
}
