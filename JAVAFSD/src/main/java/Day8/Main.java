package Day8;

public class Main {
    public static void main(String[] args) {

        Account a1 = new SavingsAccount(5000);
        a1.withdraw(4500);

        Account a2 = new CurrentAccount(2000);
        a2.withdraw(3500);
    }
}