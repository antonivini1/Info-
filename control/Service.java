package control;

import control.command.Command;
import control.command.CommandData;
import control.visitor.EntityViewer;

public interface Service extends Restorable {
    void insert(CommandData data) throws InvalidLoginException, InvalidPasswordException;
    void delete(CommandData data);
    void update(CommandData data) throws InvalidCredentialsException;
    void viewAll(EntityViewer visitor);
}
