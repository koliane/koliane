package core.infrastructure.utils;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapUtilities {

    public static List<String> buildPathToKey(String key, Map<String, ?> map) {
        List<String> path = new ArrayList<>();

        if(map.containsKey(key)) {
            path.add(key);
            return path;
        }

        for(Map.Entry<String, ?> pair: map.entrySet()) {
            String currentKey = pair.getKey();
            Object value = pair.getValue();
            if(!(value instanceof Map)) {
                continue;
            }

            path.addAll(buildPathToKey(key, (Map<String, ?>) value));
        }

        return path;
    }

    public static Object getMapValueByPath(Map<String, ?> map, List<String> path) throws Exception {
        Map<String, ?> intermediateMap = map;
        Object result = null;
//        for (String pathItemName: path){
        int size = path.size();
        for (int i = 0; i < size; i++){
            String pathItemName = path.get(i);

            if(i == size - 1 && intermediateMap instanceof Map && intermediateMap.containsKey(pathItemName)) {
                result = intermediateMap.get(pathItemName);
                break;
            }

            if(!(intermediateMap instanceof Map) || !intermediateMap.containsKey(pathItemName)) {
                throw new Exception("В Map нет ключа "+pathItemName + " для пути "+path);
            }
        }

        return result;
    }
}
