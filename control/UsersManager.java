package control;

import entity.User;

import java.util.List;

public class UsersManager {
    private Dao<String, User> users;

    public UsersManager(DaoFactory<String, User> factory) {
        users = factory.createDao();
    }

    public List<User> getUsers() {
        return users.getAll();
    }
    public void addUser(String login, String password) throws InvalidLoginException, InvalidPasswordException {
        ValidateUserDetails.validate(login, password);
        users.add(login, new User(login, password));
    }

    public void deleteUser(String login) {
        users.delete(login);
    }

    public void updateUser(String oldLogin, String newLogin, String newPassword) throws InvalidLoginException, InvalidPasswordException {
        deleteUser(oldLogin);
        addUser(newLogin, newPassword);
    }
}