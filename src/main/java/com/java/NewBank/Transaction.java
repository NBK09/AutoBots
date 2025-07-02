package com.java.NewBank;

import java.time.LocalDateTime;

public class Transaction {
    private final String type;
    private final double amount;
    private final LocalDateTime timeStamp = LocalDateTime.now();

    public Transaction(double amount, String type) {
        this.amount = amount;
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s: %.2f", timeStamp, type, amount);
    }
}
