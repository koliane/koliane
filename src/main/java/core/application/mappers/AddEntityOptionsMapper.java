package core.application.mappers;

import core.application.Placeholders;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;

public class AddEntityOptionsMapper extends ScenarioOptionsMapper implements ScenarioImplInterface {
    public static final String ENTITY_NAME = Placeholders.ENTITY_NAME;

    private String entityName;

    public AddEntityOptionsMapper(String projectName, String entityName) {
        super(projectName, ScenariosEnum.add_entity);

        this.entityName = entityName;
    }

    public HashMap<String, String> getMap(Path pathToTemplate) throws Exception {
        HashMap<String, String> map = getBaseMap();
        map.put(ENTITY_NAME, entityName);

        return super.getMap(pathToTemplate, map);
    }

    public HashMap<String, String> getChunksMap(Path pathToTemplate) throws Exception {
        HashMap<String, String> map = getBaseMap();
        map.put(ENTITY_NAME, entityName);

        return super.getChunksMap(pathToTemplate, map);
    }
}
