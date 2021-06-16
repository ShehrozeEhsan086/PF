package com.Shehroze;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task11 {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your CNIC format(*****-*******-*): ");
        String cnic =  userInput.next();
        if(Pattern.matches("[0-9-]+",cnic)){
            if(cnic.charAt(5)=='-' && cnic.charAt(13)=='-'){
                System.out.println("The entered CNIC is in correct format.");
            } else
                System.out.println("Wrong format.");
        }else
            System.out.println("Wrong format.");
    }
}
