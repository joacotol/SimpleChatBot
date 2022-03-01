package main;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public User() {
        this.name = "Default";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
