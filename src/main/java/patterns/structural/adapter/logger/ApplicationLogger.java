package patterns.structural.adapter.logger;

public class ApplicationLogger implements Logger {
    @Override
    public void log(String level, String message) {
        System.out.printf("[%s] %s\n", level.toUpperCase(), message);
    }
}
