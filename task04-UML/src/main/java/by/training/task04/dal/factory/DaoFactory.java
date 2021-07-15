package by.training.task04.dal.factory;

import by.training.task04.dal.*;

public final class DaoFactory {
    private static final DaoFactory instance = new DaoFactory();

    private final ClientDao clientDao = new ClientDaoImpl();
    private final InputFromFile inputFromFileApp = new InputFromFileApp();
    private final InputFromFile inputFromFileUser = new InputFromFileUser();

    private DaoFactory(){}

    public static DaoFactory getInstance(){
        return instance;
    }

    public ClientDao getClientDao() {
        return clientDao;
    }

    public InputFromFile getInputFromFileApp() {
        return inputFromFileApp;
    }

    public InputFromFile getInputFromFileUser() {
        return inputFromFileUser;
    }
}
