package com.Shehroze;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task12 {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your new password: ");
        String password_ = userInput.next();
        int length = password_.length();
        int countDigits = 0;
        for (int i = 0; i < length; i++) {
            if (Character.isDigit(password_.charAt(i))) {
                countDigits++;
            }
        }
        if (length>=8){
            if (Pattern.matches("[a-zA-Z0-9]+",password_)){
                if (countDigits>2)
                    System.out.println("Password entered is in correct format.");
                else
                    System.out.println("Wrong format. The password should contain at least 2 digits.");
            } else
                System.out.println("Wrong format. The password cannot have any special characters.");
        } else
            System.out.println("Wrong format. The password length must be at least 8 characters.");
    }
}
