package by.training.task04.service;

import by.training.task04.service.exception.ServiceException;

/**
 * Generates list with random clients and saves it to file
 * @author Pavel Kalinin
 */
public interface ClientGenerateToFile {
    /**
     * Generates clients and send it to file
     * @param fileName name of the file where creates new Clients
     * @param  num - number of clients to create
     * @throws ServiceException if file doesnt exist
     */
    public void generateToFile(String fileName, int num) throws ServiceException;
}
