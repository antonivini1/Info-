package control.command;

import control.validation.InvalidCredentialsException;
import control.Controller;

public class UpdateCommand implements Command {
    private Controller controller;

    public UpdateCommand(Controller controller) {
        this.controller = controller;
    }
    @Override
    public void execute(CommandData data) throws InvalidCredentialsException {
        controller.update(data);
    }
}
