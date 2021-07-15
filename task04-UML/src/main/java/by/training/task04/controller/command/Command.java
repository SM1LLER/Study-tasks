package by.training.task04.controller.command;

import by.training.task04.service.exception.ServiceException;

public interface Command {
    void execute(String request) throws ServiceException;
}
