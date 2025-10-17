package patterns.creational.prototype.user;

import java.time.LocalDateTime;
import java.util.List;

import patterns.creational.prototype.user.model.Permission;
import patterns.creational.prototype.user.model.UserProfile;

public class Application {
    public static void main(String[] args) {
        Permission read = new Permission("1", "READ");
        Permission post = new Permission("2", "POST");
        Permission delete = new Permission("3", "DELETE");
        Permission moderate = new Permission("4", "MODERATE");

        UserProfile standard = new UserProfile(
                "slavko_slavik",
                "slavik@email.com",
                "ROLE_USER",
                List.of(read, post),
                "DARK",
                "SGN",
                LocalDateTime.now()
        );

        UserProfile admin = new UserProfile(
                "admin34223",
                "admin34223@email.com",
                "ROLE_ADMIN",
                List.of(read, post, delete),
                "LIGHT",
                "SGN-A",
                LocalDateTime.now()
        );

        UserProfile moderator = new UserProfile(
                "moderator-543",
                "moderator-543@email.com",
                "ROLE_MODERATOR",
                List.of(moderate),
                "LIGHT",
                "SGN-M",
                LocalDateTime.now()
        );

        ProfileRegistry registry = new ProfileRegistry();
        registry.registerProfile("standard", standard);
        registry.registerProfile("admin", admin);
        registry.registerProfile("moderator", moderator);

        UserProfile user1 = registry.createProfile("standard");
        UserProfile user2 = registry.createProfile("admin");

        System.out.println("Cloned user1: " + user1);
        System.out.println("Cloned user2: " + user2);
    }
}
