package entity;

public class Admin extends User{
    public User addUser(String login, String password){
        User TBA = new User();
        TBA.login = login;
        TBA.password = password;
        return TBA;
    }
}
