package core.infrastructure.helpers;


public class ReplacementHelper {
    public static final String ALIAS_PREFIX = "#-";
    public static final String ALIAS_POSTFIX = "-#";

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
}
