package patterns.creational.singleton;

// Enum-based singleton object
public enum DatabaseEnum {

    INSTANCE("Initial val");

    private String value;

    DatabaseEnum(String value) {
        this.value = value;
    }

    public DatabaseEnum getInstance() {
        return INSTANCE;
    }

    public String getValue() {
        return value;
    }
}
