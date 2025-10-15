package patterns.factorymethod.payment;

import java.math.BigDecimal;

import patterns.factorymethod.payment.service.CreditCardService;
import patterns.factorymethod.payment.service.CryptoService;
import patterns.factorymethod.payment.service.PaymentService;

public class Application {
    public static void main(String[] args) {
        PaymentService creditCardPaymentService = new CreditCardService();
        creditCardPaymentService.doPayment(BigDecimal.valueOf(300));

        PaymentService cryptoPaymentService = new CryptoService();
        cryptoPaymentService.doPayment(BigDecimal.valueOf(2));
    }
}
