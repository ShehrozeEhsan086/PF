package com.Shehroze;
//Task2
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        final float pi = 3.14F;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        double radius = inputUser.nextDouble();

        double area = pi * radius * radius;

        System.out.printf("Area of circle is " + "%.2f", area);
        // will print result in console
    }
}
