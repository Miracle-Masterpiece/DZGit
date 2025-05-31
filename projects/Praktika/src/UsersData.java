import java.util.ArrayList;
import java.util.List;

public class UsersData {

    private List<User> users;

    public UsersData() {
        users = new ArrayList<>();
    }

    public boolean addUser(User user) {
        for (User userFromList : users) {
            if (userFromList.getLogin().equals(user.getLogin()))
                return false;
        }
        return users.add(user);
    }

    public boolean removeUser(String login, String password) {
        for (int i = 0, size = users.size(); i < size; ++i) {
            User user = users.get(i);
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                users.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean changeLogin(String login, String password, String newLogin) {
        for (int i = 0, size = users.size(); i < size; ++i) {
            User user = users.get(i);
            if (user.getLogin().equals(login)) {
                return user.changeLogin(password, newLogin);
            }
        }
        return false;
    }

    public boolean changePassword(String login, String password, String newPassword) {
        for (int i = 0, size = users.size(); i < size; ++i) {
            User user = users.get(i);
            if (user.getLogin().equals(login)) {
                return user.changePassword(password, newPassword);
            }
        }
        return false;
    }

    public boolean existsUser(String login) {
        for (User user : users) {
            if (user.getLogin().equals(login))
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("================== A L L  U S E R S==================\n");
        for (User user : users) {
            sb.append(user).append('\n');
        }
        return sb.toString();
    }
}
