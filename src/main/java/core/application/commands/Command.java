package core.application.commands;


import java.nio.file.Path;

abstract public class Command extends BaseCommand {
    protected Path pathToProject;

    public Path getPathToProject() {
        return pathToProject;
    }
}
