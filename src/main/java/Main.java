import core.application.CommandRequest;
import core.application.commands.Command;
import core.application.commands.help_command.HelpCommand;
import core.application.commands.specification_command.SpecificationCommand;
import core.application.executors.BaseExecutor;
import core.application.executors.help.HelpExecutor;
import core.application.executors.specification.SpecificationExecutor;

//long m = System.currentTimeMillis();
//System.out.println( (System.currentTimeMillis() - m));

public class Main {

    public static void main(String[] args) throws Exception {
//        System.out.println("Nanana !!!!");
//        for(int i=0; i< args.length;i++)
//            System.out.println(args[i]);
//        if(true)
//            throw new Exception("Прерывание");
//        String[] newArgs = {
//                "pd=D:\\projects\\flutter\\inject_test",
////                "pd=D:\\projects\\flutter\\temp",
//                "sd=D:\\projects\\flutter\\template\\spec.yaml",
////                "sd=D:\\projects\\java\\koliane\\src\\main\\resources\\default\\spec.yaml",
//                "add_entity_method",
////                "init",
////                "test",
////                "help",
////                "add_entity",
//                "entity_name=Auth",
//                "method_name=register",
//                "data_source=api"
//
//        };
//        CommandRequest commandRequest = new CommandRequest(newArgs);

            CommandRequest commandRequest = new CommandRequest(args);
            Command inputCommand = commandRequest.getCommand();
            BaseExecutor executor;

            if(inputCommand instanceof HelpCommand) {
                executor = new HelpExecutor((HelpCommand) inputCommand);
            } else {
                executor = new SpecificationExecutor((SpecificationCommand) inputCommand);
            }

            executor.exec();
        try{
        }catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Скрипт прерван");
        }
    }
}
