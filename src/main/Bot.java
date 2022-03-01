package main;
public class Bot {

    private String name;
    private int birthYear;
    private int userAge;
    private User user;

    public Bot(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
        this.userAge = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public int getUserAge() {
        return this.userAge;
    }
}
