package main;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Bot bot;
    private User user;

    public UserInterface(Scanner scanner, Bot bot, User user) {
        this.scanner = scanner;
        this.bot = bot;
        this.user = user;
    }

    public void start() {
        System.out.printf("Hello! My name is %s.\n", this.bot.getName());
        System.out.printf("I was created in %d.\n", this.bot.getBirthYear());
        System.out.println("Please, remind me your name.");
    }

}
