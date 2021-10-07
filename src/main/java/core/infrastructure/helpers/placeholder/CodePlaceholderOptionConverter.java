package core.infrastructure.helpers.placeholder;

import core.infrastructure.helpers.placeholder.placeholder_options_rules.BaseRule;

import java.util.*;

public class CodePlaceholderOptionConverter {
    /**
     * Разделитель между разными опциями
     */
    public static final String SPLIT_OPTIONS_SYMBOL = ";";

    /**
     * Разделитель, для того, чтобы отделить название опции от значения.
     * Может быть также и только название опции
     */
    public static final String SPLIT_OPTION_PARTS_SYMBOL = "=";

    /**
     * Значение опции является массивом, поэтому, нужен разделитель между значениями этого массива
     */
    public static final String SPLIT_OPTION_FLAGS_SYMBOL = ",";

    private final List<BaseRule> convertRules;


    private final String inputOptionValue;

    private final Map<String, List<String>> flagsMap;

    public CodePlaceholderOptionConverter(String inputOptionValue, String strPlaceholderFlags, List<BaseRule> convertRules) {
        this.inputOptionValue = inputOptionValue;
        this.flagsMap = strFlagsToMap(strPlaceholderFlags);
        this.convertRules = convertRules;
    }

    public String convert() {
        String result = inputOptionValue;

        for(Map.Entry<String, List<String>> pair: flagsMap.entrySet()) {
            String placeholderOptionName = pair.getKey();
            List<String> placeholderFlags = pair.getValue();

            for(BaseRule convertRule: convertRules) {
                if(!convertRule.isSuitable(placeholderOptionName)) {
                    continue;
                }

                result = convertRule.convert(result, placeholderFlags);
            }

        }

        return result;
    }

    private Map<String, List<String>> strFlagsToMap(String strOptions) {
        Map<String, List<String>> result = new HashMap<>();
        String[] options = strOptions.split(SPLIT_OPTIONS_SYMBOL);
        int size = options.length;
        for(int i = 0; i < size; i++) {
            String option = options[i];
            String[] optionParts = option.split(SPLIT_OPTION_PARTS_SYMBOL);
            String optionName = optionParts[0];
            int pairSize = optionParts.length;

            if(pairSize == 1) {
                result.put(optionName, new ArrayList<>());
                continue;
            }

            String strPlaceholderFlags = optionParts[1];
            String[] flags = strPlaceholderFlags.split(SPLIT_OPTION_FLAGS_SYMBOL);
            result.put(optionName, new ArrayList<>(Arrays.asList(flags)));
        }

        return result;
    }
}
