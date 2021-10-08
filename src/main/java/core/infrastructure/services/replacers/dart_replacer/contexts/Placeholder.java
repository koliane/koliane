package core.infrastructure.services.replacers.dart_replacer.contexts;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Placeholder {
    private final String name;

    public Placeholder(String name) {
        this.name = name;
    }

    public boolean isTopAttaching() {
        Pattern pattern = Pattern.compile("_TOP_ATTACHING_");
        Matcher matcher = pattern.matcher(name);

        return matcher.find();
    }

    public boolean isBottomAttaching() {
        Pattern pattern = Pattern.compile("_BOTTOM_ATTACHING_");
        Matcher matcher = pattern.matcher(name);

        return matcher.find();
    }

    public String getName() {
        return name;
    }
}
