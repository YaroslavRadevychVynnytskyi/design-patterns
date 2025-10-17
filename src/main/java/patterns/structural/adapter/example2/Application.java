package patterns.structural.adapter.example2;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        List<Notifier> notifiers = List.of(
                new EmailAdapter(new EmailSender()),
                new SmsNotifier()
        );

        notifiers.forEach(n -> n.send("slavko_slavik", "HeLlO, WOrLd!"));
    }
}
