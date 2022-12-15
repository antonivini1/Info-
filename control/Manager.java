package control;

import control.backup.Restorable;
import control.validation.InvalidCredentialsException;
import control.validation.InvalidLoginException;
import control.validation.InvalidPasswordException;

public interface Manager extends Restorable {
    void insert(Arguments data) throws InvalidLoginException, InvalidPasswordException;
    void delete(Arguments data);
    void update(Arguments data) throws InvalidCredentialsException;
    void viewAll(EntityViewer visitor);
}
