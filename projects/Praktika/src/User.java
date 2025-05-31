public class User {

    private String login;
    private String password;

    public User(String login, String password) {
        this.login      = login;
        this.password   = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public boolean changePassword(String oldPassword, String newPassword) {
        if (password.equals(oldPassword)) {
            password = newPassword;
            return true;
        }
        return false;
    }

    public boolean changeLogin(String password, String newLogin) {
        if (this.password.equals(password)) {
            login = newLogin;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Username=/" + login + " : Password=/" + password;
    }
}
