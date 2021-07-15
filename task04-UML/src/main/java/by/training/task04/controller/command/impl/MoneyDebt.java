package by.training.task04.controller.command.impl;

import by.training.task04.controller.command.Command;
import by.training.task04.entity.Client;
import by.training.task04.service.ClientAccountsStats;
import by.training.task04.service.ClientsInMemoryActions;
import by.training.task04.service.RequestParser;
import by.training.task04.service.exception.ServiceException;
import by.training.task04.service.factory.ServiceFactory;
import by.training.task04.view.ClientsView;
import by.training.task04.view.factory.ViewFactory;

public class MoneyDebt implements Command {
    @Override
    public void execute(String request) throws ServiceException {
            ClientsView clientsView = ViewFactory.getInstance().getClientsView();
            ServiceFactory serviceFactory = ServiceFactory.getInstance();
            ClientsInMemoryActions inMemoryActions = serviceFactory.getInMemoryActions();
            ClientAccountsStats accountsStats = serviceFactory.getAccountsStats();

            Client client = inMemoryActions.getPrevClient();
            int debt = accountsStats.getDebt(client);
            clientsView.printDebt(debt);
    }
}
