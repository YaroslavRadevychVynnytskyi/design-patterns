package patterns.structural.proxy.example2.db;

public class DatabaseServiceImpl implements DatabaseService {
    @Override
    public String getUserData(String username, String role) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException("Error doing database operation delay simulation", e);
        }
        return String.format("%s [role=%s]", username, role);
    }
}
