package com.bank;

public class Account {

    private String name;
    private double balance;

    // Constructor
    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // Get balance
    public double getBalance() {
        return balance;
    }

    // Get name
    public String getName() {
        return name;
    }

    // Deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println(name + " deposited: " + amount);
    }

    // Withdraw money
    public void withdraw(double amount) {
        balance -= amount;
        System.out.println(name + " withdrew: " + amount);
    }

    // Show account info
    @Override
    public String toString() {
        return "Account[name=" + name + ", balance=" + balance + "]";
    }
}