package com.java.NewBank;

import java.util.HashMap;
import java.util.Map;

public class BankProApp {
    private static final Map<String, Client> client = new HashMap<>();
    public static void main(String[] args) {
        Client beslan = new Client("4125", "Beslan");
        DepositAccount depositBeslan = new DepositAccount(beslan,Currency.USD);
        CreditAccount creditBeslan = new CreditAccount(beslan, Currency.KGS);

        beslan.addAccount(depositBeslan);
        beslan.addAccount(creditBeslan);

        client.put(beslan.getClientID(), beslan);
        beslan.authenticate("4125");

        creditBeslan.deposit(100);
        creditBeslan.withdraw(1000);
        System.out.println(creditBeslan.balance);

        depositBeslan.deposit(200);

        System.out.println(BankService.transfer(depositBeslan, creditBeslan, 100));
        System.out.println(creditBeslan.balance);
        System.out.println(depositBeslan.balance);


    }
}
