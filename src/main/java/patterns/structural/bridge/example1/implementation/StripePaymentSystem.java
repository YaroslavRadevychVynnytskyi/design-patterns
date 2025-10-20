package patterns.structural.bridge.example1.implementation;

import java.math.BigDecimal;

public class StripePaymentSystem implements PaymentSystem {
    @Override
    public void processPayment(BigDecimal amount) {
        System.out.println("Processing payment via Stripe. Amount: " + amount);
    }

    @Override
    public void refund(BigDecimal amount) {
        System.out.println("Processing refund via Stripe. Amount: " + amount);
    }
}
