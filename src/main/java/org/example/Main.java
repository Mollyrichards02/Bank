package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();

        CurrentAccount ca1 = new CurrentAccount("Molly", 500, 100, 200);
        SavingsAccount sa1 = new SavingsAccount("Amy", 1000, 100, 0.05);

        accounts.add(ca1);
        accounts.add(sa1);

        for (BankAccount account : accounts) {
            System.out.println(account);
        }
    }
}
