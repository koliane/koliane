package core.infrastructure.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextUtilities {
    public static String getFirstLine(String text) {
        Pattern pattern = Pattern.compile("^(.*?)\r?\n");
        Matcher matcher = pattern.matcher(text);


        return matcher.find() ? matcher.group(1) : text;
    }

    public static String trimFirstBreakLine(String text) {
        Pattern pattern = Pattern.compile("^(\r?\n)");
        Matcher matcher = pattern.matcher(text);

        text = matcher.replaceAll("");

        return text;
    }
}
