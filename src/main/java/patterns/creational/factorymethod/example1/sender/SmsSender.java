package patterns.creational.factorymethod.example1.sender;

public class SmsSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message via SMS: " + message);
    }
}
