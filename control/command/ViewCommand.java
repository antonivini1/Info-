package control.command;

import control.Controller;
import control.visitor.EntityPrinter;

public class ViewCommand implements Command {
    private Controller controller;

    public ViewCommand(Controller controller) {
        this.controller = controller;
    }
    @Override
    public void execute(CommandData data) {
        controller.viewAll(new EntityPrinter());
    }
}
