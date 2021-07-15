package by.training.task04.dal;

import by.training.task04.dal.exception.DaoException;
import by.training.task04.entity.Account;
import by.training.task04.entity.Client;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class ClientDaoImpl implements ClientDao{
    static final Logger dalLogger = LogManager.getLogger();
    private InputFromFile inputFromFile = new InputFromFileUser();
    private OutputToFile outputToFile = new OutputToFileImpl();
    @Override
    public List<Client> getClients(String fileName) throws DaoException {
        dalLogger.info("Starts loading clients");
        List<String> input = inputFromFile.readFrom(fileName);
        List<String> buffer = new ArrayList<>(5);
        List<Client> clients = new ArrayList<>();
        Iterator<String> inputIterator = input.listIterator();
        dalLogger.info("Starts iterating through file");
        while(inputIterator.hasNext()){
            String str = inputIterator.next();
            String mbId = str.substring(0, 2);

            dalLogger.debug(String.format("Current string: %s, probably id part: %s", str, mbId));
            if(mbId.equals("id") && !buffer.isEmpty()){
                Client newClient = parseBuffer(buffer);
                clients.add(newClient);
                dalLogger.debug("Added client: \n " + newClient.toString());
                buffer.clear();
            }
            buffer.add(str);
        }
        dalLogger.info("Ends iterating through file");
        dalLogger.info("Clients loaded successfully");
        return clients;
    }

    @Override
    public void addClients(List<Client> clients, String fileName) throws DaoException{
        List<String> stringList = new LinkedList<>();
        for(Client client : clients){
            stringList.add("id: " + client.getId());
            stringList.add("name: " + client.getName());
            stringList.add("surname: " + client.getSurname());
            stringList.add("Accounts:");
            Collection<Account> accounts = client.getAccountsList();
            for (Account account : accounts){
                String state = account.isLocked() ? "locked" : "unlocked";
                stringList.add(account.getId() + " "
                        + account.getMoney() + " "
                        + state);
            }
        }
        outputToFile.writeTo(stringList, fileName);
    }

    private Client parseBuffer(List<String> buffer){
        final int ID_START_INDEX = 4;
        final int NAME_START_INDEX = 6;
        final int SURNAME_START_INDEX = 8;
        int id = 0;
        String name = null;
        String surname = null;
        Map<Integer, Account> accounts = new HashMap<>();

        String idStr = buffer.get(0);
        idStr = idStr.substring(ID_START_INDEX);
        id = Integer.parseInt(idStr);

        name = buffer.get(1)
                .substring(NAME_START_INDEX);

        surname = buffer.get(2)
                .substring(SURNAME_START_INDEX);

        for(int i = 4; i < buffer.size(); i++){
            Account account = parseAccount(buffer.get(i));
            accounts.put(account.getId(), account);
            dalLogger.debug("Added account: " + account);
        }
        Client client = new Client(id, name, surname, accounts);
        return client;
    }

    private Account parseAccount(String accoutStr){
        dalLogger.info("Starts parsing account");
        String[] words = accoutStr.split("\\s");
        int id = Integer.parseInt(words[0]);
        int money = Integer.parseInt(words[1]);
        boolean locked = false;
        dalLogger.debug("State word: " + words[2]);
        if (words[2].equals("locked")){
            locked = true;
        }
        Account account = new Account(id, money, locked);
        dalLogger.info("Ended parsing account");
        return account;
    }
}
