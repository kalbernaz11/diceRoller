package dicerollerapv2;

import java.util.Arrays;

public class DiceRoller {

    public static int sideCount = MainApp.sideCount;
    public static int dieCount = MainApp.dieCount;
    private static int[] rollStats;
    public static boolean isValid;
    public static int seriesLength = MainApp.numOfRolls;
    
    public static int sum;
    public static int idx = 0;
    
    public DiceRoller(){
        int pairMaxSum = sideCount + sideCount;//maximum sum of two dice
        int maxSum = sideCount;//maximum sum of one die
        
        if (dieCount == 1){
            rollStats = new int [maxSum];
        } else if (dieCount == 2 ){
            rollStats = new int [pairMaxSum];
        }
    }//DiceRoller
    
    
    public static int rollSeries(){
        Arrays.fill(rollStats, 0);
        while (seriesLength !=0){
            if (dieCount == 1){
                sum = Die.roll();
            } else if (dieCount == 2){
                sum = DicePair.roll();
            }
            rollStats [sum] = rollStats [sum] + 1;
            --seriesLength;
        
        }//while seriesLength
        
        if (dieCount == 1){
                idx = 1;
            } else if (dieCount == 2){
                idx = 2;
            }
            
            for (; idx < rollStats.length; idx++){
                System.out.println("Combination of " + idx
                        + " has been rolled "
                        + rollStats[idx]); 
                rollStats[idx] = 0;
                
            }
            
            return 0;
    }//rollSSeries
    
}    
    