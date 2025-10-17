package patterns.structural.adapter.logger;

public class Application {
    public static void main(String[] args) {
        Logger modernLogger = new ApplicationLogger();
        Logger legacyLogger = new LoggerAdapter(new LegacyLogger());

        modernLogger.log("error", "Not enough items in stock");
        legacyLogger.log("error", "Not enough items in stock");

        modernLogger.log("info", "Item booked");
        legacyLogger.log("info", "Item booked");
    }
}
