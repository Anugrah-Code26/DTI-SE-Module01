package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
    private String userId;
    private String username;
    private String password;
    private List<String> tasks;

    public User(String username, String password) {
        this.userId = UUID.randomUUID().toString();
        this.username = username;
        this.password = password;
        this.tasks = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public boolean authenticate(String password) {
        return this.password.equals(password);
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void deleteTask(String task) {
        tasks.remove(task);
    }
}