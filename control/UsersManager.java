package Control;

import entity.User;

import java.util.ArrayList;
import java.util.List;

public class UsersManager {
    private List<User> users = new ArrayList<>();

    public List<User> getUsers() {
        return users;
    }
    public void addUser(User user) {
        users.add(user);
    }

    public void deleteUser(String login) {
        users.removeIf(user -> user.getLogin().equals(login));
    }

    public void updateUser(User user) {
        deleteUser(user.getLogin());
        users.add(user);
    }
}