package Day20;

public class BankService {

    public String deposit(double amount) {

        if(amount > 0) {
            return "Deposit Success";
        }

        return "Invalid Amount";
    }
}