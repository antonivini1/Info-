package control;

import control.command.CommandData;
import control.visitor.EntityViewer;
import entity.User;

import java.util.List;

public class UsersManager implements Service {
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

    @Override
    public Memento createMemento() {
        return users.createMemento();
    }

    @Override
    public void restoreMemento(Memento m) {
        users.restoreMemento(m);
    }

    @Override
    public void insert(CommandData data) throws InvalidLoginException, InvalidPasswordException {
        List<Object> args =  data.getArgs();
        addUser((String) args.get(0), (String) args.get(1));
    }

    @Override
    public void delete(CommandData data) {
        List<Object> args =  data.getArgs();
        deleteUser((String) args.get(0));
    }

    @Override
    public void update(CommandData data) throws InvalidCredentialsException {
        List<Object> args =  data.getArgs();
        updateUser((String) args.get(0), (String) args.get(1), (String) args.get(2));
    }

    @Override
    public void viewAll(EntityViewer visitor) {
        for (User user : getUsers()) {
            user.view(visitor);
        }
    }
}