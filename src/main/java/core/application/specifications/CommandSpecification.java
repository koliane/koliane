package core.application.specifications;

import core.application.executors.specification.path_commands.CreatePathCommand;
import core.application.executors.specification.path_commands.UpdatePathCommand;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CommandSpecification {
    private String name;
    private String help;
    private String createDefaultMode;
    private List<CreatePathCommand> createPathsCommands;
    private List<UpdatePathCommand> updatePathsCommands;


    public CommandSpecification(String name, Map commandMap) throws Exception {
        this.name = name;
        this.help = buildHelp(commandMap);
        this.createDefaultMode = commandMap.get(SpecificationKeys.CREATE_DEFAULT_MODE_FIELD) == null
                ? SpecificationKeys.FORCE_CREATE_MODE_VALUE
                : (String) commandMap.get(SpecificationKeys.CREATE_DEFAULT_MODE_FIELD)
        ;

        this.createPathsCommands = commandMap.get(SpecificationKeys.CREATING_PATHS_FIELD) == null
                ? new ArrayList<>()
                : buildCreatePathsCommandsList( (List) commandMap.get(SpecificationKeys.CREATING_PATHS_FIELD))
        ;

        this.updatePathsCommands = commandMap.get(SpecificationKeys.CREATING_PATHS_FIELD) == null
                ? new ArrayList<>()
                : buildUpdatePathsCommandsList( (List) commandMap.get(SpecificationKeys.UPDATING_PATHS_FIELD))
        ;


    }

    private List<CreatePathCommand> buildCreatePathsCommandsList(List createItems) throws Exception {
        List<CreatePathCommand> items = new ArrayList<>();

        int size = createItems.size();
        for(int i=0; i < size; i++) {
            CreatePathCommand pathCommand = new CreatePathCommand();
            Object item = createItems.get(i);

            if(item instanceof String) {
                pathCommand = createPathCommandFromText((String) item);
            } else if(item instanceof Map) {
                pathCommand = createPathCommandFromMap((Map<String, String>) item);
            }

            if(pathCommand.getPath() == null) {
                throw new Exception("Путь не указан");
            }

            if(pathCommand.getMode() == null) {
                pathCommand.setMode(createDefaultMode);
            }

            items.add(pathCommand);
        }

        return items;
    }

    private CreatePathCommand createPathCommandFromText(String text) {
        CreatePathCommand pathCommand = new CreatePathCommand();
        String[] itemParts = text.split(" ");
        Path path;

        int itemPartsSize = itemParts.length;
        for(int i=0; i < itemPartsSize;i++) {
            String itemPart = itemParts[i].trim();

            if(itemPart.equals(SpecificationKeys.FORCE_CREATE_MODE_VALUE)) {
                pathCommand.setForceMode();
                continue;
            }

            if(itemPart.equals(SpecificationKeys.SOFT_CREATE_MODE_VALUE)) {
                pathCommand.setSoftMode();
                continue;
            }

            try {
                path = Paths.get(itemPart);
                pathCommand.setPath(path);
            } catch (Exception e) {}
            finally {
                continue;
            }
        }

        return pathCommand;
    }

    private CreatePathCommand createPathCommandFromMap(Map<String, String> item) throws Exception {
        CreatePathCommand pathCommand = new CreatePathCommand();

        if( item.get(SpecificationKeys.PATH_COMMAND_PATH_FIELD) == null) {
            throw new Exception("Нет обязательноко ключа " + SpecificationKeys.PATH_COMMAND_PATH_FIELD
                    + "; " + item
            );
        }
        Path path = Paths.get(item.get(SpecificationKeys.PATH_COMMAND_PATH_FIELD));
        pathCommand.setPath(path);

        if(item.get(SpecificationKeys.PATH_COMMAND_MODE_FIELD) != null) {
            String mode = item.get(SpecificationKeys.PATH_COMMAND_MODE_FIELD);
            pathCommand.setMode(mode.trim());
        }

        return pathCommand;
    }

    private List<UpdatePathCommand> buildUpdatePathsCommandsList(List updateItems) {
        List<UpdatePathCommand> items = new ArrayList<>();

        int size = updateItems.size();
        for(int i=0; i < size; i++) {
            String item = (String) updateItems.get(i);
            Path path = Paths.get(item.trim());

            items.add(new UpdatePathCommand(path));
        }

        return items;
    }

    private String buildHelp(Map commandMap) {
        String result = SpecificationHelper.buildHelp(commandMap);
        if(result.isEmpty()) {
            return "...\r\n";
        }

        return result;
    }

    public List<CreatePathCommand> getCreatePathsCommands() {
        return createPathsCommands;
    }

    public List<UpdatePathCommand> getUpdatePathsCommands() {
        return updatePathsCommands;
    }

    public String getHelp() {
        return help;
    }
}
