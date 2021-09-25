package core.application.mappers;

import core.application.Placeholders;

import java.util.HashMap;

abstract public class BaseOptionsMapper {
    protected static final String PROJECT_NAME = Placeholders.PROJECT_NAME;
    protected String projectName;

    BaseOptionsMapper(String projectName) {
        this.projectName = projectName;
    }

    public HashMap<String, String> getBaseMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put(PROJECT_NAME, projectName);

        return map;
    }
}
