package dicerollerapv2;

import static dicerollerapv2.MainApp.sc;

public class NumOfDice {

    public static int dieCount;

    public static int getDieCount() {
        //when user wants to change number of dice...
        boolean isValid = false;

        while (isValid == false) {
            System.out.println("\nHow many dice are there? ");
            System.out.println("Choose one of the following: ");
            //valid dice number options
            System.out.println("1");
            System.out.println("2");
            System.out.print("\n>>> ");

            if (sc.hasNextInt()) {//validate user entry as int
                dieCount = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("\n***ERROR! Invalid entry. Try again.***\n");//error when user entry is not int
                isValid = false;
            }

            if (isValid == true && dieCount >= 3) {//error when number is too large
                System.out.println("\n***ERROR! Number is too large. Please enter 1 or 2.***\n");
                isValid = false;
            } else if (isValid == true && dieCount <= 0) {//error when number is too small
                System.out.println("\n***ERROR! Number is too small. Please enter 1 or 2.***\n");
                isValid = false;
            } else {//continue while user entry meets specifications
                isValid = true;
            }
        }//while

        return dieCount;
    }

}
