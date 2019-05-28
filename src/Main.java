
import java.util.Scanner;

public class Main {

    public static void main(String[] arg) {

        System.out.println("WELCOME");

        Game.lineBreaker();

        Scanner Beggin = new Scanner(System.in);

        System.out.println("To Start a game press Y, if you don't want to play press N");

        String start = Beggin.nextLine();


        if (start.equalsIgnoreCase("y")) {
            Game.lineBreaker();
            System.out.println("Game has begun");
            Game.lineBreaker();
            Game.gameStart();
            Choices.firstChoise();
            Choices.scannerChoise3();
        } else if (start.equalsIgnoreCase("n")) {
            Game.lineBreaker();
            System.out.println("Leave and never come back!");
        } else {
            Game.lineBreaker();
            System.out.println("I asked for y or n, what ar yo trying to pull here!");
            Game.gameOver();
        }
    }
}