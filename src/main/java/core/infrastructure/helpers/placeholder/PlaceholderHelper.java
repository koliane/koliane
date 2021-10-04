package core.infrastructure.helpers.placeholder;

import core.infrastructure.helpers.StringHelper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract public class PlaceholderHelper {
    public static final String PLACEHOLDER_AVAILABLE_SYMBOLS_REGEX = "[a-zA-Z0-9_]";

    private final String aliasPrefix;
    private final String aliasPostfix;

    public PlaceholderHelper(String aliasPrefix, String aliasPostfix) {
        this.aliasPrefix = aliasPrefix;
        this.aliasPostfix = aliasPostfix;
    }

    public String buildPlaceholder(String serviceWord) {
        return aliasPrefix + serviceWord + aliasPostfix;
    }

    public String getClearedPlaceholder(String serviceWord) {
        String result = serviceWord.trim();
        result = result.replaceAll("^" + aliasPrefix, "");

        return result.replaceAll(aliasPostfix + "$", "");
    }

    public boolean hasPlaceholder(String text) {
        String defaultSymbolsPattern = PLACEHOLDER_AVAILABLE_SYMBOLS_REGEX + "*";
        Pattern pattern = Pattern.compile(
            defaultSymbolsPattern
            + aliasPrefix
            + defaultSymbolsPattern
            + aliasPostfix
            + defaultSymbolsPattern
        );
        Matcher matcher = pattern.matcher(text);

        return matcher.find();
    }

    public boolean isPlaceholder(String text) {
        return text.startsWith(aliasPrefix) && text.endsWith(aliasPostfix);
    }

    public String getBeforePlaceholderText(String text) {
        String strPattern = "^("+ PLACEHOLDER_AVAILABLE_SYMBOLS_REGEX +"*?)" + aliasPrefix;
        return getRegexFirstGroupText(text, strPattern);
    }

    public String getAfterPlaceholderText(String text) {
        String strPattern = aliasPostfix + "("+ PLACEHOLDER_AVAILABLE_SYMBOLS_REGEX +"*?)$";
        return getRegexFirstGroupText(text, strPattern);
    }


    private String getRegexFirstGroupText(String text, String strPattern) {
        Pattern pattern = Pattern.compile(strPattern);
        Matcher matcher = pattern.matcher(text);

        String result = "";
        if(matcher.find()) {
            result = matcher.group(1);
        }

        return result;
    }

    public List<String> getClearedPlaceholders(String text) {
        List<String> placeholders = getPlaceholders(text);
        List<String> result = new ArrayList<>();

        for(String placeholder: placeholders) {
            result.add(getClearedPlaceholder(placeholder));
        }

        return result;
    }

    public List<String> getPlaceholders(String text) {
        String defaultSymbolsPattern = PLACEHOLDER_AVAILABLE_SYMBOLS_REGEX + "*";
        Pattern pattern = Pattern.compile(
            defaultSymbolsPattern
            + "("
            + aliasPrefix
            + defaultSymbolsPattern
            + aliasPostfix
            + ")"
            + defaultSymbolsPattern
        );
        Matcher matcher = pattern.matcher(text);

        List<String> result = new ArrayList<>();
        while(matcher.find()) {
            result.add(matcher.group(1));
        }

        return result;
    }

    public String replaceAllPlaceholders(String text, Map<String, String> options) {
        for(Map.Entry<String, String> pair: options.entrySet()) {
            String key = pair.getKey();
            String optionValue = pair.getValue();
            String replacementWord = buildPlaceholder(key);
            text = text.replaceAll(replacementWord, optionValue);
        }

        return text;
    }

    public String replaceAllPlaceholdersToSnakeCase(String text, Map<String, String> options) {
        List<String> placeholders = getPlaceholders(text);
        for(String placeholder: placeholders) {
            String clearedPlaceholder = getClearedPlaceholder(placeholder);
            String replacementText = options.get(clearedPlaceholder);
            replacementText = StringHelper.toSnakeCase(replacementText);

            text = text.replaceAll(placeholder, replacementText);
        }

        return text;
    }
}
