package core.infrastructure.antlr.contexts;

import core.infrastructure.antlr.Placeholder;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.Collections;

public class PlaceholderContext extends Context {
    private final Placeholder placeholder;

    public PlaceholderContext(String name) {
        placeholder = new Placeholder(name);
    }

    public String getName() {
        return placeholder.getName();
    }

    public Placeholder getPlaceholder() {
        return placeholder;
    }
}
