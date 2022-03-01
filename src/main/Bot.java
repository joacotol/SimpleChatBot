package main;
public class Bot {

    private String name;
    private int birthYear;

    public Bot(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
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
}
