package control;

import control.validation.InvalidCredentialsException;
import control.command.Command;
import control.command.CommandData;

public class Facade {
    public void execute(Command command, CommandData data) throws InvalidCredentialsException {
        command.execute(data);
    }
}
