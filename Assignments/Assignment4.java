package com.Shehroze;

import java.util.Scanner;

public class Assignment4 {

    public static void main(String[] args) {
        Scanner userInput_ = new Scanner(System.in);
        var userInput = new UserInput();
        int row =0, column = 0;
        userInput.getInput();

        //Making a string matrix with value "pending" that will show kids who have not yet received chocolates
        String[][] sittingArrangement = new String[row][column];
        for (int i=0; i< row; i++){
            for (int j=0;j< column; j++){
                sittingArrangement[i][j] = "pending";
            }
        }

        boolean inputStatus;
        String temporaryInputStartKid;
        int rowPositionStart;
        int columnPositionStart;

        do { //Can only give chocolate box to 4 corners of the matrix
            System.out.print("Please enter the corner kid who will first receive the chocolate from Ali's mother: ");
            temporaryInputStartKid = userInput_.next();
            rowPositionStart = userInput.get_a(temporaryInputStartKid) - 1;
            columnPositionStart = userInput.get_b(temporaryInputStartKid) - 1;

            int r = rowPositionStart; //Only used for the if statement below
            int c = columnPositionStart; //Only used for the if statement below

            if((r == 0 && c == 0) || (r == 0 && c == (column-1)) || ((r == row-1) && c == 0) || ((r == row-1) && (c == column-1)))
                inputStatus = true;
            else{
                inputStatus = false;
                System.out.println("Only corner points are allowed. Please try again.");
            }

        }while(!inputStatus);


        System.out.print("Please enter where Ali is sitting: ");
        String temporaryInputAli = userInput_.next();
        int rowPosAli = userInput.get_a(temporaryInputAli)-1;
        int columnPosAli = userInput.get_b(temporaryInputAli)-1;
        sittingArrangement[rowPosAli][columnPosAli] = "ali_location"; // value of this location will change from "pending" to "ali_location"

        sittingArrangement[rowPositionStart][columnPositionStart] = "received"; //"received" shows first kid got the chocolate


        int row_ = rowPositionStart;
        int column_ = columnPositionStart;


        while(true){


            boolean checkRight = checkRightPosition(sittingArrangement,row,column,column);
            boolean checkLeft = checkLeftPosition(sittingArrangement,row,column);
            boolean checkFront = checkFrontPosition(sittingArrangement,row,column);
            boolean checkBack = checkBackPosition(sittingArrangement,row,column,row);


            if (checkRight) {
                column = column + 1; //Moving the chocolate box to the right
                if (sittingArrangement[row][column].equals("ali_location")){ //Will recheck available positions when ali gets the chocolates

                    checkRight = checkRightPosition(sittingArrangement,row,column,column);
                    checkLeft = checkLeftPosition(sittingArrangement,row,column);
                    checkFront = checkFrontPosition(sittingArrangement,row,column);
                    checkBack = checkBackPosition(sittingArrangement,row,column,row);

                    aliBehaviour(checkRight,checkLeft,checkFront,checkBack);
                    break;
                }
                else
                    sittingArrangement[row][column] = "received";
            }

            else if (checkLeft) {
                column = column - 1; //Moving the chocolate box to the left
                if (sittingArrangement[row][column].equals("ali_location")){

                    checkRight = checkRightPosition(sittingArrangement,row,column,column);
                    checkLeft = checkLeftPosition(sittingArrangement,row,column);
                    checkFront = checkFrontPosition(sittingArrangement,row,column);
                    checkBack = checkBackPosition(sittingArrangement,row,column,row);

                    aliBehaviour(checkRight,checkLeft,checkFront,checkBack);
                    break;
                }
                else
                    sittingArrangement[row][column] = "received";
            }

            else if (checkFront){
                row = row - 1; //Moving the chocolate box to the the front
                if (sittingArrangement[row][column].equals("ali_location")){

                    checkRight = checkRightPosition(sittingArrangement,row,column,column);
                    checkLeft = checkLeftPosition(sittingArrangement,row,column);
                    checkFront = checkFrontPosition(sittingArrangement,row,column);
                    checkBack = checkBackPosition(sittingArrangement,row,column,row);

                    aliBehaviour(checkRight,checkLeft,checkFront,checkBack);
                    break;
                }
                else
                    sittingArrangement[row][column] = "received";
            }

            else if (checkBack) {
                row = row + 1; //Moving the chocolate box to the the back
                if (sittingArrangement[row][column].equals("ali_location")){

                    checkRight = checkRightPosition(sittingArrangement,row,column,column);
                    checkLeft = checkLeftPosition(sittingArrangement,row,column);
                    checkFront = checkFrontPosition(sittingArrangement,row,column);
                    checkBack = checkBackPosition(sittingArrangement,row,column,row);

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
        return Integer.parseInt(_a);

    }

    public static int get_b(String tempString){ // will return y from x,y
        int indexVal = tempString.indexOf(",");
        String _b = (tempString.substring(indexVal+1));
        return Integer.parseInt(_b);

    }

    public static void aliBehaviour(boolean checkRight, boolean checkLeft, boolean checkFront, boolean checkBack){ // will show what happens when chocolate box reaches ali
        if(checkRight)
            System.out.println("Ali will move the box to the RIGHT!!!");
        else if(checkLeft)
            System.out.println("Ali will move the box to the LEFT!!!");
        else if(checkFront)
            System.out.println("Ali will move the box to the FRONT!!!");
        else if(checkBack)
            System.out.println("Ali will move the box to the BACK!!!");
        else
            System.out.println("Ali will say \"UP\"!!!");
    }
}
