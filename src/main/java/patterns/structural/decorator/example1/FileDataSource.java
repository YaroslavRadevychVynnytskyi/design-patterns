package patterns.structural.decorator.example1;

public class FileDataSource implements DataSource {
    private final String filename;

    public FileDataSource(String filename) {
        this.filename = filename;
    }

    @Override
    public void writeData(String data) {
        System.out.println("Writing to file: " + data);
    }

    @Override
    public String readData() {
        return "Data from file";
    }
}
