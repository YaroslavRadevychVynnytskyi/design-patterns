package patterns.structural.facade;

public class Application {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();

        converter.convertVideo("ялта_2007", "MP4");
        System.out.println();
        converter.convertVideo("funny_cats", "AVI");
    }
}
