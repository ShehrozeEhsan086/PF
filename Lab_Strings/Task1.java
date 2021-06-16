package com.Shehroze;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = userInput.next();
        System.out.print("Enter second string: ");
        String s2 = userInput.next();

        System.out.println("(a)");
        if (s1.equals(s2))
            System.out.println("Both strings are equal.");
        else
            System.out.println("Strings are not equal.");

        System.out.println("(b)");
        if (s1.equalsIgnoreCase(s2))
            System.out.println("Both strings are equal ignoring case sensitivity.");
        else
            System.out.println("Both strings are not equal even after ignoring case sensitivity.");

        System.out.println("(c)");
        if (s1.compareTo(s2)>0)
            System.out.println(s2+" is smaller.");
        else if (s1.compareTo(s2)<0)
            System.out.println(s1+" is smaller.");
        else
            System.out.println("Both are equal.");

        System.out.println("(d)");
        System.out.println("The length of s1 is "+s1.length());
        System.out.println("The length of s2 is "+s2.length());
        int totalLen = s1.length()+s2.length();
        System.out.println("Combined length of both strings is "+totalLen);

        System.out.println("(e)");
        String s3= s1+s2; //Creating string s3 by combining s1 and s2.
        System.out.println("s3 combined from s1 and s2: "+s3);

        System.out.println("(f)");
        String s3subString = s3.substring(2); //Creating a substring of s3 starting from index 2.
        System.out.println("Substring of s3 from index 2: "+s3subString);

        System.out.println("(g)");
        String s3subString_1 = s3.substring(1,4); //Creating a substring of s3 from index 1 to 4.
        System.out.println("Substring of s3 from index 1 to 4: "+s3subString_1);

        System.out.println("(h)");
        System.out.println("LowerCase s1: "+s1.toLowerCase());
        System.out.println("UpperCase s1: "+s1.toUpperCase());

        System.out.println("(i)");
        s3 = s3.replace('a','z');
        s3 = s3.replace('e','z');
        s3 = s3.replace('i','z');
        s3 = s3.replace('o','z');
        s3 = s3.replace('u','z');
        System.out.println("New s3: "+s3);
    }
}
