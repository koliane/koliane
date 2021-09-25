package core.application.mappers;

import java.util.HashMap;
import java.util.Map;

public class OptionsMapper extends BaseOptionsMapper {
//    public static final String PROJECT_NAME = "PROJECT_NAME";
//
//    private String projectName;

    public OptionsMapper(String projectName){
        super(projectName);
    }

    protected HashMap<String, String> createOptionsMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put(PROJECT_NAME, projectName);

        return map;
    }

//    public void setProjectName(String projectName) {
//        this.projectName = projectName;
//    }



    public boolean isExists(String optionName) {
        HashMap<String, String> map = createOptionsMap();

        return map.containsKey(optionName);
    }

    public String getOption(String optionName) throws Exception {
        HashMap<String, String> map = createOptionsMap();
        if(!map.containsKey(optionName)) {
            throw new Exception("Нет такой опции: " + optionName);
        }

        return map.get(optionName);
    }

    public HashMap<String, String> getMap() {
        return createOptionsMap();
    }
}
