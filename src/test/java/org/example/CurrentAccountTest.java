package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CurrentAccountTest {

    @Test
    public void testWithdrawWithinLimit() {
        CurrentAccount account = new CurrentAccount("John Doe", 500, 100, 200);
        account.withdraw(100);
        assertEquals(400, account.getBalance());
    }

    @Test
    public void testWithdrawExceedsLimit() {
        CurrentAccount account = new CurrentAccount("John Doe", 500, 100, 200);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(300);
        });
        assertEquals("Withdrawal amount exceeds maximum limit", exception.getMessage());
    }
}

