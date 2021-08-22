package core.infrastructure;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathHelper {
    private static Path programDirectory;

    public static Path getProgramDirectory() throws Exception {
        if(programDirectory == null) {
            programDirectory = Paths.get(ProgramDirectoryUtilities.getProgramDirectory());
        }
        return programDirectory;
    }

    public static Path getResourcesDirectory() throws Exception {
        Path programDirectory = getProgramDirectory();

        return programDirectory.resolve(Paths.get("src/main/resources"));
    }

    public static Path getDefaultTemplateDirectory() throws Exception {
        return getResourcesDirectory().resolve(Paths.get("default"));
    }
}
