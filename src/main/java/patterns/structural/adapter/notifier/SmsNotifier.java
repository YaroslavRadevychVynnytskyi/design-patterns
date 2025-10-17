package patterns.structural.adapter.notifier;

public class SmsNotifier implements Notifier {
    @Override
    public void send(String recipient, String message) {
        System.out.println("SMS sent to " + recipient + ": " + message);
    }
}
