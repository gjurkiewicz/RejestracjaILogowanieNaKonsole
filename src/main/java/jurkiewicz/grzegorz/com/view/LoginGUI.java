package jurkiewicz.grzegorz.com.view;

import jurkiewicz.grzegorz.com.Model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static jurkiewicz.grzegorz.com.view.AfterLoginGUI.afterLoginScreen;
import static jurkiewicz.grzegorz.com.view.RegisterGUI.users;


public class LoginGUI {

    public static void loginScrean() {

        Scanner scanner = new Scanner(System.in);
        String login;
        String password;
        boolean loginAndPasswordValidation;

        do {
            loginAndPasswordValidation = false;
            System.out.println("Logowanie!");
            System.out.println();
            System.out.println("Podaj login:");
            login = scanner.nextLine();

            System.out.println("Podaj hasło:");
            password = scanner.nextLine();

            for (User u : users) {
                if (u.getLogin().equals(login) && u.getPassword().equals(password)) {
                    System.out.println(u.getLogin().toString());
                    System.out.println(u.getPassword().toString());
                    System.out.println("Zalogowano!");
                    System.out.println();
                    loginAndPasswordValidation = true;
                }
            }
        } while (!loginAndPasswordValidation);
        afterLoginScreen(login);
    }
}