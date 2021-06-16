package com.Shehroze;
//Task14
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        float fahrenheitTemp = userInput.nextFloat();
        float celsiusTemp = ((fahrenheitTemp)-32)*(0.5555555F);
        System.out.println(fahrenheitTemp+"°F = "+celsiusTemp+"°C");

    }
}
