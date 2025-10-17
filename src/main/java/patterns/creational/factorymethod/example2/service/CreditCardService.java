package patterns.creational.factorymethod.example2.service;

import patterns.creational.factorymethod.example2.processor.CreditCardProcessor;
import patterns.creational.factorymethod.example2.processor.PaymentProcessor;

public class CreditCardService extends PaymentService {
    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new CreditCardProcessor();
    }
}
