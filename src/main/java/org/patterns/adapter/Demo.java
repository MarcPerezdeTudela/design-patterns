package org.patterns.adapter;

import org.patterns.adapter.adapters.PaymentAdapter;
import org.patterns.adapter.adapters.PaypalAdapter;
import org.patterns.adapter.adapters.StripeAdapter;
import org.patterns.adapter.payments.PaypalGateway;
import org.patterns.adapter.payments.StripeGateway;

public class Demo {
    public static void main(String[] args) {
        PaymentAdapter paypalAdapter = new PaypalAdapter(new PaypalGateway());
        paypalAdapter.pay(100);
        PaymentAdapter stripeAdapter = new StripeAdapter(new StripeGateway());
        stripeAdapter.pay(200);
    }
}
