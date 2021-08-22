package core.application;

import core.application.commands.Command;
import core.application.commands.help_command.HelpCommand;
import core.application.commands.init_command.InitAttributes;
import core.application.commands.init_command.InitCommand;
import core.infrastructure.config.Params;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class CommandRequest {

    private final Command command;

    public CommandRequest(String[] args) throws Exception {
        validatePrimaryParams(args);

        String strPathToProject = args[0].replaceFirst("^" + Params.PATH_PARAM + "=", "");
        Path pathToProject = Paths.get(strPathToProject).toAbsolutePath();

        String commandName = args[1];
        String[] attributesArguments = Arrays.copyOfRange(args, 2, args.length);

        switch (commandName) {
            case Params.INIT_COMMAND:
                InitAttributes initAttributes = new InitAttributes(attributesArguments);
                command = new InitCommand(pathToProject, initAttributes);
                return;
            case Params.HELP_COMMAND:
                command = new HelpCommand();
                return;
        }

        throw new Exception("Попытка вызова несуществующей команды");
    }

    private void validatePrimaryParams(String[] args) throws Exception {
        if(args.length < 2){
            throw new Exception("Передано менее 2ух параметров");
        }

        boolean isPwd = args[0].startsWith(Params.PATH_PARAM + "=");

        if(!isPwd) {
            String message = "Первый аргумент должен быть "
                    + Params.PATH_PARAM
                    + "; Передан: " + args[0];

            throw new Exception(message);
        }
    }

    public Command getCommand() {
        return command;
    }

    public boolean hasCommand() {
        return command != null;
    }
}