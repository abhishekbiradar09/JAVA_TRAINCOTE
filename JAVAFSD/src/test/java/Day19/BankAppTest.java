package Day19;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BankAppTest {

    @ParameterizedTest
    @CsvSource({
        "500,1500",
        "1000,2000",
        "200,1200"
    })

    void testDeposit(double depositAmount, double expectedBalance) {

        BankApp b = new BankApp();

        b.deposit(depositAmount);

        System.out.println("Balance: " + b.getBalance());

        assertEquals(expectedBalance, b.getBalance());
    }
}