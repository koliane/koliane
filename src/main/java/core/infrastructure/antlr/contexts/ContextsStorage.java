package core.infrastructure.antlr.contexts;

import java.util.ArrayList;

public class ContextsStorage <T>{
    protected ArrayList<T> contexts = new ArrayList<>();

    public void add(T ctx) {
        contexts.add(ctx);
    }

    public ArrayList<T> getContexts() {
        return contexts;
    }

    public int size() {
        return contexts.size();
    }
}
