package patterns.structural.proxy.example1.service;

import java.util.Random;

public class UserServiceProxy implements UserService {
    private final Random random;
    private final RealUserService realUserService;

    public UserServiceProxy(RealUserService userService) {
        random = new Random();
        realUserService = userService;
    }

    @Override
    public void viewUserProfile(String username, String role) {
        if (!isAuthenticated(username)) {
            throw new IllegalStateException("Access denied. Not authenticated");
        }

        System.out.println("[LOG] User with role " + role + " is requesting profile of " + username);
        realUserService.viewUserProfile(username, role);
    }

    private boolean isAuthenticated(String username) {
        boolean authenticated = random.nextBoolean();
        System.out.printf("User %s authenticated = %s\n", username, authenticated);

        return authenticated;
    }
}
