package patterns.structural.proxy.example2.db;

import java.util.HashMap;
import java.util.Map;

public class DatabaseServiceProxy implements DatabaseService {
    private final Map<String, String> cache = new HashMap<>();
    private DatabaseServiceImpl databaseService;

    @Override
    public String getUserData(String username, String role) {
        // Searching in cache
        if (cache.containsKey(username)) {
            System.out.printf("Returning user data from cache for user [%s]\n", username);
            return cache.get(username);
        }

        // Actual db request (if not found in the cache)
        if (databaseService == null) databaseService = new DatabaseServiceImpl();

        System.out.printf("User data not found in cache for user [%s], requesting db...\n", username);
        String userData = databaseService.getUserData(username, role);
        cache.put(username, userData);

        System.out.printf("Returning user data from database for user [%s]\n", username);
        return userData;
    }
}
