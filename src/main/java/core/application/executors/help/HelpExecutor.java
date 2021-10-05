package core.application.executors.help;

import core.application.CommandRequest;
import core.application.commands.help_command.HelpCommand;
import core.application.executors.BaseExecutor;

import java.util.*;

/**
 * Вывод списка доступных команд (в алфавитном порядке)
 */
public class HelpExecutor extends BaseExecutor<HelpCommand> {
    public HelpExecutor(HelpCommand inputCommand) throws Exception {
        super(inputCommand);
    }

    @Override
    public void exec() throws Exception {
        String commonHelp = specification.getCommonHelp();
        if(!commonHelp.isEmpty()) {
            System.out.println(commonHelp);
            System.out.println("==============================================");
        }

        Map<String, String> helps = specification.getHelps();
        List<String> commands = new ArrayList<>(helps.keySet());
        commands.add(CommandRequest.HELP_COMMAND_NAME);
        Collections.sort(commands);

        int size = commands.size();
        for (int i = 0; i < size; i++) {
            String commandName = commands.get(i);

            if(commandName.equals(CommandRequest.HELP_COMMAND_NAME)) {
                System.out.printf("[%s]\r\nCправочник по командам\r\n\r\n", CommandRequest.HELP_COMMAND_NAME);
            } else {
                String helpText = helps.get(commandName);
                System.out.printf("[%s]\r\n%s\r\n", commandName, helpText);
            }
        }
    }


}
