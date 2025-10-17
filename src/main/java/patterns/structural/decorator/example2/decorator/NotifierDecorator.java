package patterns.structural.decorator.example2.decorator;

import patterns.structural.decorator.example2.Notifier;

public abstract class NotifierDecorator implements Notifier {
    private final Notifier wrappee;

    protected NotifierDecorator(Notifier notifier) {
        this.wrappee = notifier;
    }

    @Override
    public void send(String message) {
        wrappee.send(message);
    }
}
