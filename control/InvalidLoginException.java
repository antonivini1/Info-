package control;

public class InvalidLoginException extends Exception {
    InvalidLoginException(String message) {
        super(message);
    }
}
