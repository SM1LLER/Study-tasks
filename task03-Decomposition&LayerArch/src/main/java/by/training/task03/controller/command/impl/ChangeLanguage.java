package by.training.task03.controller.command.impl;

import by.training.task03.controller.command.Command;
import by.training.task03.service.exception.ServiceException;
import by.training.task03.view.ArraySorterUI;
import by.training.task03.view.CommandRequester;
import by.training.task03.view.factory.ViewFactory;

public class ChangeLanguage implements Command {
    @Override
    public void execute(String request) throws ServiceException {
        CommandRequester UI = ViewFactory.getInstance().getCommandRequester();
        UI.changeLanguage();
    }
}
