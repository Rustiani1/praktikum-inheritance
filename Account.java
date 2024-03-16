//Rustiani_20220040003_TI22C_PBO3

public class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance - amount >= 0) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}