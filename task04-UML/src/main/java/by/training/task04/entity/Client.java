package by.training.task04.entity;



import java.util.*;

public class Client {
    private int id;
    private String name = "Unknown";
    private String surname = "Unknown";
    private Map<Integer, Account> accounts = new TreeMap<>();

    public Client(int id){
        this.id = id;
    }

    public Client(int id, String name, String surname){
        this(id);
        this.name = name;
        this.surname = surname;
    }

    public Client(int id, String name, String surname, Map<Integer, Account> accounts){
        this(id, name, surname);
        this.accounts = accounts;
    }

    public Collection<Account> getAccountsList(){
        return accounts.values();
    }

    public Account getAccount(int accountID){
        return accounts.get(accountID);
    }

    public void addAccount(Account account){
        Integer accountID = account.getId();
        accounts.put(accountID, account);
    }

    public Account removeAccount(int id){
        return accounts.remove(id);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        String toString = "id: " + id + " Name: " + name + " " + surname + " Accounts: " + accounts.size();
        return toString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (id != client.id) return false;
        if (!name.equals(client.name)) return false;
        return surname.equals(client.surname);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        result = 31 * result + surname.hashCode();
        return result;
    }
}
