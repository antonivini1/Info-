package control.command;

import control.validation.InvalidCredentialsException;
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
