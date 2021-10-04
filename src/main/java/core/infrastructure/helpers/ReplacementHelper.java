package core.infrastructure.helpers;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplacementHelper {
//    public static final String FILE_ALIAS_PREFIX = "__";
//    public static final String FILE_ALIAS_POSTFIX = "__";
//    public static final String ALIAS_PREFIX = "#-";
//    public static final String ALIAS_POSTFIX = "-#";
//    public static final String PLACEHOLDER_AVAILABLE_SYMBOLS_REGEX = "[a-zA-Z0-9_]";

//    public static String getReplacementWord(String serviceWord) {
//        return ALIAS_PREFIX + serviceWord + ALIAS_POSTFIX;
//    }

    public static String getChunksDirectoryName(String fileName) {
        return fileName + "_chunks";
    }

//    public static String getClearedPlaceholder(String serviceWord) {
//        String result = serviceWord.trim();
//        result = result.replaceAll("^#-", "");
//        return result.replaceAll("-#$", "");
//    }

//    public static boolean hasFilePlaceholder(String text) {
//        return hasPlaceholder(text, FILE_ALIAS_PREFIX, FILE_ALIAS_POSTFIX);
//    }

//    public static boolean hasPlaceholder(String text) {
//        return hasPlaceholder(text, ALIAS_PREFIX, ALIAS_POSTFIX);
////        String defaultSymbolsPattern = PLACEHOLDER_AVAILABLE_SYMBOLS_REGEX + "*";
////        Pattern pattern = Pattern.compile(
////                defaultSymbolsPattern
////                + ALIAS_PREFIX
////                + defaultSymbolsPattern
////                + ALIAS_POSTFIX
////                + defaultSymbolsPattern
////        );
////        Matcher matcher = pattern.matcher(text);
////
////        return matcher.find();
//    }

//    private static boolean hasPlaceholder(String text, String aliasPrefix, String aliasPostfix) {
//        String defaultSymbolsPattern = PLACEHOLDER_AVAILABLE_SYMBOLS_REGEX + "*";
//        Pattern pattern = Pattern.compile(
//                defaultSymbolsPattern
//                + aliasPrefix
//                + defaultSymbolsPattern
//                + aliasPostfix
//                + defaultSymbolsPattern
//        );
//        Matcher matcher = pattern.matcher(text);
//
//        return matcher.find();
//    }

//    public static boolean isPlaceholder(String text) {
//        return text.startsWith(ALIAS_PREFIX) && text.endsWith(ALIAS_POSTFIX);
//    }

//    public static String getBeforePlaceholderText(String text) {
//        String strPattern = "^("+ PLACEHOLDER_AVAILABLE_SYMBOLS_REGEX +"*?)#-";
//        return getRegexFirstGroupText(text, strPattern);
//    }
//
//    public static String getAfterPlaceholderText(String text) {
//        String strPattern = "-#("+ PLACEHOLDER_AVAILABLE_SYMBOLS_REGEX +"*?)$";
//        return getRegexFirstGroupText(text, strPattern);
//    }


//    private static String getRegexFirstGroupText(String text, String strPattern) {
//        Pattern pattern = Pattern.compile(strPattern);
//        Matcher matcher = pattern.matcher(text);
//
//        String result = "";
//        if(matcher.find()) {
//            result = matcher.group(1);
//        }
//
//        return result;
//    }

//    public static List<String> getPlaceholders(String text) {
//        return getPlaceholders(text, ALIAS_PREFIX, ALIAS_POSTFIX);
//    }
//
//    private static List<String> getPlaceholders(String text, String aliasPrefix, String aliasPostfix) {
//        String defaultSymbolsPattern = PLACEHOLDER_AVAILABLE_SYMBOLS_REGEX + "*";
//        Pattern pattern = Pattern.compile(
//                defaultSymbolsPattern
//                + "("
//                + aliasPrefix
//                + defaultSymbolsPattern
//                + aliasPostfix
//                + ")"
//                + defaultSymbolsPattern
//        );
//        Matcher matcher = pattern.matcher(text);
//
//        List<String> result = new ArrayList<>();
//        while(matcher.find()) {
//            result.add(matcher.group(1));
//        }
//
//        return result;
//    }

//    public static String replacePlaceholders(String text, Map<String, String> options, String aliasPrefix, String aliasPostfix) {
////        Pattern pattern = Pattern.compile("");
////        Matcher matcher = pattern.matcher(text);
////        while(matcher.find()) {
////            result = matcher.group(1);
////        }
//
//        for(HashMap.Entry<String, String> pair: options.entrySet()) {
//            String key = pair.getKey();
//            String optionValue = pair.getValue();
//            String replacementWord = ReplacementHelper.getReplacementWord(key);
//            text = text.replaceAll(replacementWord, optionValue);
//        }
//
//        return text;
//    }



//    public static String isTopAttaching(String serviceWord) {
//
//    }
}
