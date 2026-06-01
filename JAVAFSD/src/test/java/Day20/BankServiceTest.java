package Day20;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class BankServiceTest {

    @Test
    void testDeposit() {

        BankService service = Mockito.mock(BankService.class);

        when(service.deposit(500)).thenReturn("Deposit Success");

        String result = service.deposit(500);

        System.out.println(result);

        assertEquals("Deposit Success", result);
    }
}