package patterns.creational.factorymethod.messaging;

import patterns.creational.factorymethod.messaging.service.EmailService;
import patterns.creational.factorymethod.messaging.service.MessageService;
import patterns.creational.factorymethod.messaging.service.SlackService;
import patterns.creational.factorymethod.messaging.service.SmsService;
import patterns.creational.factorymethod.messaging.service.TelegramService;

public class Application {

    public static void main(String[] args) {

        MessageService emailService = new EmailService();
        emailService.send("Hello, World!");

        MessageService smsService = new SmsService();
        smsService.send("Hello, World!");

        MessageService telegramService = new TelegramService();
        telegramService.send("Hello, World!");

        MessageService slackService = new SlackService();
        slackService.send("Hello, World!");

        MessageService slackServiceFromSimpleFactory = MessageServiceFactory.of("slack");
        slackServiceFromSimpleFactory.send("Hello, World!");

    }
}
