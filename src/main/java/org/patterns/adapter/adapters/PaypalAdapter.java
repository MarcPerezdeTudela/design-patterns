package org.patterns.adapter.adapters;

public class PaypalAdapter implements PaymentAdapter {

    org.patterns.adapter.payments.PaypalGateway paypalGateway;

    public PaypalAdapter(org.patterns.adapter.payments.PaypalGateway paypalGateway) {
        this.paypalGateway = paypalGateway;
    }

    @Override
    public void pay(double amount) {
        paypalGateway.sendPayment(amount);
    }
}
