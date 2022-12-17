package entity;

public class Admin extends UserDecorator {
    public Admin(String login, String password) {
        super(login, password);
        flag = "ADMIN";
    }
}
