package patterns.behavioral.strategy.example1;

import java.math.BigDecimal;

import patterns.behavioral.strategy.example1.strategy.BlackFridayDiscount;
import patterns.behavioral.strategy.example1.strategy.NoDiscount;
import patterns.behavioral.strategy.example1.strategy.SeasonalDiscount;

public class Application {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setDiscountStrategy(new NoDiscount());
        cart.checkout(BigDecimal.valueOf(1000));

        cart.setDiscountStrategy(new SeasonalDiscount());
        cart.checkout(BigDecimal.valueOf(1000));

        cart.setDiscountStrategy(new BlackFridayDiscount());
        cart.checkout(BigDecimal.valueOf(1000));
    }
}
