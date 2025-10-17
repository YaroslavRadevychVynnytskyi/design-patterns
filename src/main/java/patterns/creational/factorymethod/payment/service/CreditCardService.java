package patterns.creational.factorymethod.payment.service;

import patterns.creational.factorymethod.payment.processor.CreditCardProcessor;
import patterns.creational.factorymethod.payment.processor.PaymentProcessor;

public class CreditCardService extends PaymentService {
    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new CreditCardProcessor();
    }
}
