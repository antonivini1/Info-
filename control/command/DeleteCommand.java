package control.command;

import control.Controller;

public class DeleteCommand implements Command {
    private Controller controller;

    public DeleteCommand(Controller controller) {
        this.controller = controller;
    }
    @Override
    public void execute(CommandData data) {
        controller.delete(data);
    }
}
