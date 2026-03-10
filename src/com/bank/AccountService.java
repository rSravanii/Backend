package com.bank;

import com.Exceptions.BadRequestException;
import com.Exceptions.ResourceNotFoundException;

public class AccountService {

    public void transfer(Account from, Account to, double amount) {

        // Bad amount → BadRequestException
        if (amount <= 0) {
            throw new BadRequestException("Invalid amount: must be greater than zero");
        }

        // Not enough money → ResourceNotFoundException
        if (from.getBalance() < amount) {
            throw new ResourceNotFoundException("Insufficient balance in account");
        }

        from.withdraw(amount);
        to.deposit(amount);

        System.out.println("Transfer successful");
    }
}