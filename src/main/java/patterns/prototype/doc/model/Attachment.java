package patterns.prototype.doc.model;

public class Attachment {
    private String fileName;
    private long fileSize;

    public Attachment(String fileName, long fileSize) {
        this.fileName = fileName;
        this.fileSize = fileSize;
    }

    // Copy constructor
    public Attachment(Attachment source) {
        this.fileName = source.fileName;
        this.fileSize = source.fileSize;
    }
}
