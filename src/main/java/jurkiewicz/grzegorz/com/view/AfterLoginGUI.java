package jurkiewicz.grzegorz.com.view;

import jurkiewicz.grzegorz.com.Model.User;
import jurkiewicz.grzegorz.com.repository.RegisterRepository;

import java.util.Scanner;
import static jurkiewicz.grzegorz.com.view.GUI.helloScrean;
import static jurkiewicz.grzegorz.com.view.RegisterGUI.users;


public class AfterLoginGUI  {


    public static void afterLoginScreen(String login) {

        System.out.println("Wybierz jedną z poniższych opcji.");
        System.out.println();
        System.out.println("1.Zmiana emaila.");
        System.out.println("2.Zmiana numeru telefonu.");
        System.out.println("3.Wylogowanie.");

        Scanner scanner = new Scanner(System.in);
        String choose;
        choose = scanner.nextLine();
        User user = new User();
        if (choose.matches("1")) {
            System.out.println("Wpisz nowego meila:");
            String newEmail;
            newEmail = scanner.nextLine();
            {
                user.setEmail(newEmail);
                System.out.println("Email został zmieniony.");
                afterLoginScreen(login);
            }
            if (choose.matches("2")) {
                System.out.println(user.toString());
                System.out.println("Wpisz nowy numer telefonu:");
                String newTelephoneNumber;
                newTelephoneNumber = scanner.nextLine();
                {
                    user.setTelephoneNumber(newTelephoneNumber);
                    System.out.println("Numer telefonu został zmieniony.");
                    afterLoginScreen(login);
                }
                if (choose.matches("3")) {
                    helloScrean();
                }
            }
     }helloScrean();
    }
}
