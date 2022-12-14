package control.command;

import control.validation.InvalidCredentialsException;
import control.Service;

public class UpdateCommand implements Command {
    private Service service;

    public UpdateCommand(Service service) {
        this.service = service;
    }
    @Override
    public void execute(CommandData data) throws InvalidCredentialsException {
        service.update(data);
    }
}
