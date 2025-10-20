package patterns.behavioral.strategy.example2;

import java.math.BigDecimal;
import java.util.Map;

import patterns.behavioral.strategy.example2.strategy.DeliveryStrategy;
import patterns.behavioral.strategy.example2.strategy.DeliveryType;
import patterns.behavioral.strategy.example2.strategy.ExpressDelivery;
import patterns.behavioral.strategy.example2.strategy.SelfPickupDelivery;
import patterns.behavioral.strategy.example2.strategy.StandardDelivery;

public class CheckoutService {
    private final Map<DeliveryType, DeliveryStrategy> deliveryStrategyMap;

    public CheckoutService(DeliveryStrategy deliveryStrategy) {
        deliveryStrategyMap = Map.of(
                DeliveryType.STANDARD,  new StandardDelivery(),
                DeliveryType.EXPRESS,   new ExpressDelivery(),
                DeliveryType.SELF,      new SelfPickupDelivery()
        );
    }

    public void checkout(BigDecimal price, int weight, DeliveryType deliveryType) {
        DeliveryStrategy deliveryStrategy = deliveryStrategyMap.get(deliveryType);
        BigDecimal deliveryPrice = deliveryStrategy.calculatePrice(weight);

        BigDecimal totalPrice = price.add(deliveryPrice);
        System.out.printf("Order price: %s\n Delivery Price: %s\n Total price: %s\n", price, deliveryPrice, totalPrice);
    }
}
