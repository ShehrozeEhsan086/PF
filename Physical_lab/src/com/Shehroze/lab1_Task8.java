package com.Shehroze;

import java.util.Random;
import java.util.Scanner;

public class lab1_Task8 {
    public static void  main(String[] args){
        String computerSelection = "";
        Scanner userInput = new Scanner(System.in);
        System.out.println("---ROCK PAPER SCISSORS---");
        System.out.print("Please enter a move \nR for Rock, P for Paper and S for scissors: ");
        String userSelection = userInput.next().toLowerCase();
        Random computerNumGenerator = new Random();
        int computerGeneratedSelection = computerNumGenerator.nextInt(3);

        switch (computerGeneratedSelection){
            case (0):
                computerSelection = "r";
                break;
            case (1):
                computerSelection = "p";
                break;
            case (2):
                computerSelection = "s";
                break;
        }
        if (computerSelection.equals(userSelection))
            System.out.println("Its a draw.");
        else if (userSelection.equals("r")) {
            if (computerSelection.equals("s")) {
                System.out.println("Computer chose Scissors.");
                System.out.println("Player wins.");
            } else if (computerSelection.equals("p")) {
                System.out.println("Computer chose Paper.");
                System.out.println("Computer wins.");
            }
        }
        else if (userSelection.equals("p")) {
            if (computerSelection.equals("s")) {
                System.out.println("Computer chose Scissors.");
                System.out.println("Computer wins.");
            } else if (computerSelection.equals("r")) {
                System.out.println("Computer chose Rock.");
                System.out.println("Player wins.");
            }
        }
        else if (userSelection.equals("s")){
            if (computerSelection.equals("r")) {
                System.out.println("Computer chose Rock.");
                System.out.println("Computer wins.");
            }
            else if (computerSelection.equals("p")) {
                System.out.println("Computer chose Paper.");
                System.out.println("Player wins.");
            }
        }
        else
            System.out.println("Invalid input.");
    }
}

