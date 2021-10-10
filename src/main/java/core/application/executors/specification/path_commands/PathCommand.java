package core.application.executors.specification.path_commands;

import java.nio.file.Path;

public abstract class PathCommand {
    protected Path path;

    public PathCommand(){}

    public PathCommand(Path path) {
        this.path = path;
    }

    public Path getPath() {
        return path;
    }

    public void setPath(Path path) throws Exception {
        if(path.isAbsolute()) {
            throw new Exception("Путь до файлов в спецификации должен быть относительным." + path);
        }

        this.path = path;
    }
}
