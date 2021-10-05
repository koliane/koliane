package core.application;

import core.application.commands.Command;
import core.application.commands.help_command.HelpCommand;
import core.application.commands.specification_command.SpecificationCommand;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class CommandRequest {
    private static final String PATH_TO_PROJECT_ARG = "pd";
    private static final String PATH_TO_SPECIFICATION_ARG = "sd";
    private static final String COMMAND_NAME_ARG = "cn";
    private static final String PROJECT_NAME_ARG = "PROJECT_NAME";

    public static final String HELP_COMMAND_NAME = "help";

    private Map<String, String> attributes;

    public CommandRequest(String[] args) throws Exception {
        attributes = buildAttributesMap(args);
        validateAttributes();
    }

    public Command getCommand() throws Exception {
        String commandName = attributes.get(COMMAND_NAME_ARG);
        String strPathToSpecification = attributes.get(PATH_TO_SPECIFICATION_ARG);
        Path pathToSpecification = Paths.get(strPathToSpecification);
        Map<String, String> options = buildOptions();

        switch (commandName) {
            case HELP_COMMAND_NAME:
                return new HelpCommand(commandName, pathToSpecification, options);

            default:
                String strPathToProject = attributes.get(PATH_TO_PROJECT_ARG);
                Path pathToProject = Paths.get(strPathToProject);

                return new SpecificationCommand(commandName, pathToProject, pathToSpecification, options);
        }
    }

    private Map<String, String> buildAttributesMap(String[] args) throws Exception {
        Map<String, String> result = new HashMap<>();

        int size = args.length;
        for (int i=0; i < size; i++) {
            String arg = args[i];

            String[] argPair = arg.split("=");
            int pairSize = argPair.length;

            if(pairSize > 2) {
                throw new Exception("Некорректно указан атрибут: " + arg);
            }

            if(pairSize == 1) {
                if(result.containsKey(COMMAND_NAME_ARG) && result.get(COMMAND_NAME_ARG) != null) {
                    throw new Exception("Указано более 1 команд для выполнения");
                }
                result.put(COMMAND_NAME_ARG, argPair[0]);
            } else {
                String attrName = argPair[0];
                String attrValue = argPair[1];
                if(result.containsKey(attrName) && result.get(attrName) != null) {
                    throw new Exception("Указано несколько аттрибутов с одинаковыми именами: name = " + attrName);
                }
                result.put(attrName, attrValue);
            }
        }

        return result;
    }

    private void validateAttributes() throws Exception {
        if(attributes.size() < 3) {
            throw new Exception("Передано менее 3ех параметров");
        }

        if(!attributes.containsKey(PATH_TO_PROJECT_ARG) || attributes.get(PATH_TO_PROJECT_ARG) == null) {
            throw new Exception("Не указан путь до рабочего проекта. Аттрибут " + PATH_TO_PROJECT_ARG);
        }

        if(!attributes.containsKey(PATH_TO_PROJECT_ARG) || attributes.get(PATH_TO_PROJECT_ARG) == null) {
            throw new Exception("Не указан путь до файла спецификации. Аттрибут " + PATH_TO_SPECIFICATION_ARG);
        }

        if(!attributes.containsKey(COMMAND_NAME_ARG) || attributes.get(COMMAND_NAME_ARG) == null) {
            throw new Exception("Не указано название команды для выполнения. Аттрибут " + COMMAND_NAME_ARG
                    + " (или без указания имени аттрибута, т.е. без символа '=')");
        }
    }

    private Map<String, String> buildOptions() {
        String[] skipArgs = {
            PATH_TO_PROJECT_ARG,
            PATH_TO_SPECIFICATION_ARG,
            COMMAND_NAME_ARG
        };

        Set<String> skipArgsSet = new HashSet<>(Arrays.asList(skipArgs));
        Map<String, String> result = new HashMap<>();

        for (Map.Entry<String, String> pair: attributes.entrySet()) {
            String name = pair.getKey();
            String value = pair.getValue();

            if(skipArgsSet.contains(name)) {
                continue;
            }

            result.put(name, value);
        }

        // Добавим PROJECT_NAME
        if(!result.containsKey(PROJECT_NAME_ARG)) {
            try {
                String projectName = new PubspecYaml()
                        .getProjectName(attributes.get(PATH_TO_PROJECT_ARG));
                result.put(PROJECT_NAME_ARG, projectName);
            }catch (Exception e) {
                System.out.println("Не удалось из pubspec.yaml получить имя проекта");
            }
        }

        return result;
    }
}