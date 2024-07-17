package com.security.Entities;

public enum RoleType {
    ADMIN("ADMIN"),
    MEMBER("MEMBER");

    private String roleName;

    RoleType(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }
}
