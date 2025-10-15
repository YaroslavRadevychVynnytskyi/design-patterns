package patterns.factorymethod.messaging.sender;

public class SlackSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message via Slack: " + message);
    }
}
