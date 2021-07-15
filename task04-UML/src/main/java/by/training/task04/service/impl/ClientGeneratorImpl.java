package by.training.task04.service.impl;

import by.training.task04.dal.InputFromFile;
import by.training.task04.dal.InputFromFileApp;
import by.training.task04.dal.exception.DaoException;
import by.training.task04.dal.factory.DaoFactory;
import by.training.task04.entity.Account;
import by.training.task04.entity.Client;
import by.training.task04.service.ClientGenerator;
import by.training.task04.service.exception.ServiceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class ClientGeneratorImpl implements ClientGenerator {
    static final Logger generatorLogger = LogManager.getLogger();
    private final InputFromFile inputFromFile = DaoFactory.getInstance().getInputFromFileApp();
    private final String NAMES_LOCATION = "generator/Names.txt";
    private final String SURNAMES_LOCATION = "generator/Surnames.txt";
    private final Random random = new Random(System.currentTimeMillis());

    @Override
    public List<Client> generate(int num) throws ServiceException {
        if (num < 1) {
            throw new ServiceException(new IllegalArgumentException("Num should be > 0, but: " + num));
        }

        generatorLogger.info("Generation started");
        generatorLogger.debug("Names location: %s, surnames: %s ", NAMES_LOCATION, SURNAMES_LOCATION);
        List<String> names = null;
        List<String> surnames = null;
        try {
            names = inputFromFile.readFrom(NAMES_LOCATION);
            surnames = inputFromFile.readFrom(SURNAMES_LOCATION);
        } catch (DaoException e){
            throw new ServiceException(e);
        }
        List<Client> clients = new ArrayList<>(num);
        int namesNum = names.size();
        int surnamesNum = surnames.size();

        for(int i = 0; i < num; i++){
            int id = i + 1;
            String name = names.get(random.nextInt(namesNum));
            String surname = surnames.get(random.nextInt(surnamesNum));
            Map<Integer, Account> accountMap = generateAccounts(id);
            //TODO Dao должно создавать клиента из файла, генератор добавляет айди
            Client client = new Client(id, name, surname, accountMap);
            clients.add(client);
            generatorLogger.debug("Created new client: " + client);
        }
        for(Client client : clients){
            //TODO Цикл Dao аккаунтов добавляет
        }
        generatorLogger.info("Clients generated successfully");
        return clients;
    }

    private Map<Integer, Account> generateAccounts(int clientId){
        generatorLogger.info("Generating accounts");
        final int MAX_NUM_OF_ACCOUNTS = 10;
        final int MIN_NUM_OF_ACCOUNTS = 1;
        final int MIN_MONEY = -30000;
        final int MAX_MONEY = 30000;
        generatorLogger.debug(String.format("Parameters: Number of accs: %d - %d, money: %d - %d"
                ,MIN_NUM_OF_ACCOUNTS, MAX_NUM_OF_ACCOUNTS, MIN_MONEY, MAX_MONEY));

        Map<Integer, Account> accountMap = new HashMap<>();
        int numOfAccs = random.nextInt(MAX_NUM_OF_ACCOUNTS - MIN_NUM_OF_ACCOUNTS) + MIN_NUM_OF_ACCOUNTS;
        for(int i = 0; i < numOfAccs; i++){
            int id = clientId * 100 + i;
            int money = random.nextInt(MAX_MONEY - MIN_MONEY) + MIN_MONEY;
            boolean locked = random.nextInt(2) == 0;
            Account account = new Account(id, money, locked);
            accountMap.put(id, account);
            generatorLogger.debug("Generated account" + account);
        }
        generatorLogger.info("Accounts generated successfully");
        return accountMap;
    }
}
