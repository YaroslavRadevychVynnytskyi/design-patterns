package patterns.factorymethod.payment.processor;

import java.math.BigDecimal;

public class CreditCardProcessor implements PaymentProcessor {
    @Override
    public void process(BigDecimal amount) {
        System.out.println("Processing payment by credit card processor. Amount: " + amount);
    }
}
