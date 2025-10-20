package patterns.behavioral.observer.example2;

import java.util.List;
import java.util.UUID;

import patterns.behavioral.observer.example2.observer.AnalyticsService;
import patterns.behavioral.observer.example2.observer.EmailNotificationService;
import patterns.behavioral.observer.example2.observer.WarehouseService;
import patterns.behavioral.observer.example2.subject.OrderService;

public class Application {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        List.of(new EmailNotificationService(), new AnalyticsService(), new WarehouseService()).forEach(orderService::attach);
        UUID order1 = UUID.randomUUID();

        orderService.updateOrderStatus(order1, OrderStatus.NEW);
        orderService.updateOrderStatus(order1, OrderStatus.APPROVED);
        orderService.updateOrderStatus(order1, OrderStatus.PAID);
        orderService.updateOrderStatus(order1, OrderStatus.DELIVERED);
    }
}
