package patterns.factorymethod.payment.processor;

import java.math.BigDecimal;

public class CryptoProcessor implements PaymentProcessor {
    @Override
    public void process(BigDecimal amount) {
        System.out.println("Processing payment by crypto processor. Amount: " + amount);
    }
}
