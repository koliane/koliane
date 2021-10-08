package core.infrastructure.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormatUtilities {
    public static boolean isYaml(String text) {
        Pattern pattern = Pattern.compile(".yaml$");
        Matcher matcher = pattern.matcher(text);

        return matcher.find();
    }
}
