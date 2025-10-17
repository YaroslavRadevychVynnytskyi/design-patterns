package patterns.creational.prototype.doc;

import java.time.LocalDateTime;
import java.util.List;

import patterns.creational.prototype.doc.model.Attachment;
import patterns.creational.prototype.doc.model.Document;

public class Application {
    public static void main(String[] args) {
        List<Attachment> attachments = List.of(
                new Attachment("invoice.pdf", 2),
                new Attachment("signing-key.pem", 1)
                );

        // prototype object
        Document invoiceTemplate = new Document(
                "Invoice",
                "Alice X",
                "Your salary for last month is 100$",
                attachments,
                LocalDateTime.now()
        );

        Document invoiceCopy = invoiceTemplate.clone();
    }
}
