package by.training.task04.view;

import by.training.task04.entity.Account;
import by.training.task04.entity.Client;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Collection;

public class ClientsViewImpl implements ClientsView{
    static final Logger viewLogger = LogManager.getLogger();
    private ResourceManager res = ResourceManager.INSTANCE;
    @Override
    public void printClients(Collection<Client> clients) {
        viewLogger.info("Starts printing clients");
        System.out.println(res.getString("message.clientsList"));
        for(Client client : clients){
            String toPrint = "id: " + client.getId() + " "
                    + res.getString("client.name") + " " + client.getName() + " "
                    + res.getString("client.surname") + " " + client.getSurname() + " "
                    + res.getString("client.accounts") + " " + client.getAccountsList().size();
            System.out.println(toPrint);
        }
        viewLogger.info("Ended printing clients");
    }

    @Override
    public void printClient(Client client) {
        viewLogger.info("Starts printing client");
        System.out.println(res.getString("message.client"));
        String toPrint = "id: " + client.getId() + " "
                + res.getString("client.name") + " " + client.getName() + " "
                + res.getString("client.surname") + " " + client.getSurname() + " "
                + res.getString("client.accountList");
        System.out.println(toPrint);
        Collection<Account> accounts = client.getAccountsList();
        for(Account account : accounts){
            viewLogger.debug("Accounts state: " + account.isLocked());
            String locked = account.isLocked()
                    ? res.getString("account.locked") : res.getString("account.unlocked");
            toPrint = "id: " + account.getId() + " "
                    + res.getString("account.money") + " " + account.getMoney() + " "
                    + res.getString("account.state") + " " + locked;
            System.out.println(toPrint);
        }
        viewLogger.info("Ended printing client");
    }

    @Override
    public void printDebt(int debt) {
        viewLogger.info("Starts printing debt");
        System.out.println(res.getString("message.debt") + " " + debt);
        viewLogger.info("Ended printing debt");
    }

    @Override
    public void printAvailableMoney(int availableMoney) {
        viewLogger.info("Starts printing available money");
        System.out.println(res.getString("message.avMoney") + " " + availableMoney);
        viewLogger.info("Ended printing available money");
    }

    @Override
    public void printAllMoney(int allMoney) {

        viewLogger.info("Starts printing all money");
        System.out.println(res.getString("message.allMoney") + " " + allMoney);
        viewLogger.info("Ended printing all money");
    }
}
