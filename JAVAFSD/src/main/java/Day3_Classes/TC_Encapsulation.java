package Day3_Classes;

class BankAccount{
	private double balance;


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public void deposit(double amount) {
		balance+=amount;
	}
}
public class TC_Encapsulation {

	//hides the data call via getter and settars

	public static void main(String[] args) {

		BankAccount b=new BankAccount();

		b.setBalance(100);
		b.getBalance();
		System.out.println(b.getBalance());
	}
}
