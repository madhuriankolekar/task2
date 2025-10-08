package com.code.oopassignment;//naming  company naming convention+projectname
//Package declaration

//Public class definition for BankAccount
public class BankAccount {
 
 // ***** Fields (instance variables to store account details)
 private int accountNumber;    // Stores the unique account number of the bank account
 private String accountHolder; // Stores the name of the account holder
 private double balance;       // Stores the current balance in the account

 // ********** Constructor (used to initialize object with given values)
 public BankAccount(int accountNumber, String accountHolder, double balance) {
     
	 // 'this' keyword differentiates instance variables from constructor parameters
     this.accountNumber = accountNumber;  
     this.accountHolder = accountHolder;
     this.balance = balance;
 }

 // ***** Method to deposit money into the account
 public void deposit(double amount) {
     // Check if the deposit amount is greater than 0
     if (amount > 0) {
         // Add deposit amount to balance
         balance += amount;
         System.out.println("Deposited: " + amount);
     } else {
         // If deposit amount is not valid, show error
         System.out.println("Invalid deposit amount.");
     }
 }

 // ****** Method to withdraw money from the account
 public void withdraw(double amount) {
     // Check if withdrawal amount is positive and less than or equal to balance
     if (amount > 0 && amount <= balance) {
         // Deduct amount from balance
         balance -= amount;
         System.out.println("Withdrawn: " + amount);
     } else {
         // If withdrawal is invalid (negative or exceeds balance), show error
         System.out.println("Insufficient balance or invalid amount.");
     }
 }

 // **** Method to display account details & current balance
 public void displayBalance() {
     // Print account number
     System.out.println("Account Number: " + accountNumber);
     // Print account holder name
     System.out.println("Account Holder: " + accountHolder);
     // Print current balance
     System.out.println("Current Balance: " + balance);
 }

 // ***** Main method to test functionality (entry point of program)
 public static void main(String[] args) {
     // Create a BankAccount object with account number=101, holder="diya", initial balance=5000
     BankAccount account = new BankAccount(101, "diya", 5000);

     // Display initial account details and balance
     account.displayBalance();

     // Deposit 2000 into the account
     account.deposit(2000);

     // Withdraw 1500 from the account
     account.withdraw(1500);

     //message
     System.out.println("check");

     // Display updated account details and balance
     account.displayBalance();
 }
}

