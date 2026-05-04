package Day9.model;

public class SavingsAccount extends Account {

    private static final double MIN_BALANCE = 500;

    public SavingsAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    public void withdraw(double amount) {
        if (getBalance() - amount >= MIN_BALANCE) {
            setBalance(getBalance() - amount);
            System.out.println("Withdraw successful");
        } else {
            System.out.println("Minimum balance required");
        }
    }
}