package patterns.creational.factorymethod.example2.service;

import patterns.creational.factorymethod.example2.processor.CryptoProcessor;
import patterns.creational.factorymethod.example2.processor.PaymentProcessor;

public class CryptoService extends PaymentService {
    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new CryptoProcessor();
    }
}
