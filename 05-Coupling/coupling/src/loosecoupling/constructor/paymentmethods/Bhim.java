package loosecoupling.constructor.paymentmethods;

public class Bhim implements Payment {
    @Override
    public void pay() { System.out.println("BHIM Payment."); }
}
