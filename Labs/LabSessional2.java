package com.Shehroze;

import java.util.Random;
import java.util.Scanner;

public class LabSessional2 {
    public static void main(String[] args){
        System.out.println("Made By Shehroze Ehsan SP20-BSE-2B-086.");
        Scanner userInput = new Scanner(System.in);
        Random rand = new Random();
        int stepToReachEnd = 0;  // Will count the total steps taken to reach the end of matrix.
        int[] matrix = new int[30];
        int nextLine = 0; // Used to jump to next line while printing elements of array.
        for (int i=0; i<30; i++){  // Printing the matrix and initializing values.
            matrix[i] = (i+1);
            nextLine++;
            System.out.print(matrix[i]+"\t");
            if(nextLine==5) {
                System.out.println();
                nextLine = 0;
            }
        }

        int position = matrix[0];
        System.out.println("\nFirst position: " + position);

        while (true) {

            System.out.print("\nWrite \"roll\" to roll the dice \n\"exit\" to stop the program\n\"snakes\" to show snake positions\n\"ladder\" to show ladder position\nAction: ");
            String userAction = userInput.next().toLowerCase();

            int dice;
            if (userAction.equals("roll")) {
                dice = (rand.nextInt(6) + 1);
                System.out.println("\nDice rolled to number: " + dice);
                int temp = position; // Will be used when the position goes over the limit.
                position = position + dice;
                stepToReachEnd++;

                if (position == 30){
                    System.out.println("\nYou have come to the end of matrix.");
                    System.out.println("It took "+stepToReachEnd+ " steps to reach the end. ");
                    break;
                }
                else if( position > 30) {
                    System.out.println("\nYou will need a number that sums to 30 perfectly.");
                    position = temp; // Changes the position variable back to its last position before going over 30.
                }

                position = matrix[position - 1];

            }
            else if (userAction.equals("snakes"))
                ShowSnakes(); // Calling method to print snakes location.
            else if (userAction.equals("ladder"))
                ShowLadder(); // Calling method to print ladder location.
            else if (userAction.equals("exit"))
                System.exit(0);
            else
                System.out.println("Wrong input.");
            position = CheckPosition(position);

            System.out.println("\nYour current position is: "+position);
        }

    }
    public static int CheckPosition(int position){
        int[] snakes = {8,14,22,29,2,10,5,18};
        int[] ladder = {4,12,19,9,24,27};
        for (int i=0; i<snakes.length; i++){
            if( snakes[i] == position){
                if (i<=3){ // As first row indicated the mouth of snake only values in first row will be changed.
                    System.out.println("\n!!!!Woops, a snake ate you!!!! at position "+position);
                    switch (snakes[i]){
                        case 8:
                            position = 2;
                            break;
                        case 14:
                            position = 10;
                            break;
                        case 22:
                            position = 5;
                            break;
                        case 29:
                            position = 18;
                            break;
                    }
                }
            }
        }
        for( int j=0; j<ladder.length; j++){
            if( ladder[j] == position){
                if (j <= 2){ // Here only first row elements are affected by ladder.
                    System.out.println("\n!!!!Wow, you found a ladder!!!! at position "+position);
                    switch (ladder[j]){
                        case 4:
                            position = 9;
                            break;
                        case 12:
                            position = 24;
                            break;
                        case 19:
                            position = 27;
                    }
                }
            }
        }
    return position;
    }
    public static void ShowSnakes(){
        int[] snakes = {8,14,22,29,2,10,5,18};
        for (int i=0; i<snakes.length; i++){
            System.out.print(snakes[i]+"\t");
            if(i==3)
                System.out.println();
        }
        System.out.println();
    }
    public static void ShowLadder(){
        int[] ladder = {4,12,19,9,24,27};
        for (int i=0; i<ladder.length; i++){
            System.out.print(ladder[i]+"\t");
            if(i==2)
                System.out.println();
        }
        System.out.println();
    }
}


