package org.example;

public class BankAccount {
    private String accountHolderName;
    private double balance;
    private double minBalance;

    public BankAccount(String accountHolderName, double balance, double minBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.minBalance = minBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (balance - amount < minBalance) {
            throw new IllegalArgumentException("Withdrawal amount exceeds minimum balance");
        }
        balance -= amount;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }
}
