package Day3;

public class AccountMain {
	public static void main(String[] args) {

        Person smith = new Person("Smith", 25);
        Person kathy = new Person("Kathy", 30);

        
        Account acc1 = new Account(smith, 2000);
        Account acc2 = new Account(kathy, 3000);

        acc1.deposit(2000);
        acc2.withdraw(2000);

        System.out.println(acc1);
        System.out.println();
        System.out.println(acc2);
    }

}