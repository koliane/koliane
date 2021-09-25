package core.application.mappers;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;

public interface ScenarioImplInterface {
    HashMap<String, String> getChunksMap(Path pathToTemplate) throws Exception;
    HashMap<String, String> getMap(Path pathToTemplate) throws Exception;
}
