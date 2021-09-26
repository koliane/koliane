package core.infrastructure.antlr.contexts;

import java.util.ArrayList;
import java.util.HashMap;

public class PlaceholdersContextsStorage extends ContextsStorage<PlaceholderContext> {
    HashMap<String, ArrayList<Integer>> placeholderRuleIdsMap = new HashMap<>();

    public void initPlaceholderRuleIdsMap() {
        for (Context context: contexts) {
            PlaceholderContext placeholderContext = (PlaceholderContext)context;
//            placeholderRuleIdsMap.put(placeholderContext.getName(), placeholderContext.getNestedRulesIds());
            placeholderRuleIdsMap.put(placeholderContext.getName(), placeholderContext.getAllContextsRulesIds());
        }
    }

    public HashMap<String, ArrayList<Integer>> getPlaceholderRuleIdsMap() {
        return placeholderRuleIdsMap;
    }

    public PlaceholderContext getContextByName(String name) throws Exception {
        for (Context context: contexts) {
            PlaceholderContext placeholderContext = (PlaceholderContext)context;
            if(placeholderContext.getName().equals(name)) {
                return placeholderContext;
            }
        }

        throw new Exception("Нет контекста с именем: " + name);
    }
}
