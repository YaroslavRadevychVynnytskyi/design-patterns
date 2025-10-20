package patterns.behavioral.observer.example2.observer;

import java.util.UUID;

import patterns.behavioral.observer.example2.OrderStatus;

public class EmailNotificationService implements OrderObserver {
    @Override
    public void update(UUID orderId, OrderStatus status) {
        System.out.printf("Sending email to customer. Order ID: %s. New status: %s\n", orderId, status.name());
    }
}
