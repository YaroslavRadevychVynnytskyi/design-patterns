package patterns.structural.adapter.example2;

public class SmsNotifier implements Notifier {
    @Override
    public void send(String recipient, String message) {
        System.out.println("SMS sent to " + recipient + ": " + message);
    }
}
