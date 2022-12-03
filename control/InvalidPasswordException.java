package control;

public class InvalidPasswordException extends Exception {
    InvalidPasswordException(String message) {
        super(message);
    }
}
