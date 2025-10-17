package patterns.structural.adapter.example1;

public class ApplicationLogger implements Logger {
    @Override
    public void log(String level, String message) {
        System.out.printf("[%s] %s\n", level.toUpperCase(), message);
    }
}
