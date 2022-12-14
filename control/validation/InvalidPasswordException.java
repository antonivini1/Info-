package control.validation;

public class InvalidPasswordException extends InvalidCredentialsException {
    InvalidPasswordException(String message) {
        super(message);
    }
}
