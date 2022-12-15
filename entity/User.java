package entity;

import control.visitor.EntityViewer;

public class User {
    private String login;
    private String password;

    private String token;

    private Long lastActivity;

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

    public Long getLastActivity() {
        return lastActivity;
    }
}
