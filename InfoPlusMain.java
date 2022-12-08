import boundary.ManageUsersUi;
import boundary.infra.InMemoryDaoFactory;
import control.UsersManager;

public class InfoPlusMain {
    public void main(String[] args) {
        ManageUsersUi.run(new UsersManager(new InMemoryDaoFactory<>()));
    }
}
