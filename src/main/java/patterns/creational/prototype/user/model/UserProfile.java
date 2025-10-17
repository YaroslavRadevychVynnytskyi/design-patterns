package patterns.creational.prototype.user.model;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Getter;

import patterns.creational.prototype.user.Prototype;

@Getter
public class UserProfile implements Prototype<UserProfile> {
    private String username;
    private String email;
    private String role;
    private List<Permission> permissions;
    private String theme;
    private String signature;
    private LocalDateTime createdAt;

    public UserProfile(String username, String email, String role, List<Permission> permissions,
            String theme, String signature, LocalDateTime createdAt) {
        this.username = username;
        this.email = email;
        this.role = role;
        this.permissions = permissions;
        this.theme = theme;
        this.signature = signature;
        this.createdAt = createdAt;
    }

    // Copy constructor
    public UserProfile(UserProfile source) {
        this.username = source.username;
        this.email = source.email;
        this.role = source.role;
        // deep cloning of permissions
        this.permissions = source.permissions.stream().map(Permission::new).toList();
        this.theme = source.theme;
        this.signature = source.signature;
        this.createdAt = source.createdAt;
    }

    @Override
    public UserProfile clone() {
        return new UserProfile(this);
    }
}
