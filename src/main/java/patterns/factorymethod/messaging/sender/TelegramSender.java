package patterns.factorymethod.messaging.sender;

public class TelegramSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message via Telegram: " + message);
    }
}
