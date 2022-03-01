package main;
public class Bot {

    private String name;
    private int birthYear;
    private int maxCount;

    public Bot(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
        this.maxCount = 0;
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

    // Calculations
    public void countUpToN(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.printf("%d!\n", i);
        }
        System.out.println("Completed, have a nice day!");
    }
}
