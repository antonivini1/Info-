package control.command;

import control.validation.InvalidCredentialsException;
import control.Controller;

public class InsertCommand implements Command {
    private Controller controller;

    public InsertCommand(Controller controller) {
        this.controller = controller;
    }

    @Override
    public void execute(CommandData data) throws InvalidCredentialsException {
        controller.insert(data);
    }
}
