package jurkiewicz.grzegorz.com.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import static jurkiewicz.grzegorz.com.view.LoginGUI.loginScrean;

public class GUI {

    public static void helloScrean() {
        System.out.println("Witaj, proszę wybierz jedną z poniższych opcji.");
        System.out.println();
        System.out.println("1.Logowanie");
        System.out.println("2.Rejestracja");
        System.out.println("3.Zakończ program");
        System.out.println();

        try {
            int choose;
            Scanner scanner = new Scanner(System.in);
            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    loginScrean();
                    System.out.println();
                    break;
                case 2:
                    RegisterGUI.registerScrean();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Do zobaczenia.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Niepoprawny wybór!");
                    System.out.println();
                    helloScrean();
                    System.out.println();
            }
        } catch (InputMismatchException e) {
            System.out.println("Niepoprawny wybór!");
            System.out.println();
            helloScrean();
            System.out.println();
        }
    }
}




