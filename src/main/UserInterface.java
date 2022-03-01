package main;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Bot bot;
    private User user;

    public UserInterface(Scanner scanner, Bot bot) {
        this.scanner = scanner;
        this.bot = bot;
        this.user = new User();
    }

    public void start() {
        // All output messages
        System.out.printf("Hello! My name is %s.\n", this.bot.getName());
        System.out.printf("I was created in %d.\n", this.bot.getBirthYear());

        // Asks for name
        System.out.println("Please, remind me your name.");
        this.user.setName(this.scanner.nextLine());
        System.out.printf("What a great name you have, %s!\n", this.user.getName());

        // Guesses user age
        System.out.println("Let me guess your age.");
        System.out.println("Enter the remainders of each when dividing your age by 3, 5 and 7.");
        int remainderOfThree = this.scanner.nextInt();
        int remainderOfFive = this.scanner.nextInt();
        int remainderOfSeven = this.scanner.nextInt();
        this.user.guessAge(remainderOfThree, remainderOfFive, remainderOfSeven);
        this.user.getAge();
        System.out.printf("Your age is %d, that's a good time to start programming!\n", this.user.getAge());

        // Bot counts from 0 to user input number
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int userNumber = this.scanner.nextInt();
        this.bot.countUpToN(userNumber);

        // Bot will present a multiple choice question
        this.bot.test();
    }

}
