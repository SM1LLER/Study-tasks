package by.training.task03.controller.command;

import by.training.task03.service.exception.ServiceException;
/**
 * Command pattern
 * @author Pavel Kalinin
 */
public interface Command {
    void execute(String request) throws ServiceException;
}
