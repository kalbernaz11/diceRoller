package dicerollerapv2;

import java.util.Scanner;

public class DicePair {

    public static Scanner sc = new Scanner(System.in);
    public static int dieOne;
    public static int dieTwo;
    public static int dieOneTotal;
    public static int dieTwoTotal;
    
    public static int roll() {
        //generates random number for two dice with user specified side count

        dieOne = MainApp.sideCount;
        dieTwo = MainApp.sideCount;

        dieOneTotal = 1 + (int) (Math.random() * dieOne);
        dieTwoTotal = 1 + (int) (Math.random() * dieTwo);

        int total = dieOneTotal + dieTwoTotal;
        System.out.println("\nDice one equals " + dieOneTotal);//displays total for one die
        System.out.println("Dice two equals " + dieTwoTotal);//displays total for next die

        //displays special message when rolling a 2, 3, 7, or 12
        if (dieOneTotal == 1 && dieTwoTotal == 1) {
            System.out.println("Snake Eyes!");
        } else if (dieOneTotal == 1 && dieTwoTotal == 2) {
            System.out.println("Ace Deuce!");
        } else if (dieOneTotal == 1 && dieTwoTotal == 6) {
            System.out.println("Craps!");
        } else if (dieOneTotal == 2 && dieTwoTotal == 1) {
            System.out.println("Ace Deuce!");
        } else if (dieOneTotal == 2 && dieTwoTotal == 3) {
            System.out.println("Ace Deuce!");
        } else if (dieOneTotal == 2 && dieTwoTotal == 5) {
            System.out.println("Craps!");
        } else if (dieOneTotal == 3 && dieTwoTotal == 4) {
            System.out.println("Craps!");
        } else if (dieOneTotal == 4 && dieTwoTotal == 3) {
            System.out.println("Craps!");
        } else if (dieOneTotal == 5 && dieTwoTotal == 2) {
            System.out.println("Craps!");
        } else if (dieOneTotal == 5 && dieTwoTotal == 6) {
            System.out.println("Yo-leven!");
        } else if (dieOneTotal == 6 && dieTwoTotal == 1) {
            System.out.println("Craps!");
        } else if (dieOneTotal == 6 && dieTwoTotal == 6) {
            System.out.println("Boxcars!");
        }

        System.out.println("Total is " + total + "\n");//displays total for both dice together

        return total;

    }//roll
    
}//DicePair
