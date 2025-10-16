package patterns.structural.adapter.notifier;

public class EmailAdapter implements Notifier {
    private final EmailSender emailSender;

    public EmailAdapter(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    @Override
    public void send(String recipient, String message) {
        emailSender.sendEmail(recipient, "No subject", message);
    }
}
