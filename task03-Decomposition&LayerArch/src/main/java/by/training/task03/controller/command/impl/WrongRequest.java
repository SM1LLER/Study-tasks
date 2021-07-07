package by.training.task03.controller.command.impl;

import by.training.task03.controller.command.Command;
import by.training.task03.view.ArraySorterUI;
import by.training.task03.view.CommandRequester;
import by.training.task03.view.factory.ViewFactory;

public class WrongRequest implements Command {
    @Override
    public void execute(String request) {
        CommandRequester UI = ViewFactory.getInstance().getCommandRequester();
        UI.printError("Wrong request");
    }
}
