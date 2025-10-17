package patterns.structural.decorator.example2;

import patterns.structural.decorator.example2.decorator.EmailNotifier;
import patterns.structural.decorator.example2.decorator.SmsNotifier;
import patterns.structural.decorator.example2.decorator.TelegramNotifier;

public class Application {
    public static void main(String[] args) {

        Notifier notifier = new TelegramNotifier(
                new SmsNotifier(
                        new EmailNotifier(
                                new BasicNotifier()
                        )
                )
        );

        notifier.send("hElLo, WOrLd!");
    }
}
