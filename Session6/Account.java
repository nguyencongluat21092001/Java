package Session6;

public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int credit) {
        balance += credit;
        return balance;
    }

    public int debit(int debit) {
        if (debit <= balance) {
            balance -= debit;
        }
        else {
            System.out.println("Amount exceeded!");
        }
        System.out.println("Balance: " + balance);
        return balance;
    }

    public int transferTo(Account another, int transfer) {
        if (transfer <= balance) {
            this.balance -= transfer;
            another.balance += transfer;
            System.out.println("Transfered to account " + another.getName() + " succeeded!");
        }
        else {
            System.out.println("Amount exceeded!");
        }
        System.out.println("Balance: " + balance);
        return balance;
    }

    public String toString() {
        return "Account[id = " + id + ", name = " + name + ", balance = " + balance + "]";
    }
}
