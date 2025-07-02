package com.java.NewBank;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class BankAccount {
    protected String accountNumber;
    protected double balance;
    protected final Client owner;
    protected final Currency currency;
    protected final List<Transaction> transactions = new ArrayList<>();

    public BankAccount(Client owner, Currency currency) {
        this.owner = owner;
        this.currency = currency;
        this.accountNumber = UUID.randomUUID().toString();
    }

    public abstract void deposit(double amount);

    public abstract boolean withdraw(double amount);

    public void addTransaction(String type, double amount) {
        transactions.add(new Transaction(amount, type));
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Currency getCurrency() {
        return currency;
    }

    public Client getOwner() {
        return owner;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
