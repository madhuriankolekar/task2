package com.java8.bankingsystem;

public class Transaction {
    private String type; // deposit or withdraw
    private double amount;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
    public String getType() { return type; }
    public double getAmount() { return amount; }
}

