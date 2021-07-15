package by.training.task04.service.impl;

import by.training.task04.dal.ClientDao;
import by.training.task04.dal.ClientInMemoryStorage;
import by.training.task04.dal.exception.DaoException;
import by.training.task04.dal.factory.DaoFactory;
import by.training.task04.entity.Client;
import by.training.task04.service.ClientsInMemoryActions;
import by.training.task04.service.exception.ServiceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Collection;
import java.util.List;

public class ClientsInMemoryActionsImpl implements ClientsInMemoryActions {
    static final Logger actionsLogger = LogManager.getLogger();
    private ClientDao clientDao = DaoFactory.getInstance().getClientDao();
    private ClientInMemoryStorage storage = ClientInMemoryStorage.getInstance();
    private int prevId = -1;
    @Override
    public void loadFrom(String fileName) throws ServiceException {
        actionsLogger.info("Start loading from file: " + fileName);
        List<Client> clients = null;
        try {
            clients = clientDao.getClients(fileName);
        } catch (DaoException e){
            throw new ServiceException(e);
        }
        for (Client client : clients){
            storage.addClient(client);
        }
        actionsLogger.info("Ended loading from file");

    }

    @Override
    public Client getClient(int id) {
        prevId = id;
        return storage.getClient(id);
    }

    @Override
    public Client getPrevClient() throws ServiceException{
        if (prevId == -1){
            throw new ServiceException("Choose client first");
        }
        return getClient(prevId);
    }

    @Override
    public Collection<Client> getClients(){
        return storage.getClients();
    }
}
