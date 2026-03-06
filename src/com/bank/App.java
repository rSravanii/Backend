package com.bank;

public class App {
    public static void main(String[] args) {
        Account ac1 = new Account("AKRKS", 10000);
        Account ac2 = new Account("SRRS", 5000);

        AccountService service = new AccountService();
        System.out.println("Before Tranfer: ");
        System.out.println("ac1 Balance: " + ac1.getBalance());
        System.out.println("ac2 Balance: " + ac2.getBalance());

        try{
        service.transfer(ac1, ac2, 3000);
        System.out.println("\n after transfer");
        System.out.println("ac1 balance " + ac1.getBalance());
        System.out.println("ac2 balance " + ac2.getBalance());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
