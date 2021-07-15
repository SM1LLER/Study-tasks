package by.training.task04.entity;

public class Account {
    private int id;
    private int money = 0;
    private boolean locked = false;

    public Account(int id){
        this.id = id;
    }

    public Account(int id, int money){
        this(id);
        this.money = money;
    }

    public Account(int id, int money, boolean locked){
        this(id, money);
        this.locked = locked;
    }

    public void setLocked(boolean locked){
        this.locked = locked;
    }

    public int getId() {
        return id;
    }

    public boolean isLocked() {
        return locked;
    }

    public int addMoney(int money){
        this.money += money;
        return this.money;
    }

    public int reduceMoney(int money){
        addMoney(-money);
        return this.money;
    }

    public int getMoney(){
        return this.money;
    }

    @Override
    public String toString() {
        String toString = "id: " + id + " money: " + money + " " + locked;
        return toString;
    }
}
