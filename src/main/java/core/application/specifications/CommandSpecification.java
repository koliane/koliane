package core.application.specifications;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CommandSpecification {
    private String name;
    private String help;
    private List<String> createStrPaths;
    private List<String> updateStrPaths;

    public CommandSpecification(String name, Map commandMap) {
        this.name = name;
        if (commandMap.get(SpecificationKeys.HELP_FIELD) != null) {
            this.help = (String) commandMap.get(SpecificationKeys.HELP_FIELD);
        }

        this.createStrPaths = commandMap.get(SpecificationKeys.CREATING_PATHS_FIELD) == null
                ? new ArrayList<>()
                : (List<String>) commandMap.get(SpecificationKeys.CREATING_PATHS_FIELD)
        ;

        this.updateStrPaths = commandMap.get(SpecificationKeys.UPDATING_PATHS_FIELD) == null
                ? new ArrayList<>()
                : (List<String>) commandMap.get(SpecificationKeys.UPDATING_PATHS_FIELD)
        ;

    }

    public List<String> getCreateStrPaths() {
        return createStrPaths;
    }

    public List<String> getUpdateStrPaths() {
        return updateStrPaths;
    }
}
