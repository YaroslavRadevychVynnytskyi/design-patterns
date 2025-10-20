package patterns.behavioral.observer.example2.subject;

import java.util.UUID;

import patterns.behavioral.observer.example2.OrderStatus;
import patterns.behavioral.observer.example2.observer.OrderObserver;

public interface OrderSubject {
    void attach(OrderObserver observer);
    void detach(OrderObserver observer);
    void notifyObservers(UUID orderId, OrderStatus status);
}
