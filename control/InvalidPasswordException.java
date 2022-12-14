package control;

public class InvalidPasswordException extends InvalidCredentialsException {
    InvalidPasswordException(String message) {
        super(message);
    }
}
