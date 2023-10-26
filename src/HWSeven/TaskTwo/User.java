package HWSeven.TaskTwo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class User {
    private String username;
    private String emaild;
    private String passwor;

    public User(String username, String emaild, String passwor) {
        this.username = username;
        this.emaild = emaild;
        this.passwor = passwor;
    }

    public String getUsername() {
        return username;
    }

    public String getEmaild() {
        return emaild;
    }

    public String getPasswor() {
        return passwor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return username.equals(user.username) && emaild.equals(user.emaild) && passwor.equals(user.passwor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, emaild, passwor);
    }

    public static List<User> findDuplicates(Collection<User> collA, Collection<User> collB) {

        List<User> duplicates = new ArrayList<>();

        for (User userA : collA) {
            for (User userB : collB) {
                if (userA.equals(userB)) {
                    duplicates.add(userA);
                    break;
                }
            }
        }
        return duplicates;
    }

}
