package jurkiewicz.grzegorz.com.repository;

public class EmailRepository {

    public boolean isEmailCorect(String email) {
        if (email.matches(".+@.+\\.[a-z]+"))
            return true;
        else {
            System.out.println("Błędny adres email.");
            return false;
        }
    }
}