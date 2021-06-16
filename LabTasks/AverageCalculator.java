package com.Shehroze;
//Task5
import javax.swing.*;

public class AverageCalculator { //Average calculator for 3 fractional inputs
    public static void  main(String[] args){
        //Fraction value will be stored as string
        String valOne = JOptionPane.showInputDialog("Enter first value: ");
        //The index of "/" will be found to divide the string
        //into two parts as numerator and denominator
        int indexVal_1 = valOne.indexOf("/");
        //num_1_1 will be a string starting from index zero till the index of "/"
        String num_1_1 = (valOne.substring(0,indexVal_1));
        //num_1_2 will be a string starting from the next index of "/" to the end of the given input
        String num_2_1 = (valOne.substring(indexVal_1+1));
        //String values for numerator and denominator will be converted to float
        float numerator_1 = Float.parseFloat(num_1_1);
        float denominator_1 = Float.parseFloat(num_2_1);
        //float division will be performed to have a float value
        float varOneFloat = numerator_1 / denominator_1;

        //Same logic will be applied below for the remaining values
        String valTwo = JOptionPane.showInputDialog("Enter second value: ");
        int indexVal_2 = valTwo.indexOf("/");
        String num_1_2 = (valTwo.substring(0,indexVal_2));
        String num_2_2 = (valTwo.substring(indexVal_2+1));
        float numerator_2 = Float.parseFloat(num_1_2);
        float denominator_2 = Float.parseFloat(num_2_2);
        float varTwoFloat = numerator_2 / denominator_2;


        String valThree =JOptionPane.showInputDialog("Enter three value: ");
        int indexVal_3 = valThree.indexOf("/");
        String num_1_3 = (valThree.substring(0,indexVal_3));
        String num_2_3 = (valThree.substring(indexVal_3+1));
        float numerator_3 = Float.parseFloat(num_1_3);
        float denominator_3 = Float.parseFloat(num_2_3);
        float varThreeFloat = numerator_3 / denominator_3;

        //Average will be calculated from the float values we had
        float avg = (varOneFloat + varTwoFloat + varThreeFloat)/3;


        JOptionPane.showMessageDialog(null,String.format("Average is %.3f", avg));
    }
}
