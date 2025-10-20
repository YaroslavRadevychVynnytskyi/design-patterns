package patterns.behavioral.strategy.example1.strategy;

import java.math.BigDecimal;

public interface DiscountStrategy {
    BigDecimal applyDiscount(BigDecimal price);
}
