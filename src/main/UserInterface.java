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
        System.out.println("Please, remind me your name.");
        this.user.setName(this.scanner.nextLine());
        System.out.printf("What a great name you have, %s!\n", this.user.getName());
    }

}
