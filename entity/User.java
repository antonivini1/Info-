package entity;

import control.EntityViewer;

public class User {
    private String login;
    private String password;

    private String token;

    private Long lastLogin;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void view(EntityViewer entityViewer) {
        entityViewer.ViewUser(this);
    }

    public String getLogin() {
        return login;
    }

    public String getToken() {
        return token;
    }

    public Long getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Long lastLogin) {
        this.lastLogin = lastLogin;
    }
}
