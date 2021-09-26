package core.infrastructure.helpers;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplacementHelper {
    public static final String ALIAS_PREFIX = "#-";
    public static final String ALIAS_POSTFIX = "-#";
    public static final String PLACEHOLDER_AVAILABLE_SYMBOLS_REGEX = "[a-zA-Z0-9_]";

    public static String getReplacementWord(String serviceWord) {
        return ALIAS_PREFIX + serviceWord + ALIAS_POSTFIX;
    }

    public static String getChunksDirectoryName(String fileName) {
        return fileName + "_chunks";
    }

    public static String getClearedPlaceholder(String serviceWord) {
        String result = serviceWord.trim();
        result = result.replaceAll("^#-", "");
        return result.replaceAll("-#$", "");
    }

    public static boolean hasPlaceholder(String text) {
        String defaultSymbolsPattern = PLACEHOLDER_AVAILABLE_SYMBOLS_REGEX + "*";
        Pattern pattern = Pattern.compile(
                defaultSymbolsPattern
                + ALIAS_PREFIX
                + defaultSymbolsPattern
                + ALIAS_POSTFIX
                + defaultSymbolsPattern
        );
        Matcher matcher = pattern.matcher(text);

        return matcher.find();
    }

    public static boolean isPlaceholder(String text) {
        return text.startsWith(ALIAS_PREFIX) && text.endsWith(ALIAS_POSTFIX);
    }

    public static String getBeforePlaceholderText(String text) {
        String strPattern = "^("+ PLACEHOLDER_AVAILABLE_SYMBOLS_REGEX +"*?)#-";
        return getRegexFirstGroupText(text, strPattern);
    }

    public static String getAfterPlaceholderText(String text) {
        String strPattern = "-#("+ PLACEHOLDER_AVAILABLE_SYMBOLS_REGEX +"*?)$";
        return getRegexFirstGroupText(text, strPattern);
    }


    private static String getRegexFirstGroupText(String text, String strPattern) {
        Pattern pattern = Pattern.compile(strPattern);
        Matcher matcher = pattern.matcher(text);

        String result = "";
        if(matcher.find()) {
            result = matcher.group(1);
        }

        return result;
    }



//    public static String isTopAttaching(String serviceWord) {
//
//    }
}
