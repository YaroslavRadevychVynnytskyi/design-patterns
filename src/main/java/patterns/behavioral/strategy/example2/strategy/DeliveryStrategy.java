package patterns.behavioral.strategy.example2.strategy;

import java.math.BigDecimal;

public interface DeliveryStrategy {
    BigDecimal calculatePrice(int weight);
}
