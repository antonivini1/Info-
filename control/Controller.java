package control;

import control.command.CommandData;
import control.memento.Restorable;
import control.validation.InvalidCredentialsException;
import control.validation.InvalidLoginException;
import control.validation.InvalidPasswordException;
import control.visitor.EntityViewer;

public interface Controller extends Restorable {
    void insert(CommandData data) throws InvalidLoginException, InvalidPasswordException;
    void delete(CommandData data);
    void update(CommandData data) throws InvalidCredentialsException;
    void viewAll(EntityViewer visitor);
}
