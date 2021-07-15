package by.training.task04.controller.command.impl;

import by.training.task04.controller.command.Command;
import by.training.task04.view.CommandRequester;
import by.training.task04.view.factory.ViewFactory;

public class WrongRequest implements Command {
    @Override
    public void execute(String request) {
        CommandRequester UI = ViewFactory.getInstance().getCommandRequester();
        UI.printError("Wrong request");
    }
}
