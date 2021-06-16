package com.Shehroze;
//Task3
import javax.swing.JOptionPane;


public class AreaOfCircleDialogBox {
    public static void main(String[] args) {
        final float pi = 3.14F;

        // Accepts string value from dialog box and converts to integer
        int radius = Integer.parseInt(JOptionPane.showInputDialog("Enter radius of circle: "));
        double area = pi * radius * radius;

        JOptionPane.showMessageDialog(null,"Area of Circle is " + area);
        // Displaying the result in a dialog box
    }
}
