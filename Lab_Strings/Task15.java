package com.Shehroze;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a Paragraph: ");
        String stringInput = userInput.nextLine();
        int numberOfWords = 0, numberOfLines = 0, numberOfCharacters = stringInput.length();
        for (int i = 0; i<numberOfCharacters; i++ ){
            if (stringInput.charAt(i) == ' ')
                numberOfWords++;
            else if (stringInput.charAt(i) == '.')
                numberOfLines++;
            else
                continue;
        }
        System.out.println("The given paragraph has "+numberOfCharacters+" number of characters "+numberOfWords+" words and "+numberOfLines+" lines.");
    }
}


