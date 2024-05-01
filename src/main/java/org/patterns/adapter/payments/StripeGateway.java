package org.patterns.adapter.payments;

public class StripeGateway {
    public void makePayment(double amount) {
        System.out.println("Payment made: " + amount);
    }
}
