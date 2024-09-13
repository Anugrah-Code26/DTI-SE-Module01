package exercise;

import java.util.HashMap;
import java.util.Map;

public class UserManager {
    private final Map<String, User> users;
    private User loggedInUser;

    public UserManager() {
        users = new HashMap<>();
        loggedInUser = null;
    }

    public void registerUser(String username, String password) throws Exception {
        if (users.containsKey(username)) {
            throw new Exception("Username already exists. Please choose another one.");
        }
        User user = new User(username, password);
        users.put(username, user);
        System.out.println("Registration successful.");
    }

    public void loginUser(String username, String password) throws Exception {
        if (!users.containsKey(username)) {
            throw new Exception("User does not exist.");
        }
        User user = users.get(username);
        if (user.authenticate(password)) {
            loggedInUser = user;
            System.out.println("Login successful.");
        } else {
            throw new Exception("Incorrect password.");
        }
    }

    public User getLoggedInUser() {
        return loggedInUser;
    }

    public void logoutUser() {
        loggedInUser = null;
        System.out.println("Logged out successfully.");
    }
}

