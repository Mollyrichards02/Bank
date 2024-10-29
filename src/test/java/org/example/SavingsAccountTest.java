package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SavingsAccountTest {

    @Test
    public void testInterestApplication() {
        SavingsAccount account = new SavingsAccount("Jane Doe", 1000, 100, 0.05);
        account.applyInterest();
        assertEquals(1050, account.getBalance());
    }
}
