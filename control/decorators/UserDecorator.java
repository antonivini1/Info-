package control.decorators;

import entity.User;

public class UserDecorator extends User {
    User user;

    public UserDecorator(User umUser) {
        super(umUser);
        // user = umUser;
    }

    @Override
    public String getToken() {
        return user.getToken() + token;
    }
}
