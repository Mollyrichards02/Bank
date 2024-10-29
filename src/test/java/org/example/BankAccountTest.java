package org.example;

import org.example.BankAccount;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    public void testInitialBalance() {
        BankAccount account = new BankAccount("Molly", 0, 100);
        assertEquals(0, account.getBalance());
    }

    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount("Molly", 0, 100);
        account.deposit(50);
        assertEquals(50, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        BankAccount account = new BankAccount("Molly", 100, 0);
        account.withdraw(50);
        assertEquals(50, account.getBalance());
    }

    @Test
    public void testWithdrawAllMoney() {
        BankAccount account = new BankAccount("Molly", 100, 0);
        account.withdraw(100);
        assertEquals(0, account.getBalance(), "Balance should be zero after withdrawing all funds");
    }

    @Test
    public void testWithdrawBelowMinBalance() {
        BankAccount account = new BankAccount("Molly", 100, 50);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(60);
        });
        String expectedMessage = "Withdrawal amount exceeds minimum balance";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testDepositNegativeAmount() {
        BankAccount account = new BankAccount("Molly", 100, 0);
        account.deposit(-50);
        assertEquals(100, account.getBalance(), "Balance should not change when depositing negative amount");
    }

    @Test
    public void testWithdrawExactMinBalance() {
        BankAccount account = new BankAccount("Molly", 100, 100);
        account.withdraw(0);
        assertEquals(100, account.getBalance(), "Balance should not change when withdrawing zero amount");
    }



}
