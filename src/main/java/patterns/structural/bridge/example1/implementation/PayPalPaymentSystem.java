package patterns.structural.bridge.example1.implementation;

import java.math.BigDecimal;

public class PayPalPaymentSystem implements PaymentSystem {
    @Override
    public void processPayment(BigDecimal amount) {
        System.out.println("Processing payment via PayPal. Amount: " + amount);
    }

    @Override
    public void refund(BigDecimal amount) {
        System.out.println("Processing refund via PayPal. Amount: " + amount);
    }
}
