package control.command;

import control.Arguments;
import control.Manager;

public interface Command {
    void execute(Manager manager, Arguments data);
}
