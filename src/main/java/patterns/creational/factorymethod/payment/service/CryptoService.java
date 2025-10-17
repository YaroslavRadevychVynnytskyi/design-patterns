package patterns.creational.factorymethod.payment.service;

import patterns.creational.factorymethod.payment.processor.CryptoProcessor;
import patterns.creational.factorymethod.payment.processor.PaymentProcessor;

public class CryptoService extends PaymentService {
    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new CryptoProcessor();
    }
}
