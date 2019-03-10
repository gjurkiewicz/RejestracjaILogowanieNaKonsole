package jurkiewicz.grzegorz.com.view;

import jurkiewicz.grzegorz.com.Model.User;
import jurkiewicz.grzegorz.com.repository.EmailRepository;
import jurkiewicz.grzegorz.com.repository.PaswordGeneratorRepository;
import jurkiewicz.grzegorz.com.repository.RegisterRepository;
import jurkiewicz.grzegorz.com.repository.TelephoneRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegisterGUI {
    User user = new User();
    public static List<User> users = new ArrayList<>();

    public RegisterGUI(List<User> users) {
        this.users = users;
    }

    public static void registerScrean() {
        User user = new User();
        System.out.println("Rejestracja!");
        System.out.println();
        boolean registerLoginValidation;
        Scanner scanner = new Scanner(System.in);
        String login;
        do {
            System.out.println("Podaj login, conajmniej 3 znaki.");
            login = scanner.nextLine();
            registerLoginValidation = new RegisterRepository().isLoginOnRegisterCorect(users, login);
        } while (!registerLoginValidation);


        boolean registerPaswordValidation;
        String password = null;
        do {
            System.out.println("Możesz:");
            System.out.println("1.Wygenerować hasło.");
            System.out.println("2.Wpisać ręcznie hasło.");
            String choose;
            choose = scanner.nextLine();
            registerPaswordValidation = false;

            if (choose.equals("1")) {
                password = new PaswordGeneratorRepository().PaswordGenerator();
                System.out.println("Hasło wygenerowane to : " + password);
                registerPaswordValidation = true;

            } else if (choose.equals("2")) {
                System.out.println("Podaj hasło: min 8 znaków, 1 duża litera, 1 znak specjalny, 1 cyfra.");
                password = new RegisterRepository().handTypePassword();
                registerPaswordValidation = new RegisterRepository().isPasswordOnRegisterCorect(password);

            } else {
                System.out.println(" Błędny wybór.");
                registerPaswordValidation = false;
            }
        } while (!registerPaswordValidation);


        boolean registerEmailValidation;
        registerEmailValidation = false;
        String email;
        do {
            System.out.println("Podaj email:");
            email = scanner.nextLine();
            registerEmailValidation = new EmailRepository().isEmailCorect(email);
        } while (!registerEmailValidation);


        boolean registerTelephoneValidation;
        registerTelephoneValidation = false;
        String telephoneNumber;
        do {
            System.out.println("Podaj 9 cyfrowy numer telefonu :");
            telephoneNumber = scanner.nextLine();
            registerTelephoneValidation = new TelephoneRepository().isTelephoneNumberCorect(telephoneNumber);
        } while (!registerTelephoneValidation);

        users.add(new User(login, password, email, telephoneNumber));

        System.out.println("Zostałeś zarejestrowany.");
        System.out.println();
        GUI.helloScrean();
    }
}


