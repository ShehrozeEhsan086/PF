package com.Shehroze;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class RandomNumFile {
    public static void main(String[] args) {
        Random rand = new Random();
        try{
            PrintWriter toFile = new PrintWriter(new File("randomNumber.txt"));
            for (int i = 0; i< 25 ; i++){
                int randomNumber = rand.nextInt(100);
                toFile.print(randomNumber+" ");
            }
            toFile.close();
        }catch (FileNotFoundException e){
            System.out.println("File not found.");
        }
        int[] numbers = new int[25];
        try{
            Scanner readFile = new Scanner(new File("randomNumber.txt"));
            int i =0;
            while (readFile.hasNext()){
                int outputFromFile = readFile.nextInt();
                numbers[i] = outputFromFile;
                i++;
            }
        }catch (FileNotFoundException e){
            System.out.println("File not found.");
        }

        int size = numbers.length;
        for (int step = 1; step < size; step++) {
            int key = numbers[step];
            int j = step - 1;
            while (j >= 0 && key > numbers[j]) {
                numbers[j + 1] = numbers[j];
                --j;
            }
            numbers[j + 1] = key;
        }

        for (int t = 0; t<25;t++){
            System.out.print(numbers[t]+" ");
        }
    }
}
