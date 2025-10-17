package patterns.creational.factorymethod.example2.service;

import java.math.BigDecimal;

import patterns.creational.factorymethod.example2.processor.PaymentProcessor;

public abstract class PaymentService {

    // Factory method
    public abstract PaymentProcessor createPaymentProcessor();

    public void doPayment(BigDecimal amount) {
        PaymentProcessor processor = createPaymentProcessor();
        processor.process(amount);
    }
}
