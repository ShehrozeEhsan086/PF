package com.Shehroze;

import java.util.Scanner;

public class lab1_Task9 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Subjects: \nScience   -(1)\nGeography -(2)\nHistory   -(3)\nEnter desired subject: ");
        int domain = userInput.nextInt();
        int marks = 0;
        int rightAnswers = 0;
        System.out.println(" ");
        switch (domain) {
            case (1):
                System.out.println("---SCIENCE---\n");
                System.out.println("Question Number 1: Which colour of light is deviated least?");
                System.out.println("(1)Red\t(2)Blue\t(3)Violet\t(4)Green");
                System.out.print("Enter your answer: ");
                int ans = userInput.nextInt();
                switch (ans) {
                    case (1):
                        System.out.println("Correct answer.");
                        marks += 5;
                        rightAnswers += 1;
                        break;
                    case (2):
                    case (3):
                    case (4):
                        System.out.println("Wrong answer.");
                        marks -= 2;
                        break;
                    default:
                        System.out.println("Option entered does not exist. Marks will be deducted.");
                        marks -= 2;
                }
                System.out.println(" ");
                System.out.println("Question Number 2: Which blood cells are called 'Soldiers' of the body?");
                System.out.println("(1)WBC\t(2)Platelets\t(3)RBC\t(4)All of the above");
                System.out.print("Enter your answer: ");
                ans = userInput.nextInt();
                switch (ans) {
                    case (1):
                        System.out.println("Correct answer.");
                        marks += 5;
                        rightAnswers += 1;
                        break;
                    case (2):
                    case (3):
                    case (4):
                        System.out.println("Wrong answer.");
                        marks -= 2;
                        break;
                    default:
                        System.out.println("Option entered does not exist. Marks will be deducted.");
                        marks -= 2;
                }
                System.out.println(" ");
                System.out.println("Question Number 3: Endothermic reactions are those in which?");
                System.out.println("(1)Heat is evolved\t(2)Heat is adsorbed\t(3)Temperature increases\t(4)Light is absorbed");
                System.out.print("Enter your answer: ");
                ans = userInput.nextInt();
                switch (ans) {
                    case (2):
                        System.out.println("Correct answer.");
                        marks += 5;
                        rightAnswers += 1;
                        break;
                    case (1):
                    case (3):
                    case (4):
                        System.out.println("Wrong answer.");
                        marks -= 2;
                        break;
                    default:
                        System.out.println("Option entered does not exist. Marks will be deducted.");
                        marks -= 2;
                }
                System.out.println(" ");
                System.out.println("Question Number 4: Which of the following is not a primary colour?");
                System.out.println("(1)Red\t(2)Blue\t(3)Green\t(4)Yellow");
                System.out.print("Enter your answer: ");
                ans = userInput.nextInt();
                switch (ans) {
                    case (4):
                        System.out.println("Correct answer.");
                        marks += 5;
                        rightAnswers += 1;
                        break;
                    case (1):
                    case (3):
                    case (2):
                        System.out.println("Wrong answer.");
                        marks -= 2;
                        break;
                    default:
                        System.out.println("Option entered does not exist. Marks will be deducted.");
                        marks -= 2;
                }
                System.out.println(" ");
                System.out.println("Question Number 5: Liquid Metal is?");
                System.out.println("(1)Bismuth\t(2)Magnesium\t(3)Mercury\t(4)Sodium");
                System.out.print("Enter your answer: ");
                ans = userInput.nextInt();
                switch (ans) {
                    case (3):
                        System.out.println("Correct answer.");
                        marks += 5;
                        rightAnswers += 1;
                        break;
                    case (1):
                    case (4):
                    case (2):
                        System.out.println("Wrong answer.");
                        marks -= 2;
                        break;
                    default:
                        System.out.println("Option entered does not exist. Marks will be deducted.");
                        marks -= 2;
                }
                break;
            case(2):
                System.out.println("---GEOGRAPHY---\n");
                System.out.println("Question Number 1: The second largest continent in the World is?");
                System.out.println("(1)Asia\t(2)South America\t(3)Africa\t(4)Europe");
                System.out.print("Enter your answer: ");
                ans = userInput.nextInt();
                switch (ans) {
                    case (3):
                        System.out.println("Correct answer.");
                        marks += 5;
                        rightAnswers += 1;
                        break;
                    case (2):
                    case (1):
                    case (4):
                        System.out.println("Wrong answer.");
                        marks -= 2;
                        break;
                    default:
                        System.out.println("Option entered does not exist. Marks will be deducted.");
                        marks -= 2;
                }
                System.out.println(" ");
                System.out.println("Question Number 2: Gobi is the desert of?");
                System.out.println("(1)Cold Coastal\t(2)Subtropical\t(3)Cold Winter\t(4)Polar");
                System.out.print("Enter your answer: ");
                ans = userInput.nextInt();
                switch (ans) {
                    case (1):
                        System.out.println("Correct answer.");
                        marks += 5;
                        rightAnswers += 1;
                        break;
                    case (2):
                    case (3):
                    case (4):
                        System.out.println("Wrong answer.");
                        marks -= 2;
                        break;
                    default:
                        System.out.println("Option entered does not exist. Marks will be deducted.");
                        marks -= 2;
                }
                System.out.println(" ");
                System.out.println("Question Number 3: The largest latitude circle on earth is?");
                System.out.println("(1)Arctic Circle\t(2)Tropic of Cancer\t(3)Tropic of Capricorn\t(4)The Equator");
                System.out.print("Enter your answer: ");
                ans = userInput.nextInt();
                switch (ans) {
                    case (4):
                        System.out.println("Correct answer.");
                        marks += 5;
                        rightAnswers += 1;
                        break;
                    case (1):
                    case (3):
                    case (2):
                        System.out.println("Wrong answer.");
                        marks -= 2;
                        break;
                    default:
                        System.out.println("Option entered does not exist. Marks will be deducted.");
                        marks -= 2;
                }
                System.out.println(" ");
                System.out.println("Question Number 4: Victoria desert is in?");
                System.out.println("(1)New Zealand\t(2)Australia\t(3)Canada\t(4)UK");
                System.out.print("Enter your answer: ");
                ans = userInput.nextInt();
                switch (ans) {
                    case (2):
                        System.out.println("Correct answer.");
                        marks += 5;
                        rightAnswers += 1;
                        break;
                    case (1):
                    case (3):
                    case (4):
                        System.out.println("Wrong answer.");
                        marks -= 2;
                        break;
                    default:
                        System.out.println("Option entered does not exist. Marks will be deducted.");
                        marks -= 2;
                }
                System.out.println(" ");
                System.out.println("Question Number 5: Geostationary orbit is at a height of?");
                System.out.println("(1)6km\t(2)1000km\t(3)3600km\t(4)36000km");
                System.out.print("Enter your answer: ");
                ans = userInput.nextInt();
                switch (ans) {
                    case (4):
                        System.out.println("Correct answer.");
                        marks += 5;
                        rightAnswers += 1;
                        break;
                    case (1):
                    case (3):
                    case (2):
                        System.out.println("Wrong answer.");
                        marks -= 2;
                        break;
                    default:
                        System.out.println("Option entered does not exist. Marks will be deducted.");
                        marks -= 2;
                }
                break;
            case(3):
                System.out.println("---HISTORY---\n");
                System.out.println("Question Number 1: Gawadar Port is constructed in the province of?");
                System.out.println("(1)Punjab\t(2)Sindh\t(3)KPK\t(4)Blochistan");
                System.out.print("Enter your answer: ");
                ans = userInput.nextInt();
                switch (ans) {
                    case (4):
                        System.out.println("Correct answer.");
                        marks += 5;
                        rightAnswers += 1;
                        break;
                    case (2):
                    case (1):
                    case (3):
                        System.out.println("Wrong answer.");
                        marks -= 2;
                        break;
                    default:
                        System.out.println("Option entered does not exist. Marks will be deducted.");
                        marks -= 2;
                }
                System.out.println(" ");
                System.out.println("Question Number 2: How many stanzas are there in pakistan national anthem?");
                System.out.println("(1)Three\t(2)Five\t(3)Six\t(4)Seven");
                System.out.print("Enter your answer: ");
                ans = userInput.nextInt();
                switch (ans) {
                    case (1):
                        System.out.println("Correct answer.");
                        marks += 5;
                        rightAnswers += 1;
                        break;
                    case (2):
                    case (3):
                    case (4):
                        System.out.println("Wrong answer.");
                        marks -= 2;
                        break;
                    default:
                        System.out.println("Option entered does not exist. Marks will be deducted.");
                        marks -= 2;
                }
                System.out.println(" ");
                System.out.println("Question Number 3: What was the old name of 'PIA'?");
                System.out.println("(1)Independence Airways\t(2)Orient Airways\t(3)Kolachi Airways\t(4)Air Pakistan");
                System.out.print("Enter your answer: ");
                ans = userInput.nextInt();
                switch (ans) {
                    case (2):
                        System.out.println("Correct answer.");
                        marks += 5;
                        rightAnswers += 1;
                        break;
                    case (1):
                    case (3):
                    case (4):
                        System.out.println("Wrong answer.");
                        marks -= 2;
                        break;
                    default:
                        System.out.println("Option entered does not exist. Marks will be deducted.");
                        marks -= 2;
                }
                System.out.println(" ");
                System.out.println("Question Number 4: Who was Mohammad Ali Bogra?");
                System.out.println("(1)Law Minister\t(2)Foreign Minister\t(3)Prime Minister\t(4)Parliament Minister");
                System.out.print("Enter your answer: ");
                ans = userInput.nextInt();
                switch (ans) {
                    case (3):
                        System.out.println("Correct answer.");
                        marks += 5;
                        rightAnswers += 1;
                        break;
                    case (1):
                    case (2):
                    case (4):
                        System.out.println("Wrong answer.");
                        marks -= 2;
                        break;
                    default:
                        System.out.println("Option entered does not exist. Marks will be deducted.");
                        marks -= 2;
                }
                System.out.println(" ");
                System.out.println("Question Number 5: When was Objective Resolution passed?");
                System.out.println("(1)9th June 1949\t(2)14th Feb 1949\t(3)15th Aug 1949\t(4)12th March 1949");
                System.out.print("Enter your answer: ");
                ans = userInput.nextInt();
                switch (ans) {
                    case (4):
                        System.out.println("Correct answer.");
                        marks += 5;
                        rightAnswers += 1;
                        break;
                    case (1):
                    case (3):
                    case (2):
                        System.out.println("Wrong answer.");
                        marks -= 2;
                        break;
                    default:
                        System.out.println("Option entered does not exist. Marks will be deducted.");
                        marks -= 2;
                }
                break;
            default:
                System.out.println("Please select from available options and try again.");
        }
        System.out.println("\nYou got "+rightAnswers+" correct answers and your marks are "+marks+"/25");
    }
}
