package patterns.creational.factorymethod.messaging.sender;

public class SmsSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message via SMS: " + message);
    }
}
