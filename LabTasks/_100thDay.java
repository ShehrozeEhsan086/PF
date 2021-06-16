package com.Shehroze;

import java.time.DayOfWeek;
import java.util.Scanner;

//Task13
public class _100thDay {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter day: 1.Mon 2.Tue 3.Wed 4.Thurs 5.Fri 6.Sat 7.Sun : ");
        int day = userInput.nextInt();
        DayOfWeek currentDay = DayOfWeek.of(day);
        if (day>=1 && day<=5){
            DayOfWeek _100thDay = DayOfWeek.of(day+(100%7));
            System.out.println("100th day after "+currentDay+" is "+_100thDay);
        }
        else if (day == 6){
            DayOfWeek _100thDay = DayOfWeek.of(1);
            System.out.println("100th day after "+currentDay+" is "+_100thDay);
        }
        else if (day == 7){
            DayOfWeek _100thDay = DayOfWeek.of(2);
            System.out.println("100th day after "+currentDay+" is "+_100thDay);
        }
    }
}




