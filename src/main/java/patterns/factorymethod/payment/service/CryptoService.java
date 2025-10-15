package patterns.factorymethod.payment.service;

import patterns.factorymethod.payment.processor.CryptoProcessor;
import patterns.factorymethod.payment.processor.PaymentProcessor;

public class CryptoService extends PaymentService {
    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new CryptoProcessor();
    }
}
