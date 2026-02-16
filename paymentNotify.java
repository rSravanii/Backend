class paymentService{
    public void notification(){
        System.out.println("the payment is successfull");
    }
}class CreditCardPayment extends paymentService{
    @Override
    public void notification(){
        System.out.println(" CreditCardPayment  is successfull");
    }
}class UpiPayment extends paymentService{
    @Override
    public void notification(){
        System.out.println(" UpiPayment  is successfull");
    }
}
class payment{
    public static void main(String[] args){
        boolean creditCardSuccess = false;
        if (creditCardSuccess){
            paymentService pay1 = new CreditCardPayment();
            pay1.notification();
        }else{
            paymentService pay2 = new  UpiPayment();
            pay2.notification();
        }
    }
}
