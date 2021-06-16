package com.Shehroze;

import java.util.Scanner;

public class lab1_Task4 {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = userInput.next().charAt(0);

        if ( Character.isLetter(ch)) {
            System.out.print(ch + " is an alphabet");
            if (Character.isLowerCase(ch))
                System.out.print(" and is lower case.");
            else
                System.out.print(" and is upper case");
        } else
            System.out.println(ch +" is not an alphabet");
    }
}

