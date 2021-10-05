package core.application.commands;


import java.nio.file.Path;
import java.util.Map;

abstract public class Command extends BaseCommand {
    protected Path pathToSpecification;
    protected String name;
    protected final Map<String, String> options;

    protected Command(String name, Path pathToSpecification, Map<String, String> options) throws Exception {
        if(!pathToSpecification.isAbsolute()) {
            throw new Exception("Путь до спецификации должен быть абсолютным. " + pathToSpecification);
        }

        this.name = name;
        this.pathToSpecification = pathToSpecification;
        this.options = options;
    }


    public Path getPathToSpecification() {
        return pathToSpecification;
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getOptions() {
        return options;
    }
}
