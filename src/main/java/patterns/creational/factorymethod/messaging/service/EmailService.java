package patterns.creational.factorymethod.messaging.service;

import patterns.creational.factorymethod.messaging.sender.EmailSender;
import patterns.creational.factorymethod.messaging.sender.MessageSender;

public class EmailService extends MessageService {
    @Override
    public MessageSender createSender() {
        return new EmailSender();
    }
}
