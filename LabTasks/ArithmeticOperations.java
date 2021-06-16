package com.Shehroze;
//Task7
import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args){
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int numOne = inputUser.nextInt();
        System.out.print("Enter another number: ");
        int numTwo = inputUser.nextInt();

        System.out.println("Sum= " + (numOne + numTwo));
        System.out.println("Subtraction= " + (numOne - numTwo));
        System.out.println("Modulus= " + (numOne % numTwo));
        System.out.println("Product= " + (numOne * numTwo));
        System.out.println("Division= " + ((float)(numOne/numTwo)));
    }
}
