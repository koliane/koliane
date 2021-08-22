import core.application.CommandRequest;
import core.application.OptionsMapper;
import core.application.PubspecYaml;
import core.application.commands.Command;
import core.application.commands.help_command.HelpCommand;
import core.application.commands.init_command.InitCommand;
import core.application.executors.help.HelpExecutor;
import core.application.executors.initializer.DefaultInitializer;

import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {

        try {


            CommandRequest commandRequest = new CommandRequest(args);
            Command command = commandRequest.getCommand();

//            InitAttributes attributes = new InitAttributes(new String[]{"--force"});
//            Command command = new InitCommand(Paths.get(Config.PATH_TO_PROGRAM_TEST_PROJECT), attributes);
//            Command command = new InitCommand(Paths.get(Config.PATH_TO_PROGRAM_TEST_PROJECT));
//            Command command = new HelpCommand();

//            for (int i = 0; i < args.length; i++){
//                String arg = args[i];
//                System.out.println(String.format("Argument %d: %s", i, arg));
//            }

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


    }
}
