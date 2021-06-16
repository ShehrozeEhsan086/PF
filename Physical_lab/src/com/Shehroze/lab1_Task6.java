package com.Shehroze;

import java.util.Scanner;

public class lab1_Task6 {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter value of first number: ");
        int num_1 = userInput.nextInt();

        System.out.print("Enter value of second number: ");
        int num_2 = userInput.nextInt();

        System.out.println("What operation would you like to perform on the numbers?");
        System.out.print("You can choose from the following \nadd, sub, multiply, max, min, sqrt, power, log, sin, cos: ");
        String action = userInput.next();


        switch(action){
            case("add"):
                System.out.println("The sum of both numbers is "+ Math.addExact(num_1,num_2));
                break;
            case("sub"):
                System.out.println("The difference between the numbers is "+ Math.subtractExact(num_1,num_2));
                break;
            case("multiply"):
                System.out.println("The product of the numbers is "+ Math.multiplyExact(num_1,num_2));
                break;
            case("sqrt"): //An addition feature is added that allows to user to choose which numbers square root is printed
                System.out.print("Which entered number's square root do you require?\nOptions= \"first\", \"second\" or \"both\": ");
                String option = userInput.next();
                if(option.equals("first"))
                    System.out.println("The square root of "+num_1+" is "+ Math.sqrt(num_1));
                else if (option.equals("second"))
                    System.out.println("The square root of "+num_2+" is "+ Math.sqrt(num_2));
                else if (option.equals("both"))
                    System.out.println("The square root of "+num_1+" and "+num_2+" is "+Math.sqrt(num_1)+" and "+Math.sqrt(num_2)+" respectively.");
                else
                    System.out.println("The program encountered an irrecoverable error and needs to terminate.\nPlease check spelling next time.");
                break;
            case("power"):
                System.out.println(num_1+" power "+num_2+" is "+Math.pow(num_1,num_2));
                break;
            case("max"):
                System.out.println("The larger number is "+Math.max(num_1,num_2));
                break;
            case("min"):
                System.out.println("The smaller number is "+Math.min(num_1,num_2));
                break;
            case("log"):
                System.out.print("Which entered number's log do you require?\nOptions= \"first\", \"second\" or \"both\": ");
                String option_1 = userInput.next();
                if(option_1.equals("first"))
                    System.out.println("The log of "+num_1+" is "+ Math.log(num_1));
                else if (option_1.equals("second"))
                    System.out.println("The log of "+num_2+" is "+ Math.log(num_2));
                else if (option_1.equals("both"))
                    System.out.println("The log of "+num_1+" and "+num_2+" is "+Math.log(num_1)+" and "+Math.log(num_2)+" respectively.");
                else
                    System.out.println("The program encountered an irrecoverable error and needs to terminate.\nPlease check spelling next time.");
                break;
            case("sin"):
                System.out.print("Which entered number's sin do you require?\nOptions= \"first\", \"second\" or \"both\": ");
                String option_2 = userInput.next();
                if(option_2.equals("first"))
                    System.out.println("The sin of "+num_1+" is "+ Math.sin(num_1));
                else if (option_2.equals("second"))
                    System.out.println("The sin of "+num_2+" is "+ Math.sin(num_2));
                else if (option_2.equals("both"))
                    System.out.println("The sin of "+num_1+" and "+num_2+" is "+Math.sin(num_1)+" and "+Math.sin(num_2)+" respectively.");
                else
                    System.out.println("The program encountered an irrecoverable error and needs to terminate.\nPlease check spelling next time.");
                break;
            case("cos"):
                System.out.print("Which entered number's cos do you require?\nOptions= \"first\", \"second\" or \"both\": ");
                String option_3 = userInput.next();
                if(option_3.equals("first"))
                    System.out.println("The cos of "+num_1+" is "+ Math.cos(num_1));
                else if (option_3.equals("second"))
                    System.out.println("The cos of "+num_2+" is "+ Math.cos(num_2));
                else if (option_3.equals("both"))
                    System.out.println("The cos of "+num_1+" and "+num_2+" is "+Math.cos(num_1)+" and "+Math.cos(num_2)+" respectively.");
                else
                    System.out.println("The program encountered an irrecoverable error and needs to terminate.\nPlease check spelling next time.");
                break;
            default:
                System.out.println("Something went wrong. Please check if you entered an available option");
        }
    }
}
