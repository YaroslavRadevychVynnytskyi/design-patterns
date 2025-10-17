package patterns.creational.prototype.user;

import java.util.HashMap;
import java.util.Map;

import patterns.creational.prototype.user.model.UserProfile;

public class ProfileRegistry {
    private final Map<String, UserProfile> profiles = new HashMap<>();

    public void registerProfile(String key, UserProfile profile) {
        profiles.put(key, profile);
    }

    public UserProfile createProfile(String key) {
        UserProfile prototype = profiles.get(key);
        if (prototype == null) {
            throw new IllegalArgumentException("No profile found for key: " + key);
        }
        return prototype.clone();
    }
}
