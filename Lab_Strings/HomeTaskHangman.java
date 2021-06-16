package com.Shehroze;

import java.util.Random;
import java.util.Scanner;

public class HomeTaskHangman {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        Random systemSelection = new Random();
        int randomNum = systemSelection.nextInt(10);
        String wordToBeGuessed=" ";
        switch (randomNum){ //Computer gives random number, which are linked to predefined word that will be used for the game.
            case (0):
                wordToBeGuessed = "terminator";
                break;
            case (1):
                wordToBeGuessed = "banana";
                break;
            case (2):
                wordToBeGuessed = "computer";
                break;
            case (3):
                wordToBeGuessed = "cow";
                break;
            case (4):
                wordToBeGuessed = "rain";
                break;
            case (5):
                wordToBeGuessed = "water";
                break;
            case (6):
                wordToBeGuessed = "pakistan";
                break;
            case (7):
                wordToBeGuessed = "cricket";
                break;
            case (8):
                wordToBeGuessed = "awkward";
                break;
            case (9):
                wordToBeGuessed = "biryani";
                break;
        }
        boolean gameStatus = true;
        String stringVariable = "_";
        String tempVar = stringVariable.repeat(wordToBeGuessed.length());//Add "_" to the string to indicate blank spaces for characters in string.
        int wrongGuess = 0;
        int x = wordToBeGuessed.length();
        System.out.println(tempVar);

        do{
            System.out.print("\nEnter a character you guessed: ");
            char tempCharacter = userInput.next().charAt(0);
            char tempChar = Character.toLowerCase(tempCharacter); //Removes case sensitivity from the program.

            boolean guessStatus = false;

            for (int i=0; i<x; i++) { //This body of code checks guessed characters.
                if (tempChar == wordToBeGuessed.charAt(i)) {
                    tempVar = tempVar.substring(0,i) + wordToBeGuessed.charAt(i) + tempVar.substring(i+1);
                    guessStatus = true;
                }
            }

            System.out.print(tempVar);

            if(guessStatus)
                System.out.println("\nRight Guess");
            else {
                wrongGuess++;
                if (wrongGuess == 1) {
                    System.out.println("\nWrong guess, try again");
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("_|_");
                    System.out.println();
                }
                if (wrongGuess == 2) {
                    System.out.println("\nWrong guess, try again");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("  _|_");
                }
                if (wrongGuess == 3) {
                    System.out.println("\nWrong guess, try again");
                    System.out.println("    ___________");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   | ");
                    System.out.println("  _|_");
                }
                if (wrongGuess == 4) {
                    System.out.println("\nWrong guess, try again");
                    System.out.println("    ___________");
                    System.out.println("   |          _|_");
                    System.out.println("   |         /   \\");
                    System.out.println("   |        |     |");
                    System.out.println("   |         \\_ _/");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("  _|_");
                }
                if (wrongGuess == 5) {
                    System.out.println("\nWrong guess, try again");
                    System.out.println("    ___________");
                    System.out.println("   |          _|_");
                    System.out.println("   |         /   \\");
                    System.out.println("   |        |     |");
                    System.out.println("   |         \\_ _/");
                    System.out.println("   |           |");
                    System.out.println("   |           |");
                    System.out.println("   |");
                    System.out.println("  _|_");
                }
                if (wrongGuess == 6) {
                    System.out.println("\nWrong guess, try again");
                    System.out.println("    ___________");
                    System.out.println("   |          _|_");
                    System.out.println("   |         /   \\");
                    System.out.println("   |        |     |");
                    System.out.println("   |         \\_ _/");
                    System.out.println("   |           |");
                    System.out.println("   |           |");
                    System.out.println("   |          / \\ ");
                    System.out.println("  _|_        /   \\");
                }
                if (wrongGuess == 7) {
                    System.out.println("\nGAME OVER!");
                    System.out.println("    ___________");
                    System.out.println("   |          _|_");
                    System.out.println("   |         /   \\");
                    System.out.println("   |        |     |");
                    System.out.println("   |         \\_ _/");
                    System.out.println("   |           |");
                    System.out.println("   |         / | \\");
                    System.out.println("   |          / \\ ");
                    System.out.println("  _|_        /   \\");

                    System.out.println("\nGAME OVER! The word was \"" + wordToBeGuessed+"\"");
                    System.exit(0); //Will terminate the program after 7 wrong attempts.
                }

                System.out.print("Hint: "); //Will provide hints to help the user.
                switch (randomNum){
                    case (0):
                        System.out.println("I WILL BE BACK. ;)");
                        break;
                    case (1):
                        System.out.println("A monkey feels very hungry.");
                        break;
                    case (2):
                        System.out.println("I code on it.");
                        break;
                    case (3):
                        System.out.println("Moo Moo");
                        break;
                    case (4):
                        System.out.println("Go away Little Jhonny wants to play.");
                        break;
                    case (5):
                        System.out.println("Let it break my thirst.");
                        break;
                    case (6):
                        System.out.println("Aug 1947");
                        break;
                    case (7):
                        System.out.println("Unofficially the national game of Pakistan.");
                        break;
                    case (8):
                        System.out.println("What you feel when you are caught cheating.");
                        break;
                    case (9):
                        System.out.println("National dish of Pakistan.");
                        break;
                    }
                }
            if (tempVar.contains("_")) //Will keep the program running if "_" is present in the string.
                gameStatus = true;
            else
                gameStatus = false; //Will terminate the program if the user has guessed the whole word correctly.

        }while(gameStatus);
        System.out.println("The secret word was \"" +wordToBeGuessed+ "\" you Win.");

    }
}
