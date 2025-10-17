package patterns.creational.factorymethod.example2.processor;

import java.math.BigDecimal;

public interface PaymentProcessor {
    void process(BigDecimal amount);
}
