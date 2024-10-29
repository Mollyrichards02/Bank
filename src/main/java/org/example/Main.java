package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();

        CurrentAccount account1 = new CurrentAccount("Molly", 500, 100, 200);
        SavingsAccount account2 = new SavingsAccount("Amy", 1000, 100, 0.05);

        accounts.add(account1);
        accounts.add(account2);

        for (BankAccount account : accounts) {
            System.out.println(account);
        }
    }
}
