package main;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {
        this.name = "Default";
        this.age = 0;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    // Calculataions
    public void guessAge(int remainderOfThree, int remainderOfFive, int remainderOfSeven) {
        this.age = (remainderOfThree * 70 + remainderOfFive * 21 + remainderOfSeven * 15) % 105;
    }
}
