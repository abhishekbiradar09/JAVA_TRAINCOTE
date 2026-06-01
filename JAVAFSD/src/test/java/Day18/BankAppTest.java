package Day18;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BankAppTest {

    @Test
    void testDeposit() {

        BankApp b = new BankApp();

        b.deposit(500);
        
        System.out.println(b.getBalance());

        assertEquals(1500, b.getBalance());
    }
}