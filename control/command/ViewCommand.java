package control.command;

import control.Arguments;
import control.Manager;
import control.EntityPrinter;

public class ViewCommand implements Command {
    @Override
    public void execute(Manager manager, Arguments data) {
        manager.viewAll(new EntityPrinter());
    }
}
