package patterns.structural.facade;

public class CodecFactory {
    public static String extract(VideoFile videoFile) {
        System.out.println("Extracting codec from video: " + videoFile.getFormat());
        return switch (videoFile.getFormat()) {
            case "mp4" -> "MPEG4";
            case "avi" -> "AVI";
            default -> "Unknown";
        };
    }
}
