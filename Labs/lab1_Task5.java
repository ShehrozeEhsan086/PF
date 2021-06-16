package com.Shehroze;

import java.util.Scanner;

public class lab1_Task5 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter your marks in Programming Fundamentals: ");
        float marks = userInput.nextFloat();

        if (marks < 101) {
            if (marks >= 90 && marks <= 100)
                System.out.println("GPA is 4.0");
            else if (marks >= 85 && marks < 90)
                System.out.println("GPA is 3.7");
            else if (marks >= 80 && marks < 85)
                System.out.println("GPA is 3.3");
            else if (marks >= 75 && marks < 80)
                System.out.println("GPA is 3.0");
            else if (marks >= 70 && marks < 75)
                System.out.println("GPA is 2.7");
            else if (marks >= 65 && marks < 70)
                System.out.println("GPA is 2.5");
            else if (marks >= 60 && marks < 65)
                System.out.println("GPA is 2.0");
            else
                System.out.println("FAIL");
        } else
            System.out.println("Invalid input");
    }
}

