package dicerollerapv2;

import static dicerollerapv2.MainApp.sc;

public class NumOfSides {

    public static int sideCount;

    static int getSideCount() {
        //when user wants to set die side count...

        boolean isValid = false;

        while (isValid == false) {
            System.out.println("\nHow many sides are there? ");
            System.out.println("Choose one of the following: ");
            //side options
            System.out.println("4");
            System.out.println("6");
            System.out.println("7");
            System.out.println("8");
            System.out.println("10");
            System.out.println("12");
            System.out.println("16");
            System.out.println("20");
            System.out.print("\n>>> ");

            if (sc.hasNextInt()) {//validates user input
                sideCount = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("\n***ERROR! Invalid entry. Try again.***\n");
            }

            if (isValid == true && sideCount <= 3) {//error for too small of a number
                System.out.println("\n***ERROR! Number is too small. Try again.***\n");
                isValid = false;
            } else if (isValid == true && sideCount >= 21) {//error for too large of a number
                System.out.println("\n***ERROR! Number is too large. Try again.***\n");
                isValid = false;
            } else if (isValid == true && sideCount == 5) {//error for invalid entry
                System.out.println("\n***ERROR! Number of sides not supported. Try again.***\n");
                isValid = false;
            } else if (isValid == true && sideCount == 9) {//error for invalid entry
                System.out.println("\n***ERROR! Number of sides not supported. Try again.***\n");
                isValid = false;
            } else if (isValid == true && sideCount == 11) {//error for invalid entry
                System.out.println("\n***ERROR! Number of sides not supported. Try again.***\n");
                isValid = false;
            } else if (isValid == true && sideCount == 13) {//error for invalid entry
                System.out.println("\n***ERROR! Number of sides not supported. Try again.***\n");
                isValid = false;
            } else if (isValid == true && sideCount == 14) {//error for invalid entry
                System.out.println("\n***ERROR! Number of sides not supported. Try again.***\n");
                isValid = false;
            } else if (isValid == true && sideCount == 15) {//error for invalid entry
                System.out.println("\n***ERROR! Number of sides not supported. Try again.***\n");
                isValid = false;
            } else if (isValid == true && sideCount == 17) {//error for invalid entry
                System.out.println("\n***ERROR! Number of sides not supported. Try again.***\n");
                isValid = false;
            } else if (isValid == true && sideCount == 18) {//error for invalid entry
                System.out.println("\n***ERROR! Number of sides not supported. Try again.***\n");
                isValid = false;

            } else if (isValid == true && sideCount == 19) {//error for invalid entry
                System.out.println("\n***ERROR! Number of sides not supported. Try again.***\n");
                isValid = false;

            } else {//continue while user entry meets specifications
                isValid = true;
            }

        }//while

        return sideCount;

    }//getSideCount
}//NumOfSides
