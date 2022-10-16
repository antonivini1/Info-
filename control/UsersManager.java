package Control;

import entity.User;

import java.util.ArrayList;
import java.util.List;

public class UsersManager {
    private List<User> users = new ArrayList<>();

    public List<User> getUsers() {
        return users;
    }
    public void addUser(String login, String password) throws InvalidLoginException, InvalidPasswordException {
        ValidateUserDetails.validate(login, password);
        users.add(new User(login, password));
    }

    public void deleteUser(String login) {
        users.removeIf(user -> user.getLogin().equals(login));
    }

    public void updateUser(String oldLogin, String newLogin, String newPassword) throws InvalidLoginException, InvalidPasswordException {
        deleteUser(oldLogin);
        ValidateUserDetails.validate(newLogin, newPassword);
        addUser(newLogin, newPassword);
    }
}