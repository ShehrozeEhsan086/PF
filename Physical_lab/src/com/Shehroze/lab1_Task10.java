package com.Shehroze;

import java.util.Scanner;

public class lab1_Task10 {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        char positionOne = ' ';
        char positionTwo = ' ';
        char positionThree = ' ';
        char positionFour = ' ';
        char positionFive = ' ';
        char positionSix = ' ';
        char positionSeven = ' ';
        char positionEight = ' ';
        char positionNine = ' ';

        System.out.print("Player 1, Please choose your sign \"X\" or \"O\": ");

        char playerOneSelection = userInput.next().charAt(0);
        char playerOne = Character.toUpperCase(playerOneSelection);
        char playerTwo = ' ';

        if(playerOne == 'X'){
            playerTwo = 'O';
            System.out.println("Player 2 gets \"O\"");
        }
        else if(playerOne == 'O'){
            playerTwo = 'X';
            System.out.println("Player 2 gets \"X\"");
        }
        else{
            System.out.println("Invalid Input. Program will terminate.");
            System.exit(0);
        }

        System.out.println("Current Game table: \t\tPosition Table for reference:");
        System.out.println("\t\t"+positionOne+"|"+positionTwo+"|"+positionThree+"\t\t\t\t\t\t\t1|2|3");
        System.out.println("\t\t"+positionFour+"|"+positionFive+"|"+positionSix+"\t\t\t\t\t\t\t4|5|6");
        System.out.println("\t\t"+positionSeven+"|"+positionEight+"|"+positionNine+"\t\t\t\t\t\t\t7|8|9");

        System.out.print("\nPlayer 1 take your turn. Enter the reference position for your sign: ");
        char playerOnePlay = userInput.next().charAt(0);
        switch (playerOnePlay){
            case('1'):
                positionOne = playerOne;
                break;
            case('2'):
                positionTwo = playerOne;
                break;
            case('3'):
                positionThree = playerOne;
                break;
            case('4'):
                positionFour = playerOne;
                break;
            case('5'):
                positionFive = playerOne;
                break;
            case('6'):
                positionSix = playerOne;
                break;
            case('7'):
                positionSeven = playerOne;
                break;
            case('8'):
                positionEight = playerOne;
                break;
            case('9'):
                positionNine = playerOne;
                break;
            default:
                System.out.println("Invalid reference position.");
        }

        System.out.println("Current Game table: \t\tPosition Table for reference:");
        System.out.println("\t\t"+positionOne+"|"+positionTwo+"|"+positionThree+"\t\t\t\t\t\t\t1|2|3");
        System.out.println("\t\t"+positionFour+"|"+positionFive+"|"+positionSix+"\t\t\t\t\t\t\t4|5|6");
        System.out.println("\t\t"+positionSeven+"|"+positionEight+"|"+positionNine+"\t\t\t\t\t\t\t7|8|9");

        System.out.print("\nPlayer 2 take your turn. Enter the reference position for your sign: ");
        char playerTwoPlay = userInput.next().charAt(0);
        switch (playerTwoPlay){
            case('1'):
                positionOne = playerTwo;
                break;
            case('2'):
                positionTwo = playerTwo;
                break;
            case('3'):
                positionThree = playerTwo;
                break;
            case('4'):
                positionFour = playerTwo;
                break;
            case('5'):
                positionFive = playerTwo;
                break;
            case('6'):
                positionSix = playerTwo;
                break;
            case('7'):
                positionSeven = playerTwo;
                break;
            case('8'):
                positionEight = playerTwo;
                break;
            case('9'):
                positionNine = playerTwo;
                break;
            default:
                System.out.println("Invalid reference position.");
        }

        System.out.println("Current Game table: \t\tPosition Table for reference:");
        System.out.println("\t\t"+positionOne+"|"+positionTwo+"|"+positionThree+"\t\t\t\t\t\t\t1|2|3");
        System.out.println("\t\t"+positionFour+"|"+positionFive+"|"+positionSix+"\t\t\t\t\t\t\t4|5|6");
        System.out.println("\t\t"+positionSeven+"|"+positionEight+"|"+positionNine+"\t\t\t\t\t\t\t7|8|9");

