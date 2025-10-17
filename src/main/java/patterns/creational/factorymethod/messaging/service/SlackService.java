package patterns.creational.factorymethod.messaging.service;

import patterns.creational.factorymethod.messaging.sender.MessageSender;
import patterns.creational.factorymethod.messaging.sender.SlackSender;

public class SlackService extends MessageService {
    @Override
    public MessageSender createSender() {
        return new SlackSender();
    }
}
