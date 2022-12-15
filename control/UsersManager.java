package control;

import control.backup.Memento;
import control.validation.InvalidCredentialsException;
import control.validation.InvalidLoginException;
import control.validation.InvalidPasswordException;
import control.validation.ValidateUserDetails;
import entity.User;

import java.util.ArrayList;
import java.util.List;

public class UsersManager implements Manager {
    private Dao<String, User> users;
    private ArrayList<UserRegistrationObserver> observers;

    public UsersManager(DaoFactory<String, User> factory) {
        users = factory.createDao();
    }

    public void addObserver(UserRegistrationObserver observer) {
        observers.add(observer);
    }

    public List<User> getUsers() {
        return users.getAll();
    }
    public void addUser(String login, String password) throws InvalidLoginException, InvalidPasswordException {
        ValidateUserDetails.validate(login, password);
        User newUser = new User(login, password);
        users.add(login, newUser);
        for (UserRegistrationObserver observer : observers) {
            observer.onUserRegistered(newUser);
        }
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
    public void insert(Arguments data) throws InvalidLoginException, InvalidPasswordException {
        List<Object> args =  data.getArgs();
        addUser((String) args.get(0), (String) args.get(1));
    }

    @Override
    public void delete(Arguments data) {
        List<Object> args =  data.getArgs();
        deleteUser((String) args.get(0));
    }

    @Override
    public void update(Arguments data) throws InvalidCredentialsException {
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