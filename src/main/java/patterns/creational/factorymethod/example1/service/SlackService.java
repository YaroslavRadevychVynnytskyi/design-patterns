package patterns.creational.factorymethod.example1.service;

import patterns.creational.factorymethod.example1.sender.MessageSender;
import patterns.creational.factorymethod.example1.sender.SlackSender;

public class SlackService extends MessageService {
    @Override
    public MessageSender createSender() {
        return new SlackSender();
    }
}
