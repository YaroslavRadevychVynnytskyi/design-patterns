package patterns.structural.decorator.example2.decorator;

import patterns.structural.decorator.example2.Notifier;

public class EmailNotifier extends NotifierDecorator {

    public EmailNotifier(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendEmail(message);
    }

    private void sendEmail(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}
