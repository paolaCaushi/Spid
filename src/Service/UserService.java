package Service;
import Entities.Spid;
import Entities.User;
import Utilities.Datas;

import java.util.*;

public class UserService {
    private final List<User> data = new ArrayList<>();
    private final Datas datas = new Datas();

    private final Set<String> usernames = new HashSet<>();

    private boolean usernameExists(String username) {
        return usernames.contains(username);
    }


    private User getUser(String username) throws Exception {
        for (User datum : data) {
            if (datum.getUsername().equals(username)) {
                return datum;
            }
        }
        throw new Exception("Username does not exists!");
    }

    public User createUser(String name, String surname, String username) throws Exception {
        if (usernameExists(username)) {
            throw new Exception("Username already used" + "!");
        }
        long id = datas.datas();
        User user = new User(id, new Date(), name, surname, username);
        data.add(user);
        usernames.add(username);
        System.out.println("User %d created successfully!" + id);
        return user;
    }

    public void modifyUser(String username, String name, String surname)
            throws Exception {
        if (name != null) {
            getUser(username).setName(name);
        }

        if (surname != null) {
            getUser(username).setSurname(surname);
        }
    }


    public Spid showSpidOf(String username) throws Exception {
        if (!usernameExists(username)) throw new Exception("This user does not exists!");

        for (User datum : data) {
            if (datum.getUsername().equals(username)) {
                return datum.getSpid();
            }
        }
        return null;
    }
}

