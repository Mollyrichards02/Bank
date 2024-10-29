package org.example;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountHolderName, double balance, double minBalance, double interestRate) {
        super(accountHolderName, balance, minBalance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "accountHolderName='" + getAccountHolderName() + '\'' +
                ", balance=" + getBalance() +
                ", minBalance=" + getMinBalance() +
                ", interestRate=" + interestRate +
                '}';
    }
}
