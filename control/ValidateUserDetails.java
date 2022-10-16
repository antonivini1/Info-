package Control;

public class ValidateUserDetails {
    public static void validate(String login, String password) throws InvalidLoginException, InvalidPasswordException {
        if (login.length() >= 12) {
            throw new InvalidLoginException("Login não pode ter mais que 12 caracteres");
        }
        if (login.isEmpty()) {
            throw new InvalidLoginException("Login não pode ser vazio");
        }
        if (login.matches(".*[0-9].*")) {
            throw new InvalidLoginException("Login não pode conter números");
        }

        if (password.length() > 20) {
            throw new InvalidPasswordException("Senha não pode ter mais que 20 caracteres");
        }
        if (password.length() < 8) {
            throw new InvalidPasswordException("Senha não pode ter menos que 8 caracteres");
        }
        if ( !(password.matches("(?=(.*?\\d){2})[a-zA-Z0-9]{8,}") && password.matches(".*[a-zA-Z]+.*")) ) {
            throw new InvalidPasswordException("Senha deve conter ao menos dois números e uma letra");
        }
    }
}
