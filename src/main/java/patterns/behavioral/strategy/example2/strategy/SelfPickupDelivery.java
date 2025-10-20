package patterns.behavioral.strategy.example2.strategy;

import java.math.BigDecimal;

public class SelfPickupDelivery implements DeliveryStrategy {
    @Override
    public BigDecimal calculatePrice(int weight) {
        return BigDecimal.ZERO;
    }
}
