package patterns.structural.decorator.example2;

public class BasicNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Base notification: " + message);
    }
}
