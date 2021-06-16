package com.Shehroze;

import java.util.Scanner;

public class NumOfAppearanceCount {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter the number of rows in the array: ");
        int row = userInput.nextInt();
        System.out.print("Please enter the number of columns in the arrays: ");
        int column = userInput.nextInt();
        int[][] array = new int[row][column];
        for(int i = 0; i<row ; i++ ){
            for(int j = 0; j<column ; j++ ){
                System.out.print("Enter value for position ["+(i+1)+"]["+(j+1)+"] : ");
                array[i][j] = userInput.nextInt();
            }
        }

        System.out.println();

        int counterZero = 0,counterOne=0 ,counterTwo=0,counterThree=0,counterFour=0,counterFive=0,counterSix=0,counterSeven=0,counterEight=0,counterNine=0;

        for(int i = 0; i<row ; i++ ){
            for(int j = 0; j<column ; j++ ){
                if(array[i][j] == 1)
                    counterOne++;
                else if (array[i][j] == 2)
                    counterTwo++;
                else if (array[i][j] == 3)
                    counterThree++;
                else if (array[i][j] == 4)
                    counterFour++;
                else if (array[i][j] == 5)
                    counterFive++;
                else if (array[i][j] == 6)
                    counterSix++;
                else if (array[i][j] == 7)
                    counterSeven++;
                else if (array[i][j] == 8)
                    counterEight++;
                else if (array[i][j] == 9)
                    counterNine++;
                else
                    counterZero++;
            }
        }
        output(counterZero,counterOne,counterTwo,counterThree,counterFour,counterFive,counterSix,counterSeven,counterEight,counterNine);

    }
    public static void output(int c0,int c1,int c2,int c3,int c4,int c5,int c6,int c7,int c8,int c9){

        int[] tempArray = new int[10];
        tempArray[0] = c0;
        tempArray[1] = c1;
        tempArray[2] = c2;
        tempArray[3] = c3;
        tempArray[4] = c4;
        tempArray[5] = c5;
        tempArray[6] = c6;
        tempArray[7] = c7;
        tempArray[8] = c8;
        tempArray[9] = c9;

        for (int x = 0; x<10 ; x++){
            if(tempArray[x]>0)
                System.out.println("The value "+ x +" appears "+tempArray[x]+" times.");
            else
                continue;
        }
    }
}
