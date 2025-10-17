package patterns.creational.prototype.user.model;

public class Permission {
    private String permissionId;
    private String name;

    public Permission(String permissionId, String name) {
        this.permissionId = permissionId;
        this.name = name;
    }

    // Copy constructor
    public Permission(Permission source) {
        this.permissionId = source.permissionId;
        this.name = source.name;
    }
}
