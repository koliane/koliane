package core.application.commands.specification_command;

import core.application.commands.BaseCommand;
import core.application.commands.Command;

import java.nio.file.Path;
import java.util.Map;

public class SpecificationCommand extends Command {
    private final Path pathToProject;

    public SpecificationCommand(String name, Path pathToProject, Path pathToSpecification, Map<String, String> options) throws Exception {
        super(name, pathToSpecification, options);

        if(!pathToProject.isAbsolute()) {
            throw new Exception("Путь до проекта должен быть абсолютным. " + pathToProject);
        }

        this.pathToProject = pathToProject;
    }

    public Path getPathToProject() {
        return pathToProject;
    }
}
