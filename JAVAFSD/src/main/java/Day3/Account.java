package Day3;

public class Account {
	long accNum;
    double balance;
    private Person accHolder;

    static long counter = 1001;

    public Account(Person accHolder, double balance) {
        this.accHolder = accHolder;
        this.balance = balance;
        this.accNum = counter++;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if(balance - amount >= 500)
            balance -= amount;
        else {
            System.out.println("Minimum balance should be 500");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return "Account Number: " + accNum +
               "\nName: " + accHolder.getName() +
               "\nBalance: " + balance;
    }

}