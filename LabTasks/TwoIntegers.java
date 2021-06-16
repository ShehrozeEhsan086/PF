package com.Shehroze;

import java.util.Scanner;

//Task18
public class TwoIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOne,numTwo,vali_1,vali_2=0,vald_1,vald_2=0;
        System.out.print("Enter value 1: ");
        numOne = scan.nextInt();
        System.out.print("Enter value 2: ");
        numTwo = scan.nextInt();


        vali_1 = numOne++;
        vali_2 = ++numOne;


        System.out.println("We can observe pre-increment and post-increment.");
        System.out.println("(PRE)Value of vali is: " + vali_2 + " But value of num1 is " + numOne);
        System.out.println("(POST)Value of vali is: " + vali_1 + " But value of num1 is " + numTwo);

        vald_1 = numOne--;
        vald_2 = --numTwo;

        System.out.println("We can observe pre-increment and post-decrement.");
        System.out.println("(PRE)Value of vald is: " + vali_2 + " and value of num1 is " + numOne);
        System.out.println("(POST)Value of vald is: " + vald_1 + " and value of num1 is " + numTwo);
    }
}
