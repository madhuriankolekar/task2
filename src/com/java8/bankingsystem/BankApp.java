package com.java8.bankingsystem;



public class BankApp {
    public static void main(String[] args) {
        Account acc = new Account("AC123");

        acc.addTransaction(new Transaction("deposit", 10000));
        acc.addTransaction(new Transaction("withdraw", 3000));
        acc.addTransaction(new Transaction("deposit", 5000));

        AccountService service = new AccountService();

        System.out.println("Account: " + acc.getAccountNumber());
        service.printTransactions(acc);
        System.out.println("Balance: ₹" + service.calculateBalance(acc));
    }
}
