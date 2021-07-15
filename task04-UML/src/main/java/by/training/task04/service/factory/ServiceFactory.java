package by.training.task04.service.factory;

import by.training.task04.entity.Client;
import by.training.task04.service.*;
import by.training.task04.service.impl.*;


public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private ClientGenerator clientGenerator = new ClientGeneratorImpl();
    private ClientGenerateToFile clientGenerateToFile = new ClientGenerateToFileImpl();
    private ClientsInMemoryActions inMemoryActions = new ClientsInMemoryActionsImpl();
    private ClientAccountsStats accountsStats = new ClientAccountsStatsImpl();
    private RequestParser requestParser = new RequestParserImpl();

    private ServiceFactory(){}

    public static ServiceFactory getInstance() {
        return instance;
    }

    public ClientGenerator getClientGenerator() {
        return clientGenerator;
    }

    public ClientGenerateToFile getClientGenerateToFile() {
        return clientGenerateToFile;
    }

    public ClientsInMemoryActions getInMemoryActions() {
        return inMemoryActions;
    }

    public ClientAccountsStats getAccountsStats() {
        return accountsStats;
    }

    public RequestParser getRequestParser() {
        return requestParser;
    }
}
