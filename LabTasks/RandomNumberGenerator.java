package com.Shehroze;
//Task1
import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args){

        Random randomNUmber = new Random();
        int number = randomNUmber.nextInt(1001);
        System.out.println("Random Number Generated is " + number);

    }
}
