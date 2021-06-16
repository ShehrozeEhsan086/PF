package com.Shehroze;

import java.util.Scanner;

public class lab1_Task2{
    public static void main(String[] args) {
        float num_1, num_2, num_3;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num_1 = s.nextFloat();

        System.out.print("Enter the second number: ");
        num_2 = s.nextFloat();

        System.out.print("Enter the third number: ");
        num_3 = s.nextFloat();

        if(num_1 > num_2 && num_1 > num_3)
            System.out.println("Largest number is: "+num_1);
        else if(num_2 > num_3)
            System.out.println("Largest number is: "+num_2);
        else
            System.out.println("Largest number is: "+num_3);
    }
}