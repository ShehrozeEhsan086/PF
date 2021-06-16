package com.Shehroze;

import java.util.Scanner;

public class lab1_Task3 {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = userInput.nextInt();

        if (year % 4 == 0){
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    System.out.println(year + " is a lunar year.");
                else
                    System.out.println(year + " is not a lunar year.");
            } else
                System.out.println(year + " is a leap year.");
        } else
            System.out.println("It is not a lunar year");
    }
}
