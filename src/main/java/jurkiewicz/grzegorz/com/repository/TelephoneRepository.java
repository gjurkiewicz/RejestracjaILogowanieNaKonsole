package jurkiewicz.grzegorz.com.repository;

public class TelephoneRepository {

    public boolean isTelephoneNumberCorect(String telephoneNumber) {
        if (telephoneNumber.matches("\\d{9}"))
            return true;
        else {
            System.out.println("Błędny numer telefon,wpisz jeszcze raz (9 cyfr).");
            return false;
        }
    }
}