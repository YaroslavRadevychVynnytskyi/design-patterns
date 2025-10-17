package patterns.structural.adapter.example1;

public class LegacyLogger {
    public void info(String message) {
        System.out.println("INFO: " + message);
    }

    public void error(String message) {
        System.out.println("ERROR: " + message);
    }
}
