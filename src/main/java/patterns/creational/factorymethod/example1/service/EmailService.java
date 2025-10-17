package patterns.creational.factorymethod.example1.service;

import patterns.creational.factorymethod.example1.sender.EmailSender;
import patterns.creational.factorymethod.example1.sender.MessageSender;

public class EmailService extends MessageService {
    @Override
    public MessageSender createSender() {
        return new EmailSender();
    }
}
