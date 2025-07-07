package loosecoupling.constructor;

import loosecoupling.constructor.paymentmethods.Payment;

public class Checkout {
    private Payment payment;

    public Checkout(Payment payment) { this.payment = payment; }

    public void payment() {
        payment.pay();
    }
}
