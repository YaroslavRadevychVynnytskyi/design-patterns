package patterns.structural.decorator.example2.decorator;

import patterns.structural.decorator.example2.Notifier;

public class SmsNotifier extends NotifierDecorator {

    public SmsNotifier(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendSms(message);
    }

    private void sendSms(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
