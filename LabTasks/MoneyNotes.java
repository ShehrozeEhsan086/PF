package com.Shehroze;

import java.util.Scanner;

//Task11
public class MoneyNotes {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        int totalAmount=0,note5k=0,note1k=0,note500=0,note100=0,note50=0,note10=0;
        System.out.print("Enter the amount of money(Max allowed value 99999): ");
        totalAmount = userInput.nextInt();

        note5k = totalAmount/5000;

        int remainingAmount = totalAmount - (note5k * 5000);

        if(remainingAmount>=1000){
            note1k = remainingAmount/1000;
            remainingAmount = remainingAmount - (note1k * 1000);
        }
        if(remainingAmount>=500){
            note500 = remainingAmount/500;
            remainingAmount = remainingAmount - (note500 * 500);
        }
        if (remainingAmount>=100){
            note100 = remainingAmount/100;
            remainingAmount = remainingAmount - (note100 * 100);
        }
        if (remainingAmount>=50){
            note50 = remainingAmount/50;
            remainingAmount = remainingAmount - (note50 * 50);
        }
        if (remainingAmount>=10){
            note10 = remainingAmount/10;
            remainingAmount =remainingAmount - (note10 * 10);
        }
        System.out.println("You will require:");
        if (note5k>0)
            System.out.println(note5k+" Rs.5000 notes.");
        if (note1k>0)
            System.out.println(note1k+" Rs.1000 notes.");
        if (note500>0)
            System.out.println(note500+" Rs.500 notes.");
        if (note100>0)
            System.out.println(note100+" Rs.100 notes.");
        if (note50>0)
            System.out.println(note50+" Rs.50 notes.");
        if (note10>0)
            System.out.println(note10+" Rs.10 notes.");
        if (remainingAmount>0)
            System.out.println("Rs."+remainingAmount+" is left as there are no notes less than 10.");
    }
}
