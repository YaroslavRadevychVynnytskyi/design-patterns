package patterns.structural.facade;

public class VideoConvertor {
    public static VideoFile convert(VideoFile file, String codec) {
        System.out.println("Converting video to format: " + codec);
        return new VideoFile(file.getName(), codec.toLowerCase());
    }
}
