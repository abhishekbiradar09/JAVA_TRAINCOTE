package Day9.service;

import Day9.model.Account;

public class BankService implements BankOperation {

    Account[] a = new Account[5];
    int count = 0;

    public void addAccount(Account acc) {
        a[count++] = acc;
    }

    public void deposit(int accNo,double amount) {
        for(int i=0;i<count;i++) {
            if(a[i].getAccNo()==accNo) {
                a[i].setBalance(a[i].getBalance()+amount);
                System.out.println("Amount deposited successfully");
                return;
            }
        }
        System.out.println("Account not found");
    }

    public void withdraw(int accNo,double amount) {}

    public void checkbalance(int accNo) {
        for(int i=0;i<count;i++) {
            if(a[i].getAccNo()==accNo) {
                System.out.println(a[i].getBalance());
            }
        }
    }

    public void displayAccounts() {
        for(int i=0;i<count;i++) {
            System.out.println(a[i].getAccNo()+" "+a[i].getName()+" "+a[i].getBalance());
        }
    }
}