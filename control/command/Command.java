package control.command;

import control.InvalidCredentialsException;
import control.InvalidLoginException;
import control.InvalidPasswordException;

public interface Command {
    void execute(CommandData data);
}
