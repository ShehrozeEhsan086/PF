package com.Shehroze;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class lab1_Task7 {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the start time(Hours:Minutes:Seconds): ");
        String startTime = userInput.next();

        System.out.print("Enter the end time(Hours:Minutes:Seconds): ");
        String endTime = userInput.next();

        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");

        try {
            Date date1 = format.parse(startTime); // converting string to date
            Date date2 = format.parse(endTime);
            long difference = date2.getTime() - date1.getTime(); // gets the difference in milliseconds
            // Below code converts the milliseconds to HH:MM:SS format
            String result = String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(difference),
                    TimeUnit.MILLISECONDS.toMinutes(difference) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(difference)),
                    TimeUnit.MILLISECONDS.toSeconds(difference) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(difference)));
            System.out.println("The difference of the time periods is: "+result);
        } catch (ParseException e){
            e.printStackTrace();
        }
    }
}
