package com.Shehroze;
//Task10
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a number(should have 5 digits): ");
        int inputNum = userInput.nextInt();
        int reminder,sum;

        reminder = inputNum % 10;
        sum = reminder;

        inputNum = inputNum / 10;
        reminder = inputNum % 10;
        sum = sum + reminder;

        inputNum = inputNum / 10;
        reminder = inputNum % 10;
        sum = sum + reminder;

        inputNum = inputNum / 10;
        reminder = inputNum % 10;
        sum = sum + reminder;

        inputNum = inputNum / 10;
        reminder = inputNum % 10;
        sum = sum + reminder;

        inputNum = inputNum / 10;
        sum = sum + inputNum;
        System.out.print("Sum of digits of 5 numbers is: " + sum);

    }
}
