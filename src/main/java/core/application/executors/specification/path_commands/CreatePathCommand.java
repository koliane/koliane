package core.application.executors.specification.path_commands;

import core.application.specifications.SpecificationKeys;

import java.nio.file.Path;

public class CreatePathCommand extends PathCommand {
    private static final String FORCE_MODE = "FORCE_MODE";
    private static final String SOFT_MODE = "SOFT_MODE";

    protected String mode;

    public CreatePathCommand() {

    }
    public CreatePathCommand(Path path) {
        super(path);
        mode = FORCE_MODE;
    }

    public CreatePathCommand(Path path, String mode) {
        super(path);

        this.mode = mode;
    }

    public CreatePathCommand(Path path, boolean isForceMode) {
        super(path);

        mode = isForceMode ? FORCE_MODE : SOFT_MODE;
    }

    public boolean isForceMode() {
        return mode.equals(SpecificationKeys.FORCE_CREATE_MODE_VALUE);
    }

    public boolean isSoftMode() {
        return mode.equals(SpecificationKeys.SOFT_CREATE_MODE_VALUE);
    }

    public void setForceMode() {
        mode = FORCE_MODE;
    }

    public void setSoftMode() {
        mode = SOFT_MODE;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getMode() {
        return mode;
    }
}
