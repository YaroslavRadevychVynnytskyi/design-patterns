package patterns.factorymethod.messaging;

import patterns.factorymethod.messaging.service.EmailService;
import patterns.factorymethod.messaging.service.MessageService;
import patterns.factorymethod.messaging.service.SlackService;
import patterns.factorymethod.messaging.service.SmsService;
import patterns.factorymethod.messaging.service.TelegramService;

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
