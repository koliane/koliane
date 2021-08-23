package core.application.executors.help;

import core.application.executors.BaseExecutor;
import core.application.executors.initializer.DefaultInitializer;
import core.infrastructure.config.Params;

public class HelpExecutor extends BaseExecutor {
    public static String help() {
        return Params.HELP_COMMAND
                + " - справочник по командам\r\n"
                ;
    }

    @Override
    public void exec() {
        String[] helpers = new String[]{
            DefaultInitializer.help(),
            HelpExecutor.help(),
        };

        for(String help: helpers){
            System.out.println(help);
        }
    }


}
