package core.application.executors.initializer;

import core.application.mappers.OptionsMapper;
import core.application.executors.BaseExecutor;

import java.nio.file.Path;

abstract public class BaseInitializer extends BaseExecutor {
    protected final Path pathToProject;
    protected final OptionsMapper optionsMapper;

    BaseInitializer(Path pathToProject, OptionsMapper optionsMapper) {
        this.pathToProject = pathToProject;
        this.optionsMapper = optionsMapper;
    }
}
