package core.infrastructure.antlr.contexts;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.Collections;

public class PlaceholderContext extends Context {
    private String name;

    public PlaceholderContext(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
