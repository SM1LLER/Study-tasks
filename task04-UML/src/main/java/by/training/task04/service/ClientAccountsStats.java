package by.training.task04.service;

import by.training.task04.entity.Client;
/**
 * Gives money information about client
 * @author Pavel Kalinin
 */
public interface ClientAccountsStats {
    /**
     * Returns all money statistics from accoounts
     * @param client to check
     * @return int - sum of money and debts
     */
    public int getAllMoneyCount(Client client);
    /**
     * Returns available money from accoounts
     * @param client to check
     * @return int - money available on all accounts
     */
    public int getAvailableMoney(Client client);
    /**
     * Returns debts from accoounts
     * @param client to check
     * @return int - debt
     */
    public int getDebt(Client client);
}
