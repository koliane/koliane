package core.application.commands.help_command;

import core.application.commands.Command;

import java.nio.file.Path;
import java.util.Map;

public class HelpCommand extends Command {
    public HelpCommand(String name, Path pathToSpecification, Map<String, String> options) throws Exception {
        super(name, pathToSpecification, options);
    }
}
