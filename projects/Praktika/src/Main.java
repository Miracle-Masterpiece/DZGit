import java.util.Scanner;

public class Main {

    public static User makeUser(Scanner scanner) {
        System.out.print("Введите логин:");
        String login = null;
        while (login == null || login.isEmpty())
            login = scanner.nextLine();
        System.out.print("Введите пароль:");
        String password = null;
        while (password == null || password.isEmpty())
            password = scanner.nextLine();
        return new User(login, password);
    }

    public static boolean changeLogin(UsersData users, Scanner scanner) {
        System.out.print("Введите логин: ");
        String login = null;
        while (login == null || login.isEmpty())
            login = scanner.nextLine();
        System.out.print("Введите пароль: ");
        String password = null;
        while (password == null || password.isEmpty())
            password = scanner.nextLine();
        System.out.print("Введите новый логин: ");
        String newLogin = null;
        while (newLogin == null || newLogin.isEmpty())
            newLogin = scanner.nextLine();
        return users.changeLogin(login, password, newLogin);
    }

    public static boolean changePassword(UsersData users, Scanner scanner) {
        System.out.print("Введите логин: ");
        String login = null;
        while (login == null || login.isEmpty())
            login = scanner.nextLine();
        System.out.print("Введите пароль: ");
        String password = null;
        while (password == null || password.isEmpty())
            password = scanner.nextLine();
        System.out.print("Введите новый пароль: ");
        String newPassword = null;
        while (newPassword == null || newPassword.isEmpty())
            newPassword = scanner.nextLine();
        return users.changePassword(login, password, newPassword);
    }

    public static boolean removeUser(UsersData users, Scanner scanner) {
        System.out.print("Введите логин: ");
        String login = null;
        while (login == null || login.isEmpty())
            login = scanner.nextLine();
        System.out.print("Введите пароль: ");
        String password = null;
        while (password == null || password.isEmpty())
            password = scanner.nextLine();
        return users.removeUser(login, password);
    }

    public static boolean existsUser(UsersData users, Scanner scanner) {
        System.out.print("Введите логин: ");
        String login = null;
        while (login == null || login.isEmpty())
            login = scanner.nextLine();
        return users.existsUser(login);
    }

    public static void main(String[] args) {
        UsersData users = new UsersData();
        try (Scanner scanner = new Scanner(System.in)) {
            int menuID = -1;
            do {
                System.out.println("0. Добавить пользователя.");
                System.out.println("1. Сменить логин.");
                System.out.println("2. Сменить пароль.");
                System.out.println("3. Удалить пользователя.");
                System.out.println("4. Существует ли пользователь.");
                System.out.println("5. Список всех пользователей.");
                System.out.print("Введите пункт: ");
                menuID = scanner.nextInt();
                switch (menuID) {
                    case 0 :
                        System.out.println(users.addUser(makeUser(scanner)) ? "Пользователь был добавлен" : "Пользователь с таким логином уже существует");
                        break;
                    case 1 :
                        System.out.println(changeLogin(users, scanner) ? "Логин был изменён" : "Неверный логин или пароль");
                        break;
                    case 2 :
                        System.out.println(changePassword(users, scanner) ? "Пароль был изменён" : "Неверный логин или пароль");
                        break;
                    case 3 :
                        System.out.println(removeUser(users, scanner) ? "Пользователь был удалён" : "Неверный логин или пароль");
                        break;
                    case 4 :
                        System.out.println(existsUser(users, scanner) ? "Пользователь с таким логином существует" : "Пользователя с таким логином не существует");
                        break;
                    case 5:
                        System.out.println(users);
                        break;
                }
            } while (menuID != -1);
        }
    }
}