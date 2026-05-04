package Day9;

import java.util.Scanner;
import Day9.model.Account;
import Day9.service.BankService;
import Day9.util.Transactionutil;

public class BankApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankService service = new BankService();

        Account a1 = new Account(101, "Ram", 1000);
        Account a2 = new Account(102, "Sam", 2000);

        service.addAccount(a1);
        service.addAccount(a2);

        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Display Accounts");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    service.displayAccounts();
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    int accNo = sc.nextInt();

                    System.out.print("Enter Amount: ");
                    double amount = sc.nextDouble();

                    if (Transactionutil.isvalidamount(amount)) {
                        service.deposit(accNo, amount);
                        System.out.println("Deposit successful");
                    } else {
                        System.out.println("Invalid amount");
                    }
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    int acc = sc.nextInt();
                    service.checkbalance(acc);
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}