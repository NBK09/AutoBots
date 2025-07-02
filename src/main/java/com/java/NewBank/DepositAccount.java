package com.java.NewBank;

public class DepositAccount extends BankAccount{
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            addTransaction("DEPOSIT", amount);
        }
    }

    @Override
    public boolean withdraw(double amount) {
    if (amount >= balance){
        balance -= amount;
        addTransaction("WITHDRAW", amount);
        return true;
    }
    return false;
    }

    public DepositAccount(Client owner, Currency currency) {
        super(owner, currency);
    }
}
