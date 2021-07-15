package by.training.task04.dal;

import by.training.task04.entity.Client;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

/**
 * Stores map of clients in the memory
 */
public class ClientInMemoryStorage {
    private final static ClientInMemoryStorage instance = new ClientInMemoryStorage();
    private Map<Integer, Client> clientMap = new TreeMap<>();
    private Client currentClient = null;
    //TODO Убрать клиента из-за многопоточности

    private ClientInMemoryStorage(){}


    public static ClientInMemoryStorage getInstance() {
        return instance;
    }

    public void addClient(Client client){
        int id = client.getId();
        clientMap.put(id, client);
    }

    public Client getClient(int clientID){
        if (currentClient != null && currentClient.getId() == clientID){
            return currentClient;
        }
        currentClient = clientMap.get(clientID);
        return currentClient;
    }

    public Collection<Client> getClients(){
        return clientMap.values();
    }

}
