package entity;

import control.EntityViewer;

public class User {
    protected String login;
    protected String password;
    protected String token;
    protected Long lastLogin;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User(User umUser) {
    };

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
