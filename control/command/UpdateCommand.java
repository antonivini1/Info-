package control.command;

import control.Arguments;
import control.validation.InvalidCredentialsException;
import control.Manager;

public class UpdateCommand implements Command {
    @Override
    public void execute(Manager manager, Arguments data) throws InvalidCredentialsException {
        manager.update(data);
    }
}
