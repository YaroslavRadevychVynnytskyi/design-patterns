package patterns.structural.adapter.example1;

public class LoggerAdapter implements Logger {
    private final LegacyLogger legacyLogger;

    public LoggerAdapter(LegacyLogger legacyLogger) {
        this.legacyLogger = legacyLogger;
    }

    @Override
    public void log(String level, String message) {
        if (level.equalsIgnoreCase("info")) {
            legacyLogger.info(message);
        } else {
            legacyLogger.error(message);
        }
    }
}
