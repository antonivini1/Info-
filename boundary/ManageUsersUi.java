package boundary;

import boundary.infra.dao.InMemoryDaoFactory;
import control.UserRegistrationObserver;
import control.command.*;
import control.validation.InvalidCredentialsException;
import control.validation.InvalidLoginException;
import control.validation.InvalidPasswordException;
import control.UsersManager;
import entity.User;

import java.util.Arrays;
import java.util.Scanner;

public class ManageUsersUi {
    private UsersManager usersManager;
    public ManageUsersUi() {
        usersManager = new UsersManager(new InMemoryDaoFactory<>());
        usersManager.addObserver(new UserRegistrationObserver() {
            @Override
            public void onUserRegistered(User user) {
                System.out.println("Bem-vindo " + user.getLogin());
                System.out.println("Confira essas recomendações");
            }
        });
    }

    public void run() {
        System.out.println("Bem-vindo ao info+");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            showMenu();
            int option = scanner.nextInt();
            scanner.nextLine(); // \n

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
        }
    }

    private static void showMenu() {
        System.out.println("1) Cadastrar Usuário");
        System.out.println("2) Listar Usuários");
        System.out.println("3) Atualizar Usuário");
        System.out.println("4) Deletar Usuário");
        System.out.print("Selecione uma opção: ");
    }

    private void addUser(Scanner scanner) {
        System.out.print("Login: ");
        String login = scanner.nextLine();
        System.out.print("Senha: ");
        String password = scanner.nextLine();

        Command command = new InsertCommand(usersManager);

        try {
            command.execute(new CommandData(Arrays.asList(login, password)));
        } catch (InvalidCredentialsException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private void showUsers() {
        Command command = new ViewCommand(usersManager);
        System.out.println("-----------------------------------------------");
        command.execute(null);
        System.out.println("-----------------------------------------------");
    }

    private void updateUser(Scanner scanner) {
        System.out.print("Login: ");
        String oldLogin = scanner.nextLine();

        System.out.print("Novo Login: ");
        String newLogin = scanner.nextLine();
        System.out.print("Nova Senha: ");
        String newPassword = scanner.nextLine();

        Command command = new UpdateCommand(usersManager);

        try {
            command.execute(new CommandData(Arrays.asList(newLogin, newPassword)));
        } catch (InvalidLoginException | InvalidPasswordException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private void deleteUser(Scanner scanner) {
        System.out.print("Login: ");
        String login = scanner.nextLine();

        Command command = new DeleteCommand(usersManager);
        command.execute(new CommandData(Arrays.asList(login)));
    }
}
