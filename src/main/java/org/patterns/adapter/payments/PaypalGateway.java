package org.patterns.adapter.payments;

public class PaypalGateway {
    public void sendPayment(double amount) {
        System.out.println("Payment sent: " + amount);
    }
}
