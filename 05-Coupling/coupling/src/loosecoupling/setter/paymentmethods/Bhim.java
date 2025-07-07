package loosecoupling.setter.paymentmethods;

public class Bhim implements Payment {
    @Override
    public void pay() { System.out.println("BHIM Payment."); }
}
