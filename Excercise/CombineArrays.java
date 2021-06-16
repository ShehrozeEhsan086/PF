package com.Shehroze;

import java.util.Arrays;
import java.util.Scanner;

public class CombineArrays {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the number of elements of first array: ");
        int arrayOneLength = userInput.nextInt();
        int array_1[] = new int[arrayOneLength];
        for(int i=0; i<arrayOneLength; i++){
            System.out.print("Enter the values at position "+(i+1)+": ");
            array_1[i] = userInput.nextInt();
        }
        System.out.print("Enter the number of elements of second array: ");
        int arrayTwoLength = userInput.nextInt();
        int array_2[] = new int[arrayOneLength];
        for(int j=0; j<arrayTwoLength; j++){
            System.out.print("Enter the values at position "+(j+1)+": ");
            array_2[j] = userInput.nextInt();
        }
        System.out.println(Arrays.toString(combine(array_1,array_2)));
    }
    public static int[] combine(int[] arrayOne, int[] arrayTwo){
        int combinedLength = arrayOne.length+ arrayTwo.length;
        int arrayThree[]= new int[combinedLength];
        int number = arrayOne.length;
        System.arraycopy(arrayOne,0,arrayThree,0,arrayOne.length);
        System.arraycopy(arrayTwo,0,arrayThree,number,arrayTwo.length);
        return arrayThree;

    }
}
