package patterns.factorymethod.messaging;

import patterns.factorymethod.messaging.service.EmailService;
import patterns.factorymethod.messaging.service.MessageService;
import patterns.factorymethod.messaging.service.SlackService;
import patterns.factorymethod.messaging.service.SmsService;
import patterns.factorymethod.messaging.service.TelegramService;

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
