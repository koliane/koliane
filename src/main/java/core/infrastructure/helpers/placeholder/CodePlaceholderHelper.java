package core.infrastructure.helpers.placeholder;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodePlaceholderHelper extends PlaceholderHelper {
    public CodePlaceholderHelper() {
        super("#-", "-#");
    }

    public String deleteUnusedPlaceholders(String text, Map<String, String> options) {
        List<String> unusedPlaceholders = new ArrayList<>();
        List<String> placeholders = getPlaceholders(text);

        for(String placeholder: placeholders) {
            String clearedPlaceholder = getClearedPlaceholder(placeholder);
            if(options.get(clearedPlaceholder) == null) {
                unusedPlaceholders.add(placeholder);
            }
        }

        if(unusedPlaceholders.isEmpty()) {
            return text;
        }

        for(String placeholder: unusedPlaceholders) {
            Pattern pattern = Pattern.compile(placeholder + "([ \t],?)?");
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                text = matcher.replaceAll("");
            }
        }

        return text;
    }
}
