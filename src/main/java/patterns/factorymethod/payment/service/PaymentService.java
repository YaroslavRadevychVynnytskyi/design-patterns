package patterns.factorymethod.payment.service;

import java.math.BigDecimal;

import patterns.factorymethod.payment.processor.PaymentProcessor;

public abstract class PaymentService {

    // Factory method
    public abstract PaymentProcessor createPaymentProcessor();

    public void doPayment(BigDecimal amount) {
        PaymentProcessor processor = createPaymentProcessor();
        processor.process(amount);
    }
}
