package patterns.creational.factorymethod.messaging;

import patterns.creational.factorymethod.messaging.service.EmailService;
import patterns.creational.factorymethod.messaging.service.MessageService;
import patterns.creational.factorymethod.messaging.service.SlackService;
import patterns.creational.factorymethod.messaging.service.SmsService;
import patterns.creational.factorymethod.messaging.service.TelegramService;

// Simple factory
public class MessageServiceFactory {
    public static MessageService of(String type) {
        return switch (type.toLowerCase()) {
            case "email" -> new EmailService();
            case "sms" -> new SmsService();
            case "telegram" -> new TelegramService();
            case "slack" -> new SlackService();
            default -> throw new IllegalArgumentException("Unknown type: " + type);
        };
    }
}
