package patterns.factorymethod.payment.service;

import patterns.factorymethod.payment.processor.CreditCardProcessor;
import patterns.factorymethod.payment.processor.PaymentProcessor;

public class CreditCardService extends PaymentService {
    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new CreditCardProcessor();
    }
}
