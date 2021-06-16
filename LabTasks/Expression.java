package com.Shehroze;

import java.util.Scanner;

//Task16
public class Expression {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        int a,b,c,d,r;
        System.out.print("Enter values of a: ");
        a = userInput.nextInt();
        System.out.print("Enter values of b: ");
        b = userInput.nextInt();
        System.out.print("Enter values of c: ");
        c = userInput.nextInt();
        System.out.print("Enter values of d: ");
        d = userInput.nextInt();
        System.out.print("Enter values of r: ");
        r = userInput.nextInt();

        float ans = (float) (4) /(3 * (r + 34)) - 9 * (a + b * c) + (3 + d * (2 + a))/(a + (b * d));
        System.out.println("Answer: " + ans);
    }
}
