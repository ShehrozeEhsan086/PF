package com.Shehroze;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String unsortedWord = userInput.next();
        String sortedWord = unsortedWord;
        int length = unsortedWord.length();
        char characterOne,characterTwo;
        for(int i = 0; i <= length-1 ; i++){
            for(int j = i; j <= length-1 ; j++){

                if(sortedWord.charAt(i) > sortedWord.charAt(j)){

                    characterOne = sortedWord.charAt(i);

                    characterTwo = sortedWord.charAt(j);

                    sortedWord = sortedWord.substring(0,i)+characterTwo+sortedWord.substring(i+1);
                    sortedWord= sortedWord.substring(0,j)+characterOne+sortedWord.substring(j+1);
                }
            }
        }
        System.out.println(sortedWord);
    }
}