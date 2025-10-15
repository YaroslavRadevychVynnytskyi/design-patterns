package patterns.factorymethod.messaging.service;

import patterns.factorymethod.messaging.sender.MessageSender;

public abstract class MessageService {

    // Factory method
    public abstract MessageSender createSender();

    public void send(String message) {
        MessageSender sender = createSender();
        sender.sendMessage(message);
    }
}
