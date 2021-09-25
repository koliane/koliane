package core.infrastructure.antlr.contexts;

public class ReleaseContext extends Context {
    private PlaceholderContext placeholderContext;

    public ReleaseContext(PlaceholderContext placeholderContext) {
        this.placeholderContext = placeholderContext;
    }

    public PlaceholderContext getPlaceholderContext() {
        return placeholderContext;
    }
}
