package patterns.behavioral.observer.example2.observer;

import java.util.UUID;

import patterns.behavioral.observer.example2.OrderStatus;

public interface OrderObserver {
    void update(UUID orderId, OrderStatus status);
}
