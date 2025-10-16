package patterns.creational.factorymethod.messaging.service;

import patterns.creational.factorymethod.messaging.sender.MessageSender;
import patterns.creational.factorymethod.messaging.sender.TelegramSender;

public class TelegramService extends MessageService {
    @Override
    public MessageSender createSender() {
        return new TelegramSender();
    }
}
