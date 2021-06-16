package com.Shehroze;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){
        Character check = 'Y';
        String stringInput, temporaryVar;
        boolean status = true;
        Scanner userInput = new Scanner(System.in);

        while (check == 'Y') {

            System.out.print("Enter a integer value: ");
            int intInput = userInput.nextInt();
            stringInput = Integer.toString(intInput);

            temporaryVar = stringInput;
            int i = 0, j = stringInput.length() - 1;
            while (i < j) {
                if (stringInput.charAt(i) != temporaryVar.charAt(j)) {
                    System.out.println("Entered number-set is not a palindrome.");
                    status = false;
                    break;
                }
                else
                    status = true;
                i++;
                j--;
            }
            if (status)
                System.out.println("Entered number-set is a palindrome.");

            System.out.print("Do you want to re-run the program? (Y/N): ");
            check = userInput.next().charAt(0);

            if (check != 'Y')
                break;
        }
    }
}
