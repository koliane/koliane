package core.application.commands.init_command;

import core.application.commands.Command;
import core.infrastructure.config.Config;

import java.nio.file.Path;

public class InitCommand extends Command {
    private final OverwriteMode overwriteMode;
//    private final String name = Config.CMD_CONSOLE_INIT_PARAM;


    public InitCommand(Path pathToProject) {
        this.pathToProject = pathToProject;
        this.overwriteMode = OverwriteMode.force;
    }

    public InitCommand(Path pathToProject, InitAttributes initAttributes) {
        this.pathToProject = pathToProject;
        this.overwriteMode = initAttributes.getOverwriteMode();
    }

//    @Override
//    public String getName() {
//        return name;
//    }

    public boolean isSoftMode() {
        return overwriteMode == OverwriteMode.soft;
    }

    public boolean isForceMode() {
        return overwriteMode == OverwriteMode.force;
    }

    public boolean isOnlyPubspecForceMode() {
        return overwriteMode == OverwriteMode.only_pubspec_force;
    }
}
