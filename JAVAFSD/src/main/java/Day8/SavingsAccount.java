package Day8;

class SavingsAccount extends Account {
    final double minimumBalance = 1000;

    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        if ((balance - amount) >= minimumBalance) {
            balance -= amount;
            System.out.println("Savings withdraw successful");
        } else {
            System.out.println("Minimum balance not maintained");
        }
    }
}