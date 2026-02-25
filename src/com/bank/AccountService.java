package com.bank;

import com.bank.*;

public class AccountService {

    public void transfer(Account from, Account to, double amount) {

        if (amount <= 0) {
            System.out.println("Invalid amount");
            return;
        }

        if (from.getBalance() < amount) {
            System.out.println("Insufficient balance");
            return;
        }

        from.withdraw(amount);
        to.deposit(amount);

        System.out.println("Transfer successful");
    }
}