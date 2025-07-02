package com.java.NewBank;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Client {
    private final String fullName;
    private final String clientID;
    private final String pin;
    private final List<BankAccount> accounts = new ArrayList<>();

    public Client(String pin, String fullName) {
        this.pin = pin;
        this.fullName = fullName;
        this.clientID = String.valueOf(UUID.randomUUID());
    }
    public boolean authenticate(String inputPin){
        return this.pin.equals(inputPin);
    }

    void addAccount(BankAccount account){
        accounts.add(account);
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }

    public String getClientID() {
        return clientID;
    }

    public String getFullName() {
        return fullName;
    }


    public String getPin() {
        return pin;
    }
}
