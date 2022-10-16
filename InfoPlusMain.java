import Control.UsersManager;
import boundary.ManageUsersUi;

public class InfoPlusMain {
    public static void main(String[] args) {
        ManageUsersUi.run(new UsersManager());
    }
}
