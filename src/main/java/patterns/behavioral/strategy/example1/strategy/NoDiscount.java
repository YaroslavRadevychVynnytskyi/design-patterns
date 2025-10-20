package patterns.behavioral.strategy.example1.strategy;

import java.math.BigDecimal;

public class NoDiscount implements DiscountStrategy {
    @Override
    public BigDecimal applyDiscount(BigDecimal price) {
        return price;
    }
}
