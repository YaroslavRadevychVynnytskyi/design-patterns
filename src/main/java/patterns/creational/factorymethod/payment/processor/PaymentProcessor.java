package patterns.creational.factorymethod.payment.processor;

import java.math.BigDecimal;

public interface PaymentProcessor {
    void process(BigDecimal amount);
}