        System.out.print("\nPlayer 1 take your turn. Enter the reference position for your sign: ");
        playerOnePlay = userInput.next().charAt(0);
        switch (playerOnePlay){
            case('1'):
                positionOne = playerOne;
                break;
            case('2'):
                positionTwo = playerOne;
                break;
            case('3'):
                positionThree = playerOne;
                break;
            case('4'):
                positionFour = playerOne;
                break;
            case('5'):
                positionFive = playerOne;
                break;
            case('6'):
                positionSix = playerOne;
                break;
            case('7'):
                positionSeven = playerOne;
                break;
            case('8'):
                positionEight = playerOne;
                break;
            case('9'):
                positionNine = playerOne;
                break;
            default:
                System.out.println("Invalid reference position.");
        }

        System.out.println("Current Game table: \t\tPosition Table for reference:");
        System.out.println("\t\t"+positionOne+"|"+positionTwo+"|"+positionThree+"\t\t\t\t\t\t\t1|2|3");
        System.out.println("\t\t"+positionFour+"|"+positionFive+"|"+positionSix+"\t\t\t\t\t\t\t4|5|6");
        System.out.println("\t\t"+positionSeven+"|"+positionEight+"|"+positionNine+"\t\t\t\t\t\t\t7|8|9");

        System.out.print("\nPlayer 2 take your turn. Enter the reference position for your sign: ");
        playerTwoPlay = userInput.next().charAt(0);
        switch (playerTwoPlay){
            case('1'):
                positionOne = playerTwo;
                break;
            case('2'):
                positionTwo = playerTwo;
                break;
            case('3'):
                positionThree = playerTwo;
                break;
            case('4'):
                positionFour = playerTwo;
                break;
            case('5'):
                positionFive = playerTwo;
                break;
            case('6'):
                positionSix = playerTwo;
                break;
            case('7'):
                positionSeven = playerTwo;
                break;
            case('8'):
                positionEight = playerTwo;
                break;
            case('9'):
                positionNine = playerTwo;
                break;
            default:
                System.out.println("Invalid reference position.");
        }

        System.out.println("Current Game table: \t\tPosition Table for reference:");
        System.out.println("\t\t"+positionOne+"|"+positionTwo+"|"+positionThree+"\t\t\t\t\t\t\t1|2|3");
        System.out.println("\t\t"+positionFour+"|"+positionFive+"|"+positionSix+"\t\t\t\t\t\t\t4|5|6");
        System.out.println("\t\t"+positionSeven+"|"+positionEight+"|"+positionNine+"\t\t\t\t\t\t\t7|8|9");

        System.out.print("\nPlayer 1 take your turn. Enter the reference position for your sign: ");
        playerOnePlay = userInput.next().charAt(0);
        switch (playerOnePlay){
            case('1'):
                positionOne = playerOne;
                break;
            case('2'):
                positionTwo = playerOne;
                break;
            case('3'):
                positionThree = playerOne;
                break;
            case('4'):
                positionFour = playerOne;
                break;
            case('5'):
                positionFive = playerOne;
                break;
            case('6'):
                positionSix = playerOne;
                break;
            case('7'):
                positionSeven = playerOne;
                break;
            case('8'):
                positionEight = playerOne;
                break;
            case('9'):
                positionNine = playerOne;
                break;
            default:
                System.out.println("Invalid reference position.");
        }

        System.out.println("Current Game table: \t\tPosition Table for reference:");
        System.out.println("\t\t"+positionOne+"|"+positionTwo+"|"+positionThree+"\t\t\t\t\t\t\t1|2|3");
        System.out.println("\t\t"+positionFour+"|"+positionFive+"|"+positionSix+"\t\t\t\t\t\t\t4|5|6");
        System.out.println("\t\t"+positionSeven+"|"+positionEight+"|"+positionNine+"\t\t\t\t\t\t\t7|8|9");

