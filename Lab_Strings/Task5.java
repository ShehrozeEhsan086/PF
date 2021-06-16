package com.Shehroze;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Character check = 'Y';
        String stringInput, temporaryVar;
        boolean status = true;

        while (check == 'Y') {
            System.out.print("Enter the word: ");
            stringInput = userInput.next();
            temporaryVar = stringInput;
            int i = 0, j = stringInput.length() - 1;
            while (i < j) {
                if (stringInput.charAt(i) != temporaryVar.charAt(j)) {
                    System.out.println("Entered string is not a palindrome.");
                    status = false;
                    break;
                }
                else
                status = true;
                i++;
                j--;
            }
            if (status)
                System.out.println("Entered string is a palindrome.");

            System.out.print("Do you want to check some other word? (Y/N): ");
            check = userInput.next().charAt(0);

            if (check != 'Y')
                break;
        }
    }
}
