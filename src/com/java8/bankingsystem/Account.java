package com.java8.bankingsystem;

import java.util.*;

public class Account {
    private String accountNumber;
    private List<Transaction> transactions = new ArrayList<>();

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void addTransaction(Transaction t) {
        transactions.add(t);
    }
    public String getAccountNumber() { return accountNumber; }
    public List<Transaction> getTransactions() { return transactions; }
}