        if (positionOne == playerOne && positionTwo == playerOne && positionThree == playerOne || positionOne == playerOne && positionFour == playerOne && positionSeven == playerOne || positionOne == playerOne && positionFive == playerOne && positionNine == playerOne || positionFour == playerOne && positionFive == playerOne && positionSix == playerOne || positionSeven == playerOne && positionEight == playerOne && positionNine == playerOne || positionThree == playerOne && positionSix == playerOne && positionNine == playerOne || positionTwo == playerOne && positionFive == playerOne && positionEight == playerOne) {
            System.out.print("Player 1 wins.");
            System.exit(0);
        }
        else if (positionOne == playerTwo && positionTwo == playerTwo && positionThree == playerTwo || positionOne == playerTwo && positionFour== playerTwo && positionSeven == playerTwo || positionOne == playerTwo && positionFive == playerTwo && positionNine == playerTwo || positionFour == playerTwo && positionFive == playerTwo && positionSix == playerTwo || positionSeven == playerTwo && positionEight == playerTwo && positionNine == playerTwo || positionThree == playerTwo && positionSix == playerTwo && positionNine ==  playerTwo|| positionTwo == playerTwo && positionFive == playerTwo && positionEight == playerTwo  ) {
            System.out.println("Player 2 wins.");
            System.exit(0);
        }

        System.out.print("\nPlayer 2 take your turn. Enter the reference position for your sign: ");
        playerTwoPlay = userInput.next().charAt(0);
        switch (playerTwoPlay){
            case('1'):
                positionOne = playerTwo;
                break;
            case('2'):
                positionTwo = playerTwo;
                break;
            case('3'):
                positionThree = playerTwo;
                break;
            case('4'):
                positionFour = playerTwo;
                break;
            case('5'):
                positionFive = playerTwo;
                break;
            case('6'):
                positionSix = playerTwo;
                break;
            case('7'):
                positionSeven = playerTwo;
                break;
            case('8'):
                positionEight = playerTwo;
                break;
            case('9'):
                positionNine = playerTwo;
                break;
            default:
                System.out.println("Invalid reference position.");
        }

        System.out.println("Current Game table: \t\tPosition Table for reference:");
        System.out.println("\t\t"+positionOne+"|"+positionTwo+"|"+positionThree+"\t\t\t\t\t\t\t1|2|3");
        System.out.println("\t\t"+positionFour+"|"+positionFive+"|"+positionSix+"\t\t\t\t\t\t\t4|5|6");
        System.out.println("\t\t"+positionSeven+"|"+positionEight+"|"+positionNine+"\t\t\t\t\t\t\t7|8|9");

        if (positionOne == playerOne && positionTwo == playerOne && positionThree == playerOne || positionOne == playerOne && positionFour == playerOne && positionSeven == playerOne || positionOne == playerOne && positionFive == playerOne && positionNine == playerOne || positionFour == playerOne && positionFive == playerOne && positionSix == playerOne || positionSeven == playerOne && positionEight == playerOne && positionNine == playerOne || positionThree == playerOne && positionSix == playerOne && positionNine == playerOne || positionTwo == playerOne && positionFive == playerOne && positionEight == playerOne) {
            System.out.print("Player 1 wins.");
            System.exit(0);
        }
        else if (positionOne == playerTwo && positionTwo == playerTwo && positionThree == playerTwo || positionOne == playerTwo && positionFour== playerTwo && positionSeven == playerTwo || positionOne == playerTwo && positionFive == playerTwo && positionNine == playerTwo || positionFour == playerTwo && positionFive == playerTwo && positionSix == playerTwo || positionSeven == playerTwo && positionEight == playerTwo && positionNine == playerTwo || positionThree == playerTwo && positionSix == playerTwo && positionNine ==  playerTwo|| positionTwo == playerTwo && positionFive == playerTwo && positionEight == playerTwo  ) {
            System.out.println("Player 2 wins.");
            System.exit(0);
        }

