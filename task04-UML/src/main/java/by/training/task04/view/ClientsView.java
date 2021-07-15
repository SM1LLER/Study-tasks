package by.training.task04.view;

import by.training.task04.entity.Client;
/**
 * Displays message about clients
 * @author Pavel Kalinin
 */
import java.util.Collection;

public interface ClientsView {
    /**
     * Prints list of all clients stored in the memory
     * @param clients - list that displays
     */
    void printClients(Collection<Client> clients);
    /**
     * Prints client stored in the memory
     * @param client - client that displays
     */
    void printClient(Client client);
    /**
     * Prints clients debt
     * @param  debt - debt of the client
     */
    void printDebt(int debt);

    /**
     * Prints clients available money
     * @param  availableMoney - available money
     */
    void printAvailableMoney(int availableMoney);

    /**
     * Prints clients sum of all money
     * @param  allMoney - all money
     */
    void printAllMoney(int allMoney);
}
