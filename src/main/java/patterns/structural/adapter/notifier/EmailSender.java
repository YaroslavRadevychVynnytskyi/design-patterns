package patterns.structural.adapter.notifier;

public class EmailSender {
    public void sendEmail(String to, String title, String body) {
        System.out.println("Email sent to " + to + ": " + title + " - " + body);
    }
}
