package entity;

import control.EntityViewer;

public class UserDecorator extends User {
    User user;

    public UserDecorator(User umUser) {
       user = umUser;
    }

    @Override
	public String getToken() {
        return user.getToken() + flag;
    }
}
