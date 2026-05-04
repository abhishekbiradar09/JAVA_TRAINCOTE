package Day8;

abstract class Account {
    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    abstract void withdraw(double amount);
}