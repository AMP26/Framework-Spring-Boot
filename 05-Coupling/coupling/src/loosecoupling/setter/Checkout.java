package loosecoupling.setter;

import loosecoupling.setter.paymentmethods.Payment;

public class Checkout {

    public void setPayment(Payment payment) {
        payment.pay();
    }
}
