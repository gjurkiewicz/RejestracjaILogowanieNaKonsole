package jurkiewicz.grzegorz.com.repositoryTest;

import jurkiewicz.grzegorz.com.repository.EmailRepository;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
public class EmailRepositoryTest {
    @Test
    public void emailCorect(){
        String email = "my@email.com";
        assertTrue(new EmailRepository().isEmailCorect(email));
    }

    @Test
    public void emailInCorect(){
        String email = "my@email";
        assertFalse(new EmailRepository().isEmailCorect(email));
    }
}
