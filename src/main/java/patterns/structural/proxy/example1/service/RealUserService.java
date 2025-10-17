package patterns.structural.proxy.example1.service;

public class RealUserService implements UserService {

    @Override
    public void viewUserProfile(String username, String role) {
        System.out.println("Fetching profile for user: " + username);

        if ("ROLE_ADMIN".equals(role)) {
            System.out.println("Full data: username=" + username + ", email=" + username + "@mail.com, salary=1000$");
        } else {
            System.out.println("Limited data: username=" + username + ", email=" + username + "@mail.com");
        }
    }
}
