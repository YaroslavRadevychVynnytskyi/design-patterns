package patterns.creational.factorymethod.example1.sender;

public class SlackSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message via Slack: " + message);
    }
}
