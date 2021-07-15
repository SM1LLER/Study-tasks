package by.training.task04.dal;

import by.training.task04.dal.exception.DaoException;
import by.training.task04.entity.Client;


import java.util.List;
import java.util.Map;

/**
 * Reads clients from the file
 * @author Pavel Kalinin
 */
public interface ClientDao {
    /**
     * Returns clients that that stores in the file
     * @param fileName - Name of the file to check
     * @return List<Client> - Clients that stores in the file
     * @throws DaoException if file doesnt exists or empty
     */
    List<Client> getClients(String fileName) throws DaoException;

    /**
     * Adds clients to the file
     * @param clients - list of clients that add to file
     * @param fileName - Name of the file to check
     * @throws DaoException if file doesnt exists
     */
    void addClients(List<Client> clients, String fileName) throws DaoException;
}
