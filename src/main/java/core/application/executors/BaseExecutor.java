package core.application.executors;


import core.application.commands.Command;
import core.application.specifications.Specification;

abstract public class BaseExecutor<T extends Command> {
    /**
     * Команда из консоли
     */
    protected T inputCommand;

    /**
     * Спецификация из файла .yaml
     */
    protected Specification specification;

    protected BaseExecutor(T inputCommand) throws Exception {
        this.inputCommand = inputCommand;
        init();
    }

    abstract public void exec() throws Exception;

    protected void init() throws Exception {
        specification = new Specification(inputCommand.getPathToSpecification());
    }
}
