package loosecoupling.constructor.paymentmethods;

public class CreditCard implements Payment {
    public void pay() { System.out.println("CreditCard Payment."); }
}
