package control;

import boundary.infra.persistance.InMemoryDaoFactory;
import entity.User;

import java.util.Date;

public class ControllerFactory {
    public static UsersManager createUsersManager() {
        return new UsersManager(new InMemoryDaoFactory<>()) {{
            addObserver(new UserRegistrationObserver() {
                @Override
                public void onUserRegistered(User user) {
                    System.out.println("Bem-vindo " + user.getLogin());
                    System.out.println("Confira essas recomendações");
                    user.setLastLogin(new Date().getTime());
                }
            });
        }};
    }

    public static ItemsManager createItemsManager() {
        return new ItemsManager(new InMemoryDaoFactory<>());
    }

    public static TicketsManager createTicketsManager() {
        return new TicketsManager(new InMemoryDaoFactory<>());
    }
}
