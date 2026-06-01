package Day18;

public class BankApp {

    private double balance = 1000;

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}