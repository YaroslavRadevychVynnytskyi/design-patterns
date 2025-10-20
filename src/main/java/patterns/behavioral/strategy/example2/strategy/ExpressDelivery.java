package patterns.behavioral.strategy.example2.strategy;

import java.math.BigDecimal;

public class ExpressDelivery implements DeliveryStrategy {
    @Override
    public BigDecimal calculatePrice(int weight) {
        return BigDecimal.valueOf(150).add(BigDecimal.valueOf(10).multiply(BigDecimal.valueOf(weight)));
    }
}
