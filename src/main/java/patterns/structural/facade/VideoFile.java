package patterns.structural.facade;

public class VideoFile {
    private String name;
    private String format;

    public VideoFile(String name, String format) {
        this.name = name;
        this.format = format;
    }

    public String getName() {
        return name;
    }

    public String getFormat() {
        return format;
    }
}
