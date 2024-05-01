package org.patterns.adapter.adapters;

public class StripeAdapter implements PaymentAdapter {

        org.patterns.adapter.payments.StripeGateway stripeGateway;

        public StripeAdapter(org.patterns.adapter.payments.StripeGateway stripeGateway) {
            this.stripeGateway = stripeGateway;
        }

        @Override
        public void pay(double amount) {
            stripeGateway.makePayment(amount);
        }
}
