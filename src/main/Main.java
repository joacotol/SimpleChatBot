package main;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Bot info
        Bot bot = new Bot("Aid", 2020);
        // Creates a user interface
        UserInterface ui = new UserInterface(scanner, bot);

        ui.start();

    }
}
