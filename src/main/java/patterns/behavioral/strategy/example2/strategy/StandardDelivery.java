package patterns.behavioral.strategy.example2.strategy;

import java.math.BigDecimal;

public class StandardDelivery implements DeliveryStrategy {
    @Override
    public BigDecimal calculatePrice(int weight) {
        return BigDecimal.valueOf(50).add(BigDecimal.valueOf(5).multiply(BigDecimal.valueOf(weight)));
    }
}
