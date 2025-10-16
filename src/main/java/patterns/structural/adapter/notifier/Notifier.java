package patterns.structural.adapter.notifier;

public interface Notifier {
    void send(String recipient, String message);
}
