package main;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Bot bot;

    public UserInterface(Scanner scanner, Bot bot) {
        this.scanner = scanner;
        this.bot = bot;
    }

    public void start() {
        System.out.printf("Hello! My name is %s.\n", this.bot.getName());
        System.out.printf("I was created in %d.\n", this.bot.getBirthYear());
    }

}
