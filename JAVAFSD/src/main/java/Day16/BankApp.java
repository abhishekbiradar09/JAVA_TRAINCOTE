package Day16;

import Day16.model.Account;
import Day16.service.BankService;
import Day16.threads.DepositThread;
import Day16.threads.WithdrawThread;

public class BankApp {

    public static void main(String[] args) {

        Account acc = new Account(1000);

        BankService service = new BankService(acc);

        Thread d = new Thread(new DepositThread(service));
        Thread w = new Thread(new WithdrawThread(service));

        d.start();
        w.start();
    }
}