package patterns.creational.factorymethod.example1.service;

import patterns.creational.factorymethod.example1.sender.MessageSender;

public abstract class MessageService {

    // Factory method
    public abstract MessageSender createSender();

    public void send(String message) {
        MessageSender sender = createSender();
        sender.sendMessage(message);
    }
}
