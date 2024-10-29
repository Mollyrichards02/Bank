package org.example;

public class CurrentAccount extends BankAccount {
    private double maxWithdrawalAmount;

    public CurrentAccount(String accountHolderName, double balance, double minBalance, double maxWithdrawalAmount) {
        super(accountHolderName, balance, minBalance);
        this.maxWithdrawalAmount = maxWithdrawalAmount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > maxWithdrawalAmount) {
            throw new IllegalArgumentException("Withdrawal amount exceeds maximum limit");
        }
        super.withdraw(amount);
    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "accountHolderName='" + getAccountHolderName() + '\'' +
                ", balance=" + getBalance() +
                ", minBalance=" + getMinBalance() +
                ", maxWithdrawalAmount=" + maxWithdrawalAmount +
                '}';
    }
}
