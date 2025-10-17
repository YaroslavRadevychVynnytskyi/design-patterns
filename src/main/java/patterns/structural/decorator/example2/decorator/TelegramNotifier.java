package patterns.structural.decorator.example2.decorator;

import patterns.structural.decorator.example2.Notifier;

public class TelegramNotifier extends NotifierDecorator {

    public TelegramNotifier(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendTelegramNotification(message);
    }

    private void sendTelegramNotification(String message) {
        System.out.println("Sending Telegram: " + message);
    }
}
