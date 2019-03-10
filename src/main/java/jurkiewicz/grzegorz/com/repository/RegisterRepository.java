package jurkiewicz.grzegorz.com.repository;

import jurkiewicz.grzegorz.com.model.User;

import java.util.List;
import java.util.Scanner;

public class RegisterRepository {

    public static boolean isLoginOnRegisterCorect(List<User> users, String login) {
        for (User user : users) {
            if (user.getLogin().equals(login)) {
                System.out.println("Podany login już istnieje, podaj jeszcze raz.");
                return false;
            }
        }
        if (login.length() < 3) {
            System.out.println("Login jest za krótki, podaj jeszcze raz");
            return false;
        }
        return true;
    }

    public String handTypePassword (){
    String password;
    Scanner scanner = new Scanner(System.in);
    password = scanner.nextLine();
    return password;
    }

    public static boolean isPasswordOnRegisterCorect(String password) {

        if (password.matches("(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%.,><+_^&*-]).{8,}$")) {
            return true; }
         else {
            System.out.println("Blędne hasło. Podaj hasło: min 8 znaków, 1 duża litera, 1 znak specjalny, 1 cyfra.");
            return false;
        }
    }
}


