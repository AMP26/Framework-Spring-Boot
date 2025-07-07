package tightcoupling;

import tightcoupling.paymentmethods.Payment;
import tightcoupling.paymentmethods.PhonePe;

public class Checkout {
    public void payment() {
        PhonePe phonePe = new PhonePe(); // Tightly Coupled
        phonePe.pay();
    }
}
