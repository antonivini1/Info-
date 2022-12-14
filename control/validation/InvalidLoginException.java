package control.validation;

public class InvalidLoginException extends InvalidCredentialsException {
    InvalidLoginException(String message) {
        super(message);
    }
}
