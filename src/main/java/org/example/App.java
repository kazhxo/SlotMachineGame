package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

// Define symbols for each column
        int[] column1Symbols = {1, 2, 3, 4};
        int[] column2Symbols = {1, 2, 3, 4};
        int[] column3Symbols = {1, 2, 3, 4};

        // Create a slot machine with the reels
        Reel column1 = new Reel(column1Symbols);
        Reel column2 = new Reel(column2Symbols);
        Reel column3 = new Reel(column3Symbols);


        SlotMachine slotMachine = new SlotMachine(new Reel[]{column1, column2, column3});
        // Prompt the user to spin the slot machine
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Slot Machine");
        System.out.println("Type 's' to spin!");


        // Get user input
        String input = scan.nextLine();


        // Spin the slot machine if user input is 's'
        int[] spinResult= new int[3];
        if (input.equals("s")) {
            spinResult=  slotMachine.startSpinning();
            // Display the spin result
            System.out.println("Results:");
            for(int symbol: spinResult){
                System.out.print("|" +symbol+"|");
                System.out.println();
                }

            // Check if all symbols in the spin result are equal
         if(areAllEqual(spinResult)==true){
                System.out.println("Cha Ching!");


            }else{
                System.out.print("Try again");
            }
        } else {
            System.out.println("Please try again");
        }


    }
    //Checks if all elements in an array are equal.

    public static boolean areAllEqual(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr[0]){
                return false;
            }
        }
        return true;
    }
}
