package patterns.creational.prototype.doc.model;

import java.time.LocalDateTime;
import java.util.List;

public class Document {
    private String title;
    private String author;
    private String content;
    private List<Attachment> attachments;
    private LocalDateTime createdAt;

    public Document(String title, String author, String content,
            List<Attachment> attachments, LocalDateTime createdAt) {
        this.title = title;
        this.author = author;
        this.content = content;
        this.attachments = attachments;
        this.createdAt = createdAt;
    }

    // Copy constructor
    public Document(Document source) {
        this.title = source.title;
        this.author = source.author;
        this.content = source.content;
        this.attachments = source.attachments.stream().map(Attachment::new).toList();
        this.createdAt = source.createdAt;
    }

    public Document clone() {
        return new Document(this);
    }
}
