package core.application.commands.specification_command;

import core.application.commands.BaseCommand;

import java.nio.file.Path;
import java.util.Map;

public class SpecificationCommand extends BaseCommand {
    private final String name;
    private final Path pathToProject;
    private final Path pathToSpecification;
    private final Map<String, String> options;

    public SpecificationCommand(String name, Path pathToProject, Path pathToSpecification, Map<String, String> options) throws Exception {
        if(!pathToProject.isAbsolute()) {
            throw new Exception("Путь до проекта должен быть абсолютным. " + pathToProject);
        }
        if(!pathToSpecification.isAbsolute()) {
            throw new Exception("Путь до спецификации должен быть абсолютным. " + pathToSpecification);
        }

        this.name = name;
        this.pathToProject = pathToProject;
        this.pathToSpecification = pathToSpecification;
        this.options = options;
    }

    public String getName() {
        return name;
    }

    public Path getPathToProject() {
        return pathToProject;
    }

    public Path getPathToSpecification() {
        return pathToSpecification;
    }

    public Map<String, String> getOptions() {
        return options;
    }
}
