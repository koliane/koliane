package core.infrastructure.services.replacers.adding_replacer.contexts;

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
