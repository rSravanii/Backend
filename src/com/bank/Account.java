package com.bank;

import java.util.Scanner;

public class Account {
    // bank model means blue print of bank like major things which comes in mind
    // like account name , balance , deposit ,and withdraw.
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;

        }

    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }

    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

}
