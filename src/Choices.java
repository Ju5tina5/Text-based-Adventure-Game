import java.awt.*;
import java.util.Scanner;

public class Choices {
    public static final String choiceOne = "A";
    public static final String choiceTwo = "B";
    public static final String choiceThree = "C";
    public static final String choiceLeft = "Go Left";
    public static final String choiceRight = "Go Right";
    public static final String choiceStraight = "Go Straight";



    public static void scannerChoise3() {
        Scanner choose = new Scanner(System.in);
        String choise = choose.nextLine();
        if (choise.equalsIgnoreCase(choiceOne)) {
            Game.gameEndFrozen();
            Game.StartAgain();
            scannerChoise3();
        } else if (choise.equalsIgnoreCase(choiceTwo)) {
            Game.getUp();
            StraightOnly();
        } else if (choise.equalsIgnoreCase(choiceThree)) {
            System.out.println("Nobody will help you!!!");
            Game.gameStart();
            Game.lineBreaker();
            firstChoise();
            scannerChoise3();
        } else {
            Game.lineBreaker();
            System.out.println("Invalid choice");
            Game.gameStart();
            Game.lineBreaker();
            firstChoise();
            scannerChoise3();
        }
    }
    public static void choicefromOne() {
        scannerChoise3();
    }
    //  only first choice
    public static void firstChoise() {
        System.out.println( choiceOne + " keep lying");
        System.out.println( choiceTwo + " Get up");
        System.out.println( choiceThree + " Cry for help!!");
    }
    public static void turnChoise() {
        System.out.println(choiceOne + choiceLeft);
        System.out.println(choiceTwo + choiceRight);
        System.out.println(choiceThree + choiceStraight);
    }
    public static void StraightOnly() {
        System.out.println(choiceOne + " " + choiceStraight);
        choicefromOne();
    }
}
