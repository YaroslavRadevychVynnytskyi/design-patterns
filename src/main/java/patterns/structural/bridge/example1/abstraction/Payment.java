package patterns.structural.bridge.example1.abstraction;

import java.math.BigDecimal;

import patterns.structural.bridge.example1.implementation.PaymentSystem;

public abstract class Payment {
    protected PaymentSystem paymentSystem;

    public Payment(PaymentSystem paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public abstract void pay(BigDecimal amount);
    public abstract void refund(BigDecimal amount);
}
