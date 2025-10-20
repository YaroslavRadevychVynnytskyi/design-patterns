package patterns.behavioral.observer.example2.observer;

import java.util.UUID;

import patterns.behavioral.observer.example2.OrderStatus;

public class AnalyticsService implements OrderObserver {
    @Override
    public void update(UUID orderId, OrderStatus status) {
        System.out.printf("Saving order log into analytics db. Order ID: %s. New status: %s\n", orderId, status.name());
    }
}
