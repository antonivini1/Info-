package control.command;

import control.Arguments;
import control.Manager;

public class DeleteCommand implements Command {
    @Override
    public void execute(Manager manager, Arguments data) {
        manager.delete(data);
    }
}
