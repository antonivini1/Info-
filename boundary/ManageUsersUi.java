package boundary;

import Control.InvalidLoginException;
import Control.InvalidPasswordException;
import Control.UsersManager;
import entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageUsersUi {
    public static void run(UsersManager usersManager) {
        System.out.println("Bem-vindo ao info+");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            showMenu();
            int option = scanner.nextInt();
            scanner.nextLine(); // \n

            switch (option) {
                case 1:
                    addUser(scanner, usersManager);
                    break;
                case 2:
                    showUsers(usersManager);
                    break;
                case 3:
                    updateUser(scanner, usersManager);
                    break;
                case 4:
                    deleteUser(scanner, usersManager);
                    break;
                default:
                    System.out.println("Opção inválida!");
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

    private static void addUser(Scanner scanner, UsersManager usersManager) {
        System.out.print("Login: ");
        String login = scanner.nextLine();
        System.out.print("Senha: ");
        String password = scanner.nextLine();

        try {
            usersManager.addUser(login, password);
        } catch (InvalidLoginException | InvalidPasswordException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void showUsers(UsersManager usersManager) {
        List<User> users = usersManager.getUsers();
        System.out.println("-----------------------------------------------");
        for (User user : users) {
            System.out.println("Login: " + user.getLogin());
        }
        System.out.println("-----------------------------------------------");
    }

    private static void updateUser(Scanner scanner, UsersManager usersManager) {
        System.out.print("Login: ");
        String oldLogin = scanner.nextLine();

        System.out.print("Novo Login: ");
        String newLogin = scanner.nextLine();
        System.out.print("Nova Senha: ");
        String newPassword = scanner.nextLine();

        try {
            usersManager.updateUser(oldLogin, newLogin, newPassword);
        } catch (InvalidLoginException | InvalidPasswordException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void deleteUser(Scanner scanner, UsersManager usersManager) {
        System.out.print("Login: ");
        String login = scanner.nextLine();

        usersManager.deleteUser(login);
    }
}
