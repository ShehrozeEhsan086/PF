package com.Shehroze;
// Task6
import javax.swing.*;

public class WholeNumberAvg {
    public static void  main(String[] args) {
        int valOne = Integer.parseInt(JOptionPane.showInputDialog("Enter first number: "));
        int valTwo = Integer.parseInt(JOptionPane.showInputDialog("Enter second number: "));
        int valThree = Integer.parseInt(JOptionPane.showInputDialog("Enter third number: "));

        float avg = (float)(valOne + valTwo + valThree)/3;
        JOptionPane.showMessageDialog(null,String.format("Average is %.3f",avg));

    }
}
