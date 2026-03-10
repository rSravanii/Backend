package com.bank;

import com.Exceptions.*;

public class App {
    public static void main(String[] args) {

        AccountService service = new AccountService();

        Account alice = new Account("Alice", 1000);
        Account bob = new Account("Bob", 500);

        // Test 1 — invalid amount
        try {
            service.transfer(alice, bob, -100);
        } catch (Exception ex) {
            ErrorResponse error = GlobalExceptionHandler.handle(ex);
            System.out.println(error);
        }

        // Test 2 — insufficient balance
        try {
            service.transfer(bob, alice, 9999);
        } catch (Exception ex) {
            ErrorResponse error = GlobalExceptionHandler.handle(ex);
            System.out.println(error);
        }

        // Test 3 — valid transfer
        try {
            service.transfer(alice, bob, 200);
        } catch (Exception ex) {
            ErrorResponse error = GlobalExceptionHandler.handle(ex);
            System.out.println(error);
        }
    }
}
