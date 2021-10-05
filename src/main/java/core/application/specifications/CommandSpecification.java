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
        this.help = buildHelp(commandMap);

        this.createStrPaths = commandMap.get(SpecificationKeys.CREATING_PATHS_FIELD) == null
                ? new ArrayList<>()
                : (List<String>) commandMap.get(SpecificationKeys.CREATING_PATHS_FIELD)
        ;

        this.updateStrPaths = commandMap.get(SpecificationKeys.UPDATING_PATHS_FIELD) == null
                ? new ArrayList<>()
                : (List<String>) commandMap.get(SpecificationKeys.UPDATING_PATHS_FIELD)
        ;

    }

    private String buildHelp(Map commandMap) {
        String result = SpecificationHelper.buildHelp(commandMap);
        if(result.isEmpty()) {
            return "...\r\n";
        }

        return result;
    }

    public List<String> getCreateStrPaths() {
        return createStrPaths;
    }

    public List<String> getUpdateStrPaths() {
        return updateStrPaths;
    }

    public String getHelp() {
        return help;
    }
}
