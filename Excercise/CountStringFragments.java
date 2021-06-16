package com.Shehroze;

import java.util.Scanner;

public class CountStringFragments {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String stringCombination = userInput.nextLine();
        int highestCombination = 0;
        int largest = 0;
        for ( int i=0; i<stringCombination.length() ; i++){
            for ( int j = 0; j<stringCombination.length() ; j++){
                if ( stringCombination.charAt(i) == stringCombination.charAt(j))
                    highestCombination +=1;
                else{
                    if ( largest<highestCombination)
                        largest = highestCombination;
                    highestCombination =0;
                }
            }
        }
        System.out.println("The highest recurring fragment came "+largest+" times.");
    }
}
