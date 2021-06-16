package com.Shehroze;
//Task8
import java.util.Scanner;

public class SecondsConverter {
    public static void main(String[] args){
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Enter the amount of seconds: ");
        long seconds = inputUser.nextLong();

        System.out.println("Minutes: " + ((float)seconds/60));
        System.out.println("Hours: " + ((float)seconds/3600));
        System.out.println("Days: " + ((float)seconds/84_400));
        System.out.println("Months: " + ((float)seconds/2_592_000));
        System.out.println("Years: " + ((float)seconds/31_104_000));
    }
}
