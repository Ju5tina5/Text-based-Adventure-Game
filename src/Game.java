import java.util.Scanner;

public class Game {
    // line break between different sout's
    public static void lineBreaker() {
        System.out.println("-------------");
    }
    // game start
    public static void gameStart() {
        System.out.println("You wake up in a dark forest on a cold ground. What do you do?");
    }
    public static void getUp() {
        System.out.println("You stand up. There's a road in front of you.");
    }
    // three option to go
    public static void chooseFromThree() {
        System.out.println("The road forks out into three");
    }
    // basic game over
    public static void gameOver() {
        System.out.println("Game Over!");
    }
    // froze game over
    public static void gameEndFrozen() {
        System.out.println("Game Over, you froze to death!");
    }
    public static void StartAgain() {
        System.out.println("Wanna try again? Y/N");
        Scanner start = new Scanner(System.in);
        String newGame = start.nextLine();
        if (newGame.equalsIgnoreCase("Y")) {
            Game.lineBreaker();
            Game.gameStart();
            Choices.firstChoise();
            Choices.scannerChoise3();
        } else {
            gameOver();
        }
    }
}
