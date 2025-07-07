package tightcoupling;

import tightcoupling.paymentmethods.Bhim;
import tightcoupling.paymentmethods.Payment;

public class Main {
    public static void main(String[] args) {
        Checkout app = new Checkout();
        app.payment();
    }
}