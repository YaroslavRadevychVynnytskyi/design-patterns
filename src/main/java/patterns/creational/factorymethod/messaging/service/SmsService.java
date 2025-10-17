package patterns.creational.factorymethod.messaging.service;

import patterns.creational.factorymethod.messaging.sender.MessageSender;
import patterns.creational.factorymethod.messaging.sender.SmsSender;

public class SmsService extends MessageService {
    @Override
    public MessageSender createSender() {
        return new SmsSender();
    }
}
