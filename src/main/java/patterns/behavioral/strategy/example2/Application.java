package patterns.behavioral.strategy.example2;

import java.math.BigDecimal;

import patterns.behavioral.strategy.example2.strategy.DeliveryType;
import patterns.behavioral.strategy.example2.strategy.StandardDelivery;

public class Application {
    public static void main(String[] args) {
        CheckoutService checkoutService = new CheckoutService(new StandardDelivery());

        checkoutService.checkout(BigDecimal.valueOf(100), 4, DeliveryType.STANDARD);
    }
}
