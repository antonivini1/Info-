package boundary;

import boundary.infra.persistance.InMemoryDaoFactory;
import control.*;
import control.command.*;
import control.validation.InvalidCredentialsException;
import control.validation.InvalidLoginException;
import control.validation.InvalidPasswordException;
import entity.User;

import java.util.Arrays;
import java.util.Scanner;

public class ManageUsersUi {
    Facade facade = new Facade();

    public void run() {
        System.out.println("Bem-vindo ao info+");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            showMenu();
            int option = scanner.nextInt();
            scanner.nextLine(); // \n

            try {
                switch (option) {
                    case 1:
                        addUser(scanner);
                        break;
                    case 2:
                        showUsers();
                        break;
                    case 3:
                        updateUser(scanner);
                        break;
                    case 4:
                        deleteUser(scanner);
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            } catch (InvalidCredentialsException e) {
                System.out.println("Erro: " + e.getMessage());
            } catch (InternalErrorException e) {
                System.out.println("Um erro inesperado ocorreu");
            }
        }
    }

    private static void showMenu() {
        System.out.println("1) Cadastrar Usuário");
        System.out.println("2) Listar Usuários");
        System.out.println("3) Atualizar Usuário");
        System.out.println("4) Deletar Usuário");
        System.out.print("Selecione uma opção: ");
    }

    private void addUser(Scanner scanner) throws InternalErrorException {
        System.out.print("Login: ");
        String login = scanner.nextLine();
        System.out.print("Senha: ");
        String password = scanner.nextLine();

        facade.execute("user", "insert", new Arguments(Arrays.asList(login, password)));
    }

    private void showUsers() throws InternalErrorException {
        System.out.println("-----------------------------------------------");
        facade.execute("user", "view", null);
        System.out.println("-----------------------------------------------");
    }

    private void updateUser(Scanner scanner) throws InternalErrorException {
        System.out.print("Login: ");
        String oldLogin = scanner.nextLine();

        System.out.print("Novo Login: ");
        String newLogin = scanner.nextLine();
        System.out.print("Nova Senha: ");
        String newPassword = scanner.nextLine();

        facade.execute("user", "update", new Arguments(Arrays.asList(oldLogin, newLogin, newPassword)));
    }

    private void deleteUser(Scanner scanner) throws InternalErrorException {
        System.out.print("Login: ");
        String login = scanner.nextLine();
        facade.execute("user", "delete", new Arguments(Arrays.asList(login)));
    }
}
