package patterns.creational.factorymethod.messaging.sender;

public class EmailSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message via Email: " + message);
    }
}
