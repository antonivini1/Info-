package control.command;

import control.InvalidCredentialsException;
import control.InvalidLoginException;
import control.InvalidPasswordException;
import control.Service;

public class InsertCommand implements Command {
    private Service service;

    public InsertCommand(Service service) {
        this.service = service;
    }

    @Override
    public void execute(CommandData data) throws InvalidCredentialsException {
        service.insert(data);
    }
}
