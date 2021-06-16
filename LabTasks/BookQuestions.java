package com.Shehroze;

//Task19

import java.util.Scanner;

public class BookQuestions {
    public static void main(String[] args) {

        //2.18

        float a, b;
        System.out.println("a\t\tb\t\tpow(a, b)");
        a = 1;
        b = 2;
        System.out.println((int) a + "\t\t"  +(int)b+ "\t\t" +(int)Math.pow(a,b));
        a++;
        b++;
        System.out.println((int) a + "\t\t"  +(int)b+ "\t\t" +(int)Math.pow(a,b));
        a++;
        b++;
        System.out.println((int) a + "\t\t"  +(int)b+ "\t\t" +(int)Math.pow(a,b));
        a++;
        b++;
        System.out.println((int) a + "\t\t"  +(int)b+ "\t\t" +(int)Math.pow(a,b));
        a++;
        b++;
        System.out.println((int) a + "\t\t"  +(int)b+ "\t\t" +(int)Math.pow(a,b));


        //2.19

        Scanner input = new Scanner(System.in);


        // Prompt the user to enter three points
        System.out.println("Enter three points for a triangle: ");

        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();

        System.out.print("Enter x3: ");
        double x3 = input.nextDouble();

        System.out.print("Enter y3: ");
        double y3 = input.nextDouble();

        double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
        double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
        double s = (side1 + side2 + side3) / 2;
        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);

        System.out.println("The area of the triangle is " + area);
    }
}

