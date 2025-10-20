package patterns.structural.bridge.example1.abstraction;

import java.math.BigDecimal;

import patterns.structural.bridge.example1.implementation.PaymentSystem;

public class SecurePayment extends Payment {
    public SecurePayment(PaymentSystem paymentSystem) {
        super(paymentSystem);
    }

    @Override
    public void pay(BigDecimal amount) {
        checkAuthorization();
        paymentSystem.processPayment(amount);
    }

    @Override
    public void refund(BigDecimal amount) {
        checkAuthorization();
        paymentSystem.refund(amount);
    }

    private void checkAuthorization() {
        System.out.println("Checking authorization...");
    }
}