        System.out.print("\nPlayer 1 take your turn. Enter the reference position for your sign: ");
        playerOnePlay = userInput.next().charAt(0);
        switch (playerOnePlay) {
            case ('1'):
                positionOne = playerOne;
                break;
            case ('2'):
                positionTwo = playerOne;
                break;
            case ('3'):
                positionThree = playerOne;
                break;
            case ('4'):
                positionFour = playerOne;
                break;
            case ('5'):
                positionFive = playerOne;
                break;
            case ('6'):
                positionSix = playerOne;
                break;
            case ('7'):
                positionSeven = playerOne;
                break;
            case ('8'):
                positionEight = playerOne;
                break;
            case ('9'):
                positionNine = playerOne;
                break;
            default:
                System.out.println("Invalid reference position.");
        }

        System.out.println("Current Game table: \t\tPosition Table for reference:");
        System.out.println("\t\t"+positionOne+"|"+positionTwo+"|"+positionThree+"\t\t\t\t\t\t\t1|2|3");
        System.out.println("\t\t"+positionFour+"|"+positionFive+"|"+positionSix+"\t\t\t\t\t\t\t4|5|6");
        System.out.println("\t\t"+positionSeven+"|"+positionEight+"|"+positionNine+"\t\t\t\t\t\t\t7|8|9");

        if (positionOne == playerOne && positionTwo == playerOne && positionThree == playerOne || positionOne == playerOne && positionFour == playerOne && positionSeven == playerOne || positionOne == playerOne && positionFive == playerOne && positionNine == playerOne || positionFour == playerOne && positionFive == playerOne && positionSix == playerOne || positionSeven == playerOne && positionEight == playerOne && positionNine == playerOne || positionThree == playerOne && positionSix == playerOne && positionNine == playerOne || positionTwo == playerOne && positionFive == playerOne && positionEight == playerOne) {
            System.out.print("Player 1 wins.");
            System.exit(0);
        }
        else if (positionOne == playerTwo && positionTwo == playerTwo && positionThree == playerTwo || positionOne == playerTwo && positionFour== playerTwo && positionSeven == playerTwo || positionOne == playerTwo && positionFive == playerTwo && positionNine == playerTwo || positionFour == playerTwo && positionFive == playerTwo && positionSix == playerTwo || positionSeven == playerTwo && positionEight == playerTwo && positionNine == playerTwo || positionThree == playerTwo && positionSix == playerTwo && positionNine ==  playerTwo|| positionTwo == playerTwo && positionFive == playerTwo && positionEight == playerTwo  ) {
            System.out.println("Player 2 wins.");
            System.exit(0);
        }

        System.out.print("\nPlayer 2 take your turn. Enter the reference position for your sign: ");
        playerTwoPlay = userInput.next().charAt(0);
        switch (playerTwoPlay){
            case('1'):
                positionOne = playerTwo;
                break;
            case('2'):
                positionTwo = playerTwo;
                break;
            case('3'):
                positionThree = playerTwo;
                break;
            case('4'):
                positionFour = playerTwo;
                break;
            case('5'):
                positionFive = playerTwo;
                break;
            case('6'):
                positionSix = playerTwo;
                break;
            case('7'):
                positionSeven = playerTwo;
                break;
            case('8'):
                positionEight = playerTwo;
                break;
            case('9'):
                positionNine = playerTwo;
                break;
            default:
                System.out.println("Invalid reference position.");
        }

        System.out.println("Current Game table: \t\tPosition Table for reference:");
        System.out.println("\t\t"+positionOne+"|"+positionTwo+"|"+positionThree+"\t\t\t\t\t\t\t1|2|3");
        System.out.println("\t\t"+positionFour+"|"+positionFive+"|"+positionSix+"\t\t\t\t\t\t\t4|5|6");
        System.out.println("\t\t"+positionSeven+"|"+positionEight+"|"+positionNine+"\t\t\t\t\t\t\t7|8|9");

