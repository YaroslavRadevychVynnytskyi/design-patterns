package patterns.behavioral.observer.example2.observer;

import java.util.UUID;

import patterns.behavioral.observer.example2.OrderStatus;

public class WarehouseService implements OrderObserver {
    @Override
    public void update(UUID orderId, OrderStatus status) {
        if (OrderStatus.PAID == status)
            System.out.printf("Preparing order delivery. Order ID: %s\n", orderId);
    }
}
