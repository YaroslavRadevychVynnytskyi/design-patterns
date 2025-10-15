package patterns.factorymethod.messaging.service;

import patterns.factorymethod.messaging.sender.MessageSender;
import patterns.factorymethod.messaging.sender.SlackSender;

public class SlackService extends MessageService {
    @Override
    public MessageSender createSender() {
        return new SlackSender();
    }
}
