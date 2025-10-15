package patterns.factorymethod.messaging.service;

import patterns.factorymethod.messaging.sender.MessageSender;
import patterns.factorymethod.messaging.sender.SmsSender;

public class SmsService extends MessageService {
    @Override
    public MessageSender createSender() {
        return new SmsSender();
    }
}
