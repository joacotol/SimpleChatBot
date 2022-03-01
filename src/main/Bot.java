package main;
import java.util.Scanner;
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

    // Multiple Choice
    public void test() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.\n" +
                "2. To decompose a program into several small subroutines.\n" +
                "3. To determine the execution time of a program.\n" +
                "4. To interrupt the execution of a program.\n");

        while (true) {
            int input = userInput.nextInt();

            switch (input) {
                case 1:
                case 3:
                case 4:
                    System.out.println("Please, try again.");
                    break;
                case 2:
                    break;
            }
            if (input == 2) {
                System.out.println("Congratulations, have a nice day!");
                break;
            }
        }

    }
}
