package dicerollerapv2;

import java.util.Scanner;

public class Die {

    public static Scanner sc = new Scanner(System.in);
    
    public static int roll() {
        //generates random number for one die with user specified side count

        int die = MainApp.sideCount;

        int total = 1 + (int) (Math.random() * die);

        System.out.println("Total is: " + total);
        return total;
    }//roll 

    
}//Die
