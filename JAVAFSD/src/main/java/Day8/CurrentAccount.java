package Day8;

class CurrentAccount extends Account {
    double overdraftLimit = 2000;

    CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        if ((balance + overdraftLimit) >= amount) {
            balance -= amount;
            System.out.println("Current withdraw successful");
        } else {
            System.out.println("Overdraft limit exceeded");
        }
    }
}