package patterns.structural.bridge.example1.abstraction;

import java.math.BigDecimal;

import patterns.structural.bridge.example1.implementation.PaymentSystem;

public class BasicPayment extends Payment {
    public BasicPayment(PaymentSystem paymentSystem) {
        super(paymentSystem);
    }

    @Override
    public void pay(BigDecimal amount) {
        paymentSystem.processPayment(amount);
    }

    @Override
    public void refund(BigDecimal amount) {
        paymentSystem.refund(amount);
    }
}
