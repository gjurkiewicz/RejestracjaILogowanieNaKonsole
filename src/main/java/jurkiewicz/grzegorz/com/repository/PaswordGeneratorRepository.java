package jurkiewicz.grzegorz.com.repository;

import java.security.SecureRandom;

public class PaswordGeneratorRepository {

    private static SecureRandom random = new SecureRandom();

    private static final String upperChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String lowerChar = "abcdefghijklmnopqrstuvwxyz";
    private static final String digits = "0123456789";
    private static final String special = "!@#$%^&*_=+-/";

    public static String generatePassword(int len, String dic) {
        String result = "";
        for (int i = 0; i < len; i++) {
            int index = random.nextInt(dic.length());
            result += dic.charAt(index);
        }
        return result;
    }

    public String PaswordGenerator() {
        String password;
        do {
            int len = 8;
            password = generatePassword(len, upperChar + lowerChar + special + digits);

            return password;
        } while (password.matches("(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%.,><+_^&*-]).{8,}$"));
    }
}