package by.training.task04.service.impl;

import by.training.task04.entity.Account;
import by.training.task04.entity.Client;
import by.training.task04.service.ClientAccountsStats;

import java.util.Collection;

public class ClientAccountsStatsImpl implements ClientAccountsStats {
    private Client prevClient = null;
    private int prevAvMoney = 0;
    private int prevDebt = 0;
    private int prevMoney = 0;

    @Override
    public int getAllMoneyCount(Client client) {
        if(prevClient == client){
            return prevMoney;
        }
        prevClient = client;
        calculateMoney();
        return prevMoney;
    }

    @Override
    public int getAvailableMoney(Client client) {
        if(prevClient == client){
            return prevAvMoney;
        }
        prevClient = client;
        calculateMoney();
        return prevAvMoney;
    }

    @Override
    public int getDebt(Client client) {
        if(prevClient == client){
            return prevDebt;
        }
        prevClient = client;
        calculateMoney();
        return prevDebt;
    }

    private void calculateMoney(){
        Collection<Account> accounts = prevClient.getAccountsList();
        for (Account account : accounts){
            int money = account.getMoney();
            if(account.getMoney() < 0){
                prevDebt += money;
            } else if (!account.isLocked()){
                prevAvMoney += money;
            }
        }
        prevMoney = prevAvMoney + prevDebt;
    }
}
