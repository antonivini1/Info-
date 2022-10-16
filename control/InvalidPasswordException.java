package Control;

public class InvalidPasswordException extends Exception {
    InvalidPasswordException(String message) {
        super(message);
    }
}
