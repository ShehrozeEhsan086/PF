package com.Shehroze;

public class Task8 {
    public static void main(String[] args){
        // create a StringBuilder object
        // using StringBuilder() constructor
        StringBuilder str
                = new StringBuilder();

        str.append("GFG");

        // print string
        System.out.println("String = "
                + str.toString());

        // create a StringBuilder object
        // using StringBuilder(CharSequence) constructor
        StringBuilder str1
                = new StringBuilder("AAAABBBCCCC");

        // print string
        System.out.println("String1 = "
                + str1.toString());

        // create a StringBuilder object
        // using StringBuilder(capacity) constructor
        StringBuilder str2
                = new StringBuilder(10);

        // print string
        System.out.println("String2 capacity = "
                + str2.capacity());

        // create a StringBuilder object
        // using StringBuilder(String) constructor
        StringBuilder str3
                = new StringBuilder(str1);

        // print string
        System.out.println("String3 = "
                + str3.toString());

        //STRING BUFFER
        StringBuffer sb=new StringBuffer("Hello ");
        System.out.println(sb);
    }
}
