package loosecoupling.setter;

import loosecoupling.setter.paymentmethods.Bhim;
import loosecoupling.setter.paymentmethods.Payment;
import loosecoupling.setter.paymentmethods.PhonePe;

public class Main {
    public static void main(String[] args) {
        Checkout payment = new Checkout();

        payment.setPayment(new PhonePe());
    }
}