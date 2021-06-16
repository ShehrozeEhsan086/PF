package com.Shehroze;

//Task17
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CurrentTime {
    public static void main(String[] args) {
        long seconds, minutes, hours;
        Date date = new Date();
        long currentTimeMilli = date.getTime();
        seconds = (currentTimeMilli / 1000);
        long sec = seconds % 60;
        minutes = (seconds/60);
        int mint =(int)(minutes%60);
        hours = (minutes/60);
        int hrs = (int)(hours%24);
        System.out.println("Current time in milliseconds= "+currentTimeMilli);
        System.out.println("Current time in seconds= "+seconds);
        System.out.println("Current time in minutes= "+mint);
        System.out.println("Current time in hours= "+hrs);



    }
}
