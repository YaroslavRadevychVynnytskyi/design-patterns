package patterns.factorymethod.messaging.service;

import patterns.factorymethod.messaging.sender.MessageSender;
import patterns.factorymethod.messaging.sender.TelegramSender;

public class TelegramService extends MessageService {
    @Override
    public MessageSender createSender() {
        return new TelegramSender();
    }
}
