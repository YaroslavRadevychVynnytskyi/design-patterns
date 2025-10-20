package patterns.behavioral.observer.example2.subject;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import patterns.behavioral.observer.example2.OrderStatus;
import patterns.behavioral.observer.example2.observer.OrderObserver;

public class OrderService implements OrderSubject {
    private final List<OrderObserver> observers = new ArrayList<>();

    @Override
    public void attach(OrderObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(OrderObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(UUID orderId, OrderStatus status) {
        observers.forEach(o -> o.update(orderId,  status));
    }

    public void updateOrderStatus(UUID orderId, OrderStatus status) {
        // Some business logic here...

        // Notify observers
        notifyObservers(orderId, status);
    }
}
