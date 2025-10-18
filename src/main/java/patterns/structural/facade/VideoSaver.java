package patterns.structural.facade;

public class VideoSaver {
    public static void save(VideoFile file) {
        System.out.println("Saving converted video as " + file.getName() + "." + file.getFormat());
    }
}
