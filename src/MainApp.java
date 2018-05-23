/*
 * Assignment a6
 * Dice Roller
 * Kate-Lynn Albernaz
 * November 3, 2015
 */
package dicerollerapv2;

import java.util.Scanner;

public class MainApp {

    public static Scanner sc = new Scanner(System.in);

    //menu options
    public static final int SET_NUM_OF_DICE = 1;
    public static final int SET_NUMBER_OF_SIDES = 2;
    public static final int ROLL = 3;
    public static final int SERIAL_DICE_ROLL = 4;
    public static final int EXIT_PROGRAM = 5;
    
    public static int menuChoice;

    public static int dieCount = 1;//default number of die 
    public static int sideCount = 6;//default number of sides per die
    public static int numOfRolls;//user specified number of rolls
    DiceRoller roller = new DiceRoller();
    
    public static void main(String[] args) {
        for (;;) {

            boolean isValid = false;
            String rollAgain;//used to specify whether to roll dice again

            menuChoice = menuOptions();
            switch (menuChoice) {
                case SET_NUM_OF_DICE:
                    //when option is selected, user can select to roll one or two dice
                    dieCount = NumOfDice.getDieCount();
                    break;
                case SET_NUMBER_OF_SIDES:
                    sideCount = NumOfSides.getSideCount();
                    break;
                case ROLL:
                    //when option is selected, random numbers are generated for the number of dice rolled

                    while (isValid == false) {

                        if (dieCount == 1) {//if only one die is selected...
                            Die.roll();
                        } else if (dieCount == 2) {//if two dice are selected...
                            DicePair.roll();
                        }
                        System.out.println("Would you like to roll again? (Y/N)");
                        System.out.print(">>> ");
                        rollAgain = sc.nextLine();

                        if (rollAgain.equalsIgnoreCase("y")) {//roll again
                            isValid = false;
                        } else if (rollAgain.equalsIgnoreCase("n")) {//exit loop and return to menu
                            isValid = true;
                        }

                    }

                    break;
                    
                case SERIAL_DICE_ROLL:
                    while (isValid == false){
                        System.out.println("How many times would you like to roll?");
                        if (sc.hasNextInt()){
                            numOfRolls = sc.nextInt();
                            for (int count = 0; count < numOfRolls ; count++){
                                if (dieCount == 1 ){
                                    Die.roll();
                                } else if (dieCount == 2){
                                    DicePair.roll();
                                }
                                count++;
                            }
                            isValid = true;
                        } else {
                            System.out.println("\n***ERROR! Invalid entry. Please try again.***\n");
                            isValid = false;
                        }
                        
                        if (isValid == true && numOfRolls != 0){
                            isValid = true;
                        } else if (isValid == true && numOfRolls == 0 ) {
                            System.out.println("\n***ERROR! Invalid entry. Please try again.***\n");
                            isValid = false;
                        }
                        
                        
                        
                        System.out.println("Would you like to roll again? (Y/N)");
                        rollAgain = sc.nextLine();
                        if (rollAgain.equalsIgnoreCase ("y")){
                            isValid = false;
                        } else if (rollAgain.equalsIgnoreCase("n")){
                            isValid = true;
                        }
                        
                        DiceRoller.rollSeries();
                    }    

                case EXIT_PROGRAM:
                    //when option is selected, program is closed
                    System.out.println("GoodBye!");
                    return;
                default:
                    System.out.println("\n***ERROR! That is not a valid entry! Please try again.***\n");//error for when an option is entered that is not available
                    break;
            }//switch
        }//for

    }//main

    public static int menuOptions() {
        //menu display
        for (;;) {
            boolean isValid = false;

            //displays menu options
            System.out.println("Welcome to the Dice Roller Stats Calculator!\n");
            System.out.println("\nMain Menu: \n");
            System.out.println("Current Number of Dice: " + dieCount);
            System.out.println("Current Number of Sides Per Die: " + sideCount + "\n");

            System.out.println(SET_NUM_OF_DICE + ": Set Number of Dice");

            System.out.println(SET_NUMBER_OF_SIDES + ": Set Number of Sides Per Die");

            System.out.println(ROLL + ": Roll Once");
            
            System.out.println(SERIAL_DICE_ROLL + ": Serial Dice Roll");

            System.out.println(EXIT_PROGRAM + ": Exit Program");

            while (isValid == false) {
                System.out.println("What would you like to do? (Enter a number) ");

                if (sc.hasNextInt()) {//validate user entry as int
                    menuChoice = sc.nextInt();
                    isValid = true;
                } else {
                    System.out.println("\n***ERROR! That is not a valid entry. Please retry.***\n");//error message for anything other than int
                }
                sc.nextLine();

                if (isValid == true && menuChoice <= 0) {//error messages for nonexisting options
                    System.out.println("\n***ERROR! Invalid option. Please enter a number 1 through 4.***\n");
                    isValid = false;
                } else if (isValid == true && menuChoice >= 6) {
                    System.out.println("\n***ERROR! Invalid option. Please enter a number 1 through 4.***\n");
                    isValid = false;
                } else if (isValid == true && menuChoice >= 1 || menuChoice <= 5) {
                    isValid = true;
                }

            }//while
            return menuChoice;
        }//for

    }//menuOptions

}//MainApp

/*
 To run the program:
 F:\kalbernaz\CIS157\DiceRollerApp\src>"C:\Program Files\Java\jdk1.7.0_80\bin\jav
 a.exe" dicerollerapp.MainApp

 When running the program, this is displayed:
 Dice Roller Menu:

 Current Number of Dice: 2
 Current Number of Sides Per Die: 6

 1: Set Number of Dice
 2: Set Number of Sides Per Die
 3: Roll
 4: Exit Program
 What would you like to do? (Enter a number)
 */
