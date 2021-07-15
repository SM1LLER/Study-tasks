package by.training.task04.service;

import by.training.task04.entity.Client;
import by.training.task04.service.exception.ServiceException;

import java.util.Collection;
import java.util.List;

/**
 * Actions with clients in memory
 * @author Pavel Kalinin
 */
public interface ClientsInMemoryActions {

    /**
     * Loads clients from file to memory
     * @param fileName file where clients stores
     */
    public void loadFrom(String fileName) throws ServiceException;
    /**
     * Returns client from memory storage
     * @param id of the client to get
     * @return Client
     */
    public Client getClient(int id);
    /**
     * Returns client that was returned by id
     * @return Client
     */
    public Client getPrevClient() throws ServiceException;

    /**
     * Returns list of clients from memory
     * @return List<Client> clients
     */
    public Collection<Client> getClients();
}
