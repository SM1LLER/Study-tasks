package by.training.task04.controller.command.impl;

import by.training.task04.controller.command.Command;
import by.training.task04.entity.Client;
import by.training.task04.service.ClientAccountsStats;
import by.training.task04.service.ClientsInMemoryActions;
import by.training.task04.service.exception.ServiceException;
import by.training.task04.service.factory.ServiceFactory;
import by.training.task04.view.ClientsView;
import by.training.task04.view.factory.ViewFactory;

public class FullMoney implements Command {
    @Override
    public void execute(String request) throws ServiceException {
        ClientsView clientsView = ViewFactory.getInstance().getClientsView();
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        ClientsInMemoryActions inMemoryActions = serviceFactory.getInMemoryActions();
        ClientAccountsStats accountsStats = serviceFactory.getAccountsStats();

        Client client = inMemoryActions.getPrevClient();
        int allMoney = accountsStats.getAllMoneyCount(client);
        clientsView.printAllMoney(allMoney);
    }
}
