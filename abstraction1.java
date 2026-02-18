//pqyment System (abstraction)


abstract class paymentService{
    abstract void processPayment(double ammount);
    void generateReceipt(double ammount){
        System.out.println("Payment of " + ammount + " processed successfully.");
    }
}class creditCardPayment extends paymentService{
    @Override
    void processPayment(double ammount){
        System.out.println("Processing credit card payment of " + ammount);
        generateReceipt(ammount);
    }
}
class upiPayment extends paymentService{
    @Override
    void processPayment(double ammount){
        System.out.println("Processing UPI payment of " + ammount);
        generateReceipt(ammount);
    }
}

public class abstraction1 {
    public static void main(String[] args) {

        boolean useCreditCard = true;
        paymentService payment;
        if (useCreditCard) {
            payment = new creditCardPayment();
        } else {
            payment = new upiPayment();
        }
        payment.processPayment(1000.0);
        
    }
    
}//output
//Processing credit card payment of 1000.0
//Payment of 1000.0 processed successfully.
