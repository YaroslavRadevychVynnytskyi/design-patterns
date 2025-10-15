package patterns.factorymethod.messaging.service;

import patterns.factorymethod.messaging.sender.EmailSender;
import patterns.factorymethod.messaging.sender.MessageSender;

public class EmailService extends MessageService {
    @Override
    public MessageSender createSender() {
        return new EmailSender();
    }
}
