package com.Shehroze;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = userInput.nextLine();
        int spaceCount = 0, upperCaseLetterCount=0, strLength = input.length();

        for (int i =0; i<strLength; i++) {
            if(input.charAt(i) == ' ')
                spaceCount++;
            else if (input.charAt(i)>=65 && input.charAt(i)<=90)
                upperCaseLetterCount++;
            else
                continue;
        }
        System.out.println("The given string has "+spaceCount+" spaces and "+upperCaseLetterCount+" uppercase letters.");
    }
}
