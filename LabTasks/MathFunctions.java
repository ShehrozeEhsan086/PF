package com.Shehroze;


import java.util.Scanner;

//Task12
public class MathFunctions {
    public static void  main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter number: ");
        float numOne = userInput.nextFloat();
        System.out.print("Enter second number: ");
        float numTwo = userInput.nextFloat();
        System.out.println("Lowest Number: "+Math.min(numOne,numTwo));
        System.out.println("Highest Number: "+Math.max(numOne,numTwo));
        System.out.println("Sin of numbers: "+Math.sin(numOne)+" and "+ Math.sin(numTwo));
        System.out.println("Cos of numbers: "+Math.cos(numOne)+" and "+ Math.cos(numTwo));
        System.out.println("Rounding off numbers: "+Math.round(numOne)+" and "+Math.round(numTwo));
    }
}
