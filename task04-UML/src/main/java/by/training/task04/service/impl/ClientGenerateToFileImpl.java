package by.training.task04.service.impl;

import by.training.task04.dal.ClientDao;
import by.training.task04.dal.exception.DaoException;
import by.training.task04.dal.factory.DaoFactory;
import by.training.task04.entity.Client;
import by.training.task04.service.ClientGenerateToFile;
import by.training.task04.service.ClientGenerator;
import by.training.task04.service.exception.ServiceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class ClientGenerateToFileImpl implements ClientGenerateToFile {
    static final Logger generatorLogger = LogManager.getLogger();
    private final ClientGenerator clientGenerator = new ClientGeneratorImpl();
    private final ClientDao clientDao = DaoFactory.getInstance().getClientDao();
    @Override
    public void generateToFile(String fileName, int num) throws ServiceException {
        List<Client> clients = clientGenerator.generate(num);
        try {
            clientDao.addClients(clients, fileName);
        } catch (DaoException e){
            throw new ServiceException(e);
        }
        generatorLogger.info("Added generate clients to " + fileName);
    }
}
