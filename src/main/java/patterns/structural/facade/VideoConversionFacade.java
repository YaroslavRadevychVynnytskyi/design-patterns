package patterns.structural.facade;

public class VideoConversionFacade {

    public VideoFile convertVideo(String filename, String targetFormat) {
        System.out.println("Starting video conversion...");

        // 1. Load the original video
        VideoFile file = new VideoFile(filename, "mp4");

        // 2. Extract current codec
        String sourceCodec = CodecFactory.extract(file);

        // 3. Convert to target format
        VideoFile converted = VideoConvertor.convert(file, targetFormat);

        // 4. Save new video
        VideoSaver.save(converted);

        System.out.println("Video conversion completed!");
        return converted;
    }
}
