package by.training.task04.service;

import by.training.task04.entity.Client;
import by.training.task04.service.exception.ServiceException;

import java.util.List;

/**
 * Generates list with random clients
 * @author Pavel Kalinin
 */
public interface ClientGenerator {
    /**
     * Generates clients and send it to file
     * @param  num - number of clients to create
     * @return List of generated clients
     * @throws ServiceException if file doesnt exist
     */
    public List<Client> generate(int num) throws ServiceException;
}
