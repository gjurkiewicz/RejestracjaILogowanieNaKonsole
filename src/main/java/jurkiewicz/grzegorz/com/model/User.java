package jurkiewicz.grzegorz.com.model;

public class User {
    private String login;
    private String password;
    private String email;
    private String telephoneNumber;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPasswor(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }


    public User(String login, String password, String email, String telephoneNumber) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
    }

    public User() {
    }

    public User(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "User{" +
                " login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                '}';
    }
}
