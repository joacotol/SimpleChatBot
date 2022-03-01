package main;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Bot bot = new Bot("Aid", 2020);
        UserInterface ui = new UserInterface(scanner, bot);

        ui.start();

    }
}
