package patterns.behavioral.strategy.example1;

import java.math.BigDecimal;

import patterns.behavioral.strategy.example1.strategy.DiscountStrategy;

public class ShoppingCart {
    private DiscountStrategy discountStrategy;

    public void setDiscountStrategy(DiscountStrategy strategy) {
        discountStrategy = strategy;
    }

    public void checkout(BigDecimal price) {
        BigDecimal finalPrice = discountStrategy.applyDiscount(price);
        System.out.println("Checkout process started. Price before discount: "
                + price + ". Price after discount: " + finalPrice);
    }
}
