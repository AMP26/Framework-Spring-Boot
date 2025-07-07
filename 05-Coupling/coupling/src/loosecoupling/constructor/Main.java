package loosecoupling.constructor;

import loosecoupling.constructor.paymentmethods.Bhim;
import loosecoupling.constructor.paymentmethods.Payment;

public class Main {
    public static void main(String[] args) {

        Payment payment = new Bhim();

        Checkout app = new Checkout(payment);
        app.payment();
    }
}