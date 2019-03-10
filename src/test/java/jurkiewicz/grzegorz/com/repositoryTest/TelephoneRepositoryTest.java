package jurkiewicz.grzegorz.com.repositoryTest;

import jurkiewicz.grzegorz.com.repository.TelephoneRepository;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class TelephoneRepositoryTest {
    @Test
    public void telephoneNumberCorect(){
        String telephoneNumber = "791119185";
        assertTrue(new TelephoneRepository().isTelephoneNumberCorect(telephoneNumber));
    }

    @Test
    public void telephoneNumberWithInvalidChars() {
        String telephoneNumber = "123a4@?299";
        assertFalse(new TelephoneRepository().isTelephoneNumberCorect(telephoneNumber));
    }

    @Test
    public void telephoneNumberToLong() {
        String telephoneNumber = "123456789123456";
        assertFalse(new TelephoneRepository().isTelephoneNumberCorect(telephoneNumber));
    }

    @Test
    public void telephoneNumberToShort() {
        String telephoneNumber = "123";
        assertFalse(new TelephoneRepository().isTelephoneNumberCorect(telephoneNumber));
    }


}