        if (positionOne == playerOne && positionTwo == playerOne && positionThree == playerOne || positionOne == playerOne && positionFour == playerOne && positionSeven == playerOne || positionOne == playerOne && positionFive == playerOne && positionNine == playerOne || positionFour == playerOne && positionFive == playerOne && positionSix == playerOne || positionSeven == playerOne && positionEight == playerOne && positionNine == playerOne || positionThree == playerOne && positionSix == playerOne && positionNine == playerOne || positionTwo == playerOne && positionFive == playerOne && positionEight == playerOne) {
            System.out.print("Player 1 wins.");
            System.exit(0);
        }
        else if (positionOne == playerTwo && positionTwo == playerTwo && positionThree == playerTwo || positionOne == playerTwo && positionFour== playerTwo && positionSeven == playerTwo || positionOne == playerTwo && positionFive == playerTwo && positionNine == playerTwo || positionFour == playerTwo && positionFive == playerTwo && positionSix == playerTwo || positionSeven == playerTwo && positionEight == playerTwo && positionNine == playerTwo || positionThree == playerTwo && positionSix == playerTwo && positionNine ==  playerTwo|| positionTwo == playerTwo && positionFive == playerTwo && positionEight == playerTwo  ) {
            System.out.println("Player 2 wins.");
            System.exit(0);
        }

        System.out.print("\nPlayer 1 take your turn. Enter the reference position for your sign: ");
        playerOnePlay = userInput.next().charAt(0);
        switch (playerOnePlay) {
            case ('1'):
                positionOne = playerOne;
                break;
            case ('2'):
                positionTwo = playerOne;
                break;
            case ('3'):
                positionThree = playerOne;
                break;
            case ('4'):
                positionFour = playerOne;
                break;
            case ('5'):
                positionFive = playerOne;
                break;
            case ('6'):
                positionSix = playerOne;
                break;
            case ('7'):
                positionSeven = playerOne;
                break;
            case ('8'):
                positionEight = playerOne;
                break;
            case ('9'):
                positionNine = playerOne;
                break;
            default:
                System.out.println("Invalid reference position.");
        }

        if (positionOne == playerOne && positionTwo == playerOne && positionThree == playerOne || positionOne == playerOne && positionFour == playerOne && positionSeven == playerOne || positionOne == playerOne && positionFive == playerOne && positionNine == playerOne || positionFour == playerOne && positionFive == playerOne && positionSix == playerOne || positionSeven == playerOne && positionEight == playerOne && positionNine == playerOne || positionThree == playerOne && positionSix == playerOne && positionNine == playerOne || positionTwo == playerOne && positionFive == playerOne && positionEight == playerOne) {
            System.out.print("Player 1 wins.");
            System.exit(0);
        }
        else if (positionOne == playerTwo && positionTwo == playerTwo && positionThree == playerTwo || positionOne == playerTwo && positionFour== playerTwo && positionSeven == playerTwo || positionOne == playerTwo && positionFive == playerTwo && positionNine == playerTwo || positionFour == playerTwo && positionFive == playerTwo && positionSix == playerTwo || positionSeven == playerTwo && positionEight == playerTwo && positionNine == playerTwo || positionThree == playerTwo && positionSix == playerTwo && positionNine ==  playerTwo|| positionTwo == playerTwo && positionFive == playerTwo && positionEight == playerTwo  ) {
            System.out.println("Player 2 wins.");
            System.exit(0);
        }
        else
            System.out.println("Its a draw.");

        System.out.println("Current Game table: \t\tPosition Table for reference:");
        System.out.println("\t\t"+positionOne+"|"+positionTwo+"|"+positionThree+"\t\t\t\t\t\t\t1|2|3");
        System.out.println("\t\t"+positionFour+"|"+positionFive+"|"+positionSix+"\t\t\t\t\t\t\t4|5|6");
        System.out.println("\t\t"+positionSeven+"|"+positionEight+"|"+positionNine+"\t\t\t\t\t\t\t7|8|9");
    }
}
