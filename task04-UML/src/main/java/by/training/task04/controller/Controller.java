package by.training.task04.controller;

import by.training.task04.controller.command.Command;
import by.training.task04.service.exception.ServiceException;
import by.training.task04.view.CommandRequester;
import by.training.task04.view.CommandRequesterImpl;
import by.training.task04.view.factory.ViewFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Controller {
    private static final Logger logger = LogManager.getLogger();
    private final CommandProvider provider = new CommandProvider();
    private final String paramDelimeter = "\\s";

    public void executeTask(String request){
        CommandRequester ui = ViewFactory.getInstance().getCommandRequester();
        String commandName;
        Command executionCommand;
        String[] requestElements = request.split(paramDelimeter);
        commandName = requestElements[0];
        executionCommand = provider.getCommand(commandName);

        try {
            executionCommand.execute(request);
        } catch (ServiceException e){
            logger.error(e.toString());
            ui.printError("Error during command execution" + e.getMessage());
        }
    }
}
