package patterns.singleton;

// Class-based singleton object
public class DatabaseClass {
    private static DatabaseClass instance = null;

    private DatabaseClass() {
        System.out.println("Database connection initialized");
    }

    public static synchronized DatabaseClass getInstance() {
        if (instance == null) {
            instance = new DatabaseClass();
        }
        return instance;
    }

}
