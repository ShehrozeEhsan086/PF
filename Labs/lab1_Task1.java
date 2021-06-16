package com.Shehroze;

import java.util.Scanner;

public class lab1_Task1 {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the character: ");

        char characterInput = userInput.next().charAt(0);
        char character = Character.toLowerCase(characterInput);

        // Using If-else

        if (character=='a' || character =='e' || character=='i' || character=='o' || character=='u')
            System.out.println("Character is a vowel.");
        else
            System.out.println("Character is a consonant");

        // Using Switch

        switch (character){
            case ('a'): case ('e'): case ('i'):case ('o'): case ('u'):
                System.out.println("Character is a vowel");
                break;
            default:
                System.out.println("Character is a consonant");
        }
    }
}
