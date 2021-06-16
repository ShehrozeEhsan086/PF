package com.Shehroze;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class LabAssignment4 {
    public static void main(String[] args) {


        String temporaryInputOne = "0";
        int row_ = 0, column_ = 0;
        String temporaryInputStartKid;
        int rowPositionStart = 0, columnPositionStart = 0;
        int rowPosAli = 0, columnPosAli = 0;


        try{
            File fileInput = new File("Assign04.txt");
            int i=0;
            Scanner readInput = new Scanner(fileInput);
            while (readInput.hasNextLine()){
                switch (i){
                    case 0:
                        temporaryInputOne = readInput.nextLine(); //Taking the input as string
                        row_ = get_a(temporaryInputOne); //This function call will return the first number from the string input as integer value
                        column_ = get_b(temporaryInputOne); //This function call will return the second number from the string input as integer value
                        break;
                    case 1:
                        temporaryInputStartKid = readInput.nextLine();
                        rowPositionStart = get_a(temporaryInputStartKid) - 1;
                        columnPositionStart = get_b(temporaryInputStartKid) - 1;
                        break;
                    case 2:
                        String temporaryInputAli = readInput.nextLine();
                        rowPosAli = get_a(temporaryInputAli)-1;
                        columnPosAli = get_a(temporaryInputAli)-1;
                        break;
                    default:
                        break;
                }
                /*
                if (i==0){
                    temporaryInputOne = readInput.nextLine(); //Taking the input as string
                    row_ = get_a(temporaryInputOne); //This function call will return the first number from the string input as integer value
                    column_ = get_b(temporaryInputOne); //This function call will return the second number from the string input as integer value
                }
                else if (i==1){
                    temporaryInputStartKid = readInput.nextLine();
                    rowPositionStart = get_a(temporaryInputStartKid) - 1;
                    columnPositionStart = get_b(temporaryInputStartKid) - 1;

                }
                else if (i==2){
                    String temporaryInputAli = readInput.nextLine();
                    rowPosAli = get_a(temporaryInputAli)-1;
                    columnPosAli = get_a(temporaryInputAli)-1;
                }
                else
                    break;*/
                i++;
            }
        }catch (IOException e){}



        //Making a string matrix with value "pending" that will show kids who have not yet received chocolates
        String[][] sittingArrangement = new String[row_][column_];
        for (int i=0; i< row_; i++){
            for (int j=0;j< column_; j++){
                sittingArrangement[i][j] = "pending";
            }
        }


        sittingArrangement[rowPosAli][columnPosAli] = "ali_location"; // value of this location will change from "pending" to "ali_location"

        sittingArrangement[rowPositionStart][columnPositionStart] = "received"; //"received" shows first kid got the chocolate


        int row = rowPositionStart;
        int column = columnPositionStart;


        while(true){


            boolean checkRight = checkRightPosition(sittingArrangement,row,column,column_);
            boolean checkLeft = checkLeftPosition(sittingArrangement,row,column);
            boolean checkFront = checkFrontPosition(sittingArrangement,row,column);
            boolean checkBack = checkBackPosition(sittingArrangement,row,column,row_);


            if (checkRight) {
                column = column + 1; //Moving the chocolate box to the right
                if (sittingArrangement[row][column].equals("ali_location")){ //Will recheck available positions when ali gets the chocolates

                    checkRight = checkRightPosition(sittingArrangement,row,column,column_);
                    checkLeft = checkLeftPosition(sittingArrangement,row,column);
                    checkFront = checkFrontPosition(sittingArrangement,row,column);
                    checkBack = checkBackPosition(sittingArrangement,row,column,row_);

                    aliBehaviour(checkRight,checkLeft,checkFront,checkBack);
                    break;
                }
                else
                    sittingArrangement[row][column] = "received";
            }

            else if (checkLeft) {
                column = column - 1; //Moving the chocolate box to the left
                if (sittingArrangement[row][column].equals("ali_location")){

                    checkRight = checkRightPosition(sittingArrangement,row,column,column_);
                    checkLeft = checkLeftPosition(sittingArrangement,row,column);
                    checkFront = checkFrontPosition(sittingArrangement,row,column);
                    checkBack = checkBackPosition(sittingArrangement,row,column,row_);

                    aliBehaviour(checkRight,checkLeft,checkFront,checkBack);
                    break;
                }
                else
                    sittingArrangement[row][column] = "received";
            }

            else if (checkFront){
                row = row - 1; //Moving the chocolate box to the the front
                if (sittingArrangement[row][column].equals("ali_location")){

                    checkRight = checkRightPosition(sittingArrangement,row,column,column_);
                    checkLeft = checkLeftPosition(sittingArrangement,row,column);
                    checkFront = checkFrontPosition(sittingArrangement,row,column);
                    checkBack = checkBackPosition(sittingArrangement,row,column,row_);

                    aliBehaviour(checkRight,checkLeft,checkFront,checkBack);
                    break;
                }
                else
                    sittingArrangement[row][column] = "received";
            }

            else if (checkBack) {
                row = row + 1; //Moving the chocolate box to the the back
                if (sittingArrangement[row][column].equals("ali_location")){

                    checkRight = checkRightPosition(sittingArrangement,row,column,column_);
                    checkLeft = checkLeftPosition(sittingArrangement,row,column);
                    checkFront = checkFrontPosition(sittingArrangement,row,column);
                    checkBack = checkBackPosition(sittingArrangement,row,column,row_);

                    aliBehaviour(checkRight,checkLeft,checkFront,checkBack);
                    break;
                }
                else
                    sittingArrangement[row][column] = "received";
            }
        }
    }

    public static boolean checkRightPosition(String[][] sittingArrangement, int row, int column,int totalColumn){
        if( column == totalColumn - 1) //controls position so it does not go out of bound
            return false; // returning false here means position to the right is not available
        else if (sittingArrangement[row][column+1].equals("ali_location") || sittingArrangement[row][column+1].equals("pending"))
            return true;
        else
            return false; // this shows that kid to the right has already received chocolate
    }

    public static boolean checkLeftPosition(String[][] sittingArrangement, int row, int column){
        if(column == 0) //controls position so it does not go out of bound
            return false; // returning false here means position to the left is not available
        else if(sittingArrangement[row][column-1].equals("ali_location") || sittingArrangement[row][column-1].equals("pending"))
            return true;
        else
            return false; // this shows that kid to the left has already received chocolate
    }

    public static boolean checkFrontPosition(String[][] sittingArrangement, int row, int column){
        if(row == 0) //controls position so it does not go out of bound
            return false; // returning false here means position to the front is not available
        else if(sittingArrangement[row-1][column].equals("ali_location") || sittingArrangement[row-1][column].equals("pending"))
            return true;
        else
            return false; // this shows that kid to the front has already received chocolate
    }

    public static boolean checkBackPosition(String[][] sittingArrangement, int row, int column, int totalRow){
        if(row == totalRow-1) //controls position so it does not go out of bound
            return false; // returning false here means position to the back is not available
        else if(sittingArrangement[row+1][column].equals("ali_location") || sittingArrangement[row+1][column].equals("pending"))
            return true;
        else
            return false; // this shows that kid to the back has already received chocolate
    }

    public static int get_a(String tempString){ // will return x from x,y
        int indexVal = tempString.indexOf(",");
        String _a = (tempString.substring(0,indexVal));
        int a = Integer.parseInt(_a);
        return a;
    }

    public static int get_b(String tempString){ // will return y from x,y
        int indexVal = tempString.indexOf(",");
        String _b = (tempString.substring(indexVal+1));
        int b = Integer.parseInt(_b);
        return b;
    }

    public static void aliBehaviour(boolean checkRight, boolean checkLeft, boolean checkFront, boolean checkBack){ // will show what happens when chocolate box reaches ali
        File fileInput = new File("Assign04.txt");
        String outputString;
        if(checkRight){
            try {
                OutputStream outputFile = new FileOutputStream(fileInput,true);
                outputString = "\nAli will move the box to the RIGHT!!!";
                byte[] outputStringByte = outputString.getBytes();
                outputFile.write(outputStringByte);
            }catch(IOException e){}
        }
        else if(checkLeft) {
            try {
                OutputStream outputFile = new FileOutputStream(fileInput, true);
                outputString = "\nAli will move the box to the LEFT!!!";
                byte[] outputStringByte = outputString.getBytes();
                outputFile.write(outputStringByte);
            } catch (IOException e) {
            }
        }
        else if(checkFront){
            try {
                OutputStream outputFile = new FileOutputStream(fileInput,true);
                outputString = "\nAli will move the box to the FRONT!!!";
                byte[] outputStringByte = outputString.getBytes();
                outputFile.write(outputStringByte);
            }catch(IOException e){}
        }
        else if(checkBack){
            try {
                OutputStream outputFile = new FileOutputStream(fileInput,true);
                outputString = "\nAli will move the box to the BACK!!!";
                byte[] outputStringByte = outputString.getBytes();
                outputFile.write(outputStringByte);
            }catch(IOException e){}
        }
        else{
            try {
                OutputStream outputFile = new FileOutputStream(fileInput,true);
                outputString = "\nAli will say \"UP\"!!!";
                byte[] outputStringByte = outputString.getBytes();
                outputFile.write(outputStringByte);
            }catch(IOException e){}
        }
    }
}
