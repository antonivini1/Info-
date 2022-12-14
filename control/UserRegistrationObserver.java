package control;

import entity.User;

public interface UserRegistrationObserver {
    void onUserRegistered(User user);
}
