import core.application.CommandRequest;
import core.application.Placeholders;
import core.application.PubspecYaml;
import core.application.commands.Command;
import core.application.commands.specification_command.SpecificationCommand;
import core.application.executors.specification.SpecificationExecutor;
import core.application.mappers.AddEntityOptionsMapper;
import core.application.specifications.Specification;
import core.infrastructure.config.Params;
import core.infrastructure.file.changers.FileByTemplateChanger;
import core.infrastructure.helpers.ReplacementHelper;
import core.infrastructure.helpers.StringHelper;
import core.infrastructure.helpers.placeholder.CodePlaceholderHelper;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


//long m = System.currentTimeMillis();
//System.out.println( (System.currentTimeMillis() - m));

public class Main {

    public static void main(String[] args) throws Exception {

//        String pathToChunks = "D:\\projects\\java\\koliane\\src\\main\\resources\\default\\chunks.yaml";
//        Path path = Paths.get(pathToChunks);
//        System.out.println(path);
//        System.out.println(path.getNameCount());
//        System.out.println(path.getFileName());
//        System.out.println(path.getParent());




//        Map<String, String> options = new HashMap<>();
//        options.put("placeholder", "Замена");
//        options.put("ZZZ", "Замена с запятой");
//        String text = "/#-placeholder-#/asd#-ZZZ-# , fsdf/sadf";
//        CodePlaceholderHelper codePlaceholderHelper = new CodePlaceholderHelper();
//        String newText = codePlaceholderHelper.deleteUnusedPlaceholders(text, options);
//        System.out.println(text);
//        System.out.println(newText);
//        return;


        /*

        String strPathToFile = "D:/projects/java/koliane/src/main/resources/default/test.dart";
//        String strPathToOutputFile = "D:/projects/java/koliane/src/main/resources/test2.dart";
//
        Path pathToTemplateFile = Paths.get(strPathToFile).toAbsolutePath();

        Path relativePath = Paths.get("test.dart");
//        Path pathToProject = Paths.get(Config.PATH_TO_PROGRAM_TEST_PROJECT);
        Path pathToProject = Paths.get("D:/projects/java/koliane/src/main/resources");
*/





//        CommandRequest commandRequest = new CommandRequest(args);
//        Command inputCommand = commandRequest.getCommand();


        Path pathToSpecification = Paths.get("D:/projects/java/koliane/src/main/resources/default/spec.yaml");
        Path pathToProject = Paths.get("D:\\projects\\flutter\\inject_test");
//        Specification specification = new Specification(pathToSpecification);
//        specification.getCommandByName("add_entity");

        Map options = new HashMap<>();
        String projectName = new PubspecYaml().getProjectName(pathToProject.toString());
        options.put(Placeholders.PROJECT_NAME, projectName);
        options.put("entity_name", "AuthHello");

        SpecificationCommand command = new SpecificationCommand("add_entity_method", pathToProject, pathToSpecification, options);
        SpecificationExecutor executor = new SpecificationExecutor(command);
        executor.exec();

        return;





/*
//        OptionsMapper optionsMapper = new OptionsMapper();
        AddEntityOptionsMapper optionsMapper = new AddEntityOptionsMapper("asdf", "Auth");
//        System.out.println(optionsMapper.getMap(pathToTemplateFile));

        FileByTemplateChanger fileByTemplateChanger = new FileByTemplateChanger(pathToProject, optionsMapper);
        fileByTemplateChanger.change("test.dart");



return;*/


/*
        try {


            CommandRequest commandRequest = new CommandRequest(args);
            Command command = commandRequest.getCommand();

//            InitAttributes attributes = new InitAttributes(new String[]{"--force"});
//            Command command = new InitCommand(Paths.get(Config.PATH_TO_PROGRAM_TEST_PROJECT), attributes);
//            Command command = new InitCommand(Paths.get(Config.PATH_TO_PROGRAM_TEST_PROJECT));
//            Command command = new HelpCommand();

            for (int i = 0; i < args.length; i++){
                String arg = args[i];
                System.out.println(String.format("Argument %d: %s", i, arg));
            }

            if(command instanceof InitCommand) {
                Path projectDirectoryPath = command.getPathToProject();
                OptionsMapper optionsMapper = new OptionsMapper();
                String projectName = new PubspecYaml().getProjectName(projectDirectoryPath.toString());
                optionsMapper.setProjectName(projectName);

                DefaultInitializer initializer = new DefaultInitializer((InitCommand) command, optionsMapper);
                initializer.exec();
            } else if(command instanceof HelpCommand) {
                new HelpExecutor().exec();
            }

        }catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Скрипт прерван");
        }

*/
    }
}
