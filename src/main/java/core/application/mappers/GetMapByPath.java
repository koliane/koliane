package core.application.mappers;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;

public interface GetMapByPath {
    HashMap<String, String> getMap(Path pathToTemplate, HashMap<String, String> replacementMap) throws Exception;
}
