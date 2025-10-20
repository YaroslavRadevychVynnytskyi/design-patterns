package patterns.behavioral.strategy.example1.strategy;

import java.math.BigDecimal;

public class BlackFridayDiscount implements DiscountStrategy {
    @Override
    public BigDecimal applyDiscount(BigDecimal price) {
        BigDecimal discount = BigDecimal.valueOf(0.5).multiply(price);
        return price.subtract(discount);
    }
}
