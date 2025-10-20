package patterns.structural.bridge.example1.implementation;

import java.math.BigDecimal;

public interface PaymentSystem {
    void processPayment(BigDecimal amount);
    void refund(BigDecimal amount);
}
