package com.java.NewBank;

public class CreditAccount extends BankAccount{

    private final double limit = -1000;

    public CreditAccount(Client owner, Currency currency) {
        super(owner, currency);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    @Override
    public boolean withdraw(double amount) {
    if (balance - amount >= limit ){
        balance -= amount;
        addTransaction("WITHDRAW", amount);
        return true;
    }else {
        return false;
    }
    }
}
