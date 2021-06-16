package com.Shehroze;

import java.util.Scanner;

//Task15
public class TemperatureConverter2 {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        float celsiusTemperature = userInput.nextFloat();
        float fahrenheitTemperature = ((celsiusTemperature)*(1.8f))+32;
        System.out.println(celsiusTemperature+"°C = "+fahrenheitTemperature+"°F");
    }
}
