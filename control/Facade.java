package control;

import boundary.infra.persistance.InMemoryDaoFactory;
import control.command.*;
import control.validation.InvalidCredentialsException;
import entity.User;

import java.util.Date;
import java.util.HashMap;

public class Facade {
    private UsersManager usersManager = ControllerFactory.createUsersManager();
    private ItemsManager itemsManager = ControllerFactory.createItemsManager();
    private TicketsManager ticketsManager = ControllerFactory.createTicketsManager();

    private HashMap<String, Manager> dataTypes = new HashMap<>() {{
        put("user", usersManager);
        put("item", itemsManager);
        put("ticket", ticketsManager);
    }};

    private HashMap<String, Class<?>> commands = new HashMap<>() {{
        put("insert", InsertCommand.class);
        put("delete", DeleteCommand.class);
        put("update", UpdateCommand.class);
        put("view", ViewCommand.class);
    }};

    public void execute(String dataType, String operation, Arguments args) throws InvalidCredentialsException, InternalErrorException {
        Manager manager = dataTypes.get(dataType);
        try {
            Command command = (Command) commands.get(operation).newInstance();
            command.execute(manager, args);
        } catch (ReflectiveOperationException e) {
            throw new InternalErrorException(e.getMessage());
        }

    }
}
