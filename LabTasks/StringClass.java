package com.Shehroze;

//Task20

public class StringClass{
    public static void main(String[] args){

        String variable_1 = "Hello";
        String variable_2 = "World";

        int stringLength = variable_1.length();

        System.out.println("The length of string: " + stringLength);

        System.out.println("Concatenation : " + variable_1.concat(variable_2));

        System.out.println("3rd alphabet of Hello is:" + variable_1.charAt(2));

        System.out.println("Comparing two different strings: " + variable_1.compareTo(variable_2));

        System.out.println("Lowercase Hello:" + variable_1.toLowerCase());

        System.out.println("Uppercase Hello:" + variable_1.toUpperCase());
    }
}
