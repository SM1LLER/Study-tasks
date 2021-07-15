package by.training.task04.controller.command.impl;

import by.training.task04.controller.command.Command;
import by.training.task04.service.exception.ServiceException;
import by.training.task04.view.CommandRequester;
import by.training.task04.view.factory.ViewFactory;

public class ChangeLanguage implements Command {
    @Override
    public void execute(String request) throws ServiceException {
        CommandRequester UI = ViewFactory.getInstance().getCommandRequester();
        UI.changeLanguage();
    }
}
