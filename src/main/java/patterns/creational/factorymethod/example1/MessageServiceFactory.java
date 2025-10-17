package patterns.creational.factorymethod.example1;

import patterns.creational.factorymethod.example1.service.EmailService;
import patterns.creational.factorymethod.example1.service.MessageService;
import patterns.creational.factorymethod.example1.service.SlackService;
import patterns.creational.factorymethod.example1.service.SmsService;
import patterns.creational.factorymethod.example1.service.TelegramService;

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
