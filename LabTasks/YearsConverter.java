package com.Shehroze;
//Task9
import java.util.Scanner;

public class YearsConverter {
    public static void main(String[] args){
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Enter the Number of years: ");
        float years = inputUser.nextFloat();

        System.out.println("Months: " + (years*12));
        System.out.println("Days: " + (years*360));
        System.out.println("Hours: " + (years*8_640));
        System.out.println("Minutes: " + (years*518_400));
        System.out.println("Seconds: " + (years*31_104_000));

    }
}
