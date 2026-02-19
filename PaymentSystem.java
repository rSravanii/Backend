// interfaces concept in java
// 1. Payment interface

interface Payment {
    void processPayment(double amount);

    void generateReceipt(double amount);
}

class CreditCardPayment implements Payment {

    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of ₹" + amount);
    }

    @Override
    public void generateReceipt(double amount) {
        System.out.println("Receipt: Paid ₹" + amount + " via Credit Card");
    }
}

class UpiPayment implements Payment {

    private String upiId;

    public UpiPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of ₹" + amount);
    }

    @Override
    public void generateReceipt(double amount) {
        System.out.println("Receipt: Paid ₹" + amount + " via UPI");
    }
}

class NetBankingPayment implements Payment {

    private String bankName;

    public NetBankingPayment(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Net Banking payment of ₹" + amount);
    }

    @Override
    public void generateReceipt(double amount) {
        System.out.println("Receipt: Paid ₹" + amount + " via Net Banking");
    }
}

public class PaymentSystem {

    public static void makePayment(Payment payment, double amount) {
        payment.processPayment(amount);
        payment.generateReceipt(amount);
        System.out.println();
    }

    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment("1234-5678");
        Payment p2 = new UpiPayment("sravani@upi");
        Payment p3 = new NetBankingPayment("SBI");

        makePayment(p1, 5000);
        makePayment(p2, 2000);
        makePayment(p3, 10000);
    }
}
/*
 * output:
 * Processing credit card payment of ?5000.0
 * Receipt: Paid ?5000.0 via Credit Card
 * 
 * Processing UPI payment of ?2000.0
 * Receipt: Paid ?2000.0 via UPI
 * 
 * Processing Net Banking payment of ?10000.0
 * Receipt: Paid ?10000.0 via Net Banking
 */
