package com.java8.bankingsystem;


import java.util.*;

public class AccountService {
    // Calculate balance using streams
    public double calculateBalance(Account acc) {
        return acc.getTransactions()
                  .stream()
                  .mapToDouble(t -> t.getType().equals("deposit") ? t.getAmount() : -t.getAmount())
                  .sum();
    }

    // Print transactions using method reference
    public void printTransactions(Account acc) {
        acc.getTransactions().forEach(t -> 
            System.out.println(t.getType() + " - ₹" + t.getAmount()));
    }
}

