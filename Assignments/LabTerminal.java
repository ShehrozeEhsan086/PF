package com.Shehroze;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class LabTerminal {
    public static void main(String[] args) {


        Scanner userInput = new Scanner(System.in);
        System.out.print("Number the shortlisted restaurants, N: ");
        int n = userInput.nextInt();


        String[][] input = new String[n + 1][2];
        System.out.println("Please enter the TH ranks.");


        userInput.nextLine();


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 1; j++) {
                input[i][j] = userInput.nextLine();
            }
        }


        String[] islamabad = new String[n]; //Will be used when numbers associated with islamabad are filtered.
        String[] rawalpindi = new String[n]; //Will be used when numbers associated with rawalpindi are filtered.


        getShortListedRestaurants(input, n);
        getIslamabadRestaurants(islamabad, n);
        getRawalpindiRestaurants(rawalpindi, n);


        int islCount = 0;
        for (int k = 0; k < n; k++) {  //counts the number of entries in the array that are not null.
            if (islamabad[k] != null)
                islCount++;
        }


        int rwpCount = 0;
        for (int k = 0; k < n; k++) {
            if (rawalpindi[k] != null)
                rwpCount++;
        }


        int[] islamabadArray = new int[islCount]; //Creates new integer array with the length equal to the number of entries.
        int[] rawalpindiArray = new int[rwpCount];


        int isl = 0;
        for (int k = 0; k < n; k++) { //gives the integer converted values to new array.
            if (islamabad[k] != null) {
                islamabadArray[isl] = Integer.parseInt(islamabad[isl]);
                isl++;
            }
        }


        int r = 0;
        for (int k = 0; k < n; k++) {
            if (rawalpindi[k] != null) {
                rawalpindiArray[r] = Integer.parseInt(rawalpindi[k]);
                r++;
            }
        }


        int[] sortedIslamabad = dosSort(islamabadArray); //sorting elements in the array.
        int[] sortedRawalpindi = dosSort(rawalpindiArray);


        int[] finalList = new int[sortedIslamabad.length + sortedRawalpindi.length]; //combining arrays to a final array.
        System.arraycopy(sortedIslamabad, 0 ,finalList,0,sortedIslamabad.length);
        System.arraycopy(sortedRawalpindi, 0 ,finalList,sortedIslamabad.length,sortedRawalpindi.length);


        getFinalList(); // calling this function to read from file and print on console.


        try { // Writing final list to file.
            PrintWriter toFile = new PrintWriter(new File("finalist.txt"));
            for(int i = 0; i < finalList.length; i++){
                    toFile.write(finalList[i]+" ");
                }
            toFile.close();
        }catch (FileNotFoundException e){}
    }


    public static void getShortListedRestaurants(String[][] input, int n){
        try { // Writing initial data to file.
            PrintWriter toFile = new PrintWriter(new File("shortlistedRestaurants.txt"));
            for(int i = 0; i < n; i++){
                for(int j = 0;j < 1; j++){
                    toFile.write(input[i][j]);
                    toFile.println();
                }
            }
            toFile.close();
        }catch (FileNotFoundException e){}
    }


    public static void getIslamabadRestaurants(String[] islamabad, int n){
        try{
            Scanner readInput = new Scanner(new File("shortlistedRestaurants.txt"));
            int i = 0, j=0;
            while(readInput.hasNext()) {
                String line = readInput.nextLine();
                if(get_a(line).equals("I")){ //calling function that return the first part of the string. i.e. for "I 3", "I" will be returned.
                    islamabad[j] = get_b(line); // returns the second part i.e. for "I 3", "3" will be returned.
                    j++; // incrementing islamabad array.
                }
            }
        }catch (FileNotFoundException e){}
    }


    public static void getRawalpindiRestaurants(String[] rawalpindi, int n){
        try{
            Scanner readInput = new Scanner(new File("shortlistedRestaurants.txt"));
            int i = 0, j=0;
            while(readInput.hasNext()) {
                String line = readInput.nextLine();
                if(get_a(line).equals("R")){
                    rawalpindi[j] = get_b(line);
                    j++;
                }
            }
        }catch (FileNotFoundException e){}
    }


    public static int[] dosSort(int[] array) { //Insertion sort.
        int size = array.length;
        for (int step = 1; step < size; step++) {
            int key = array[step];
            int j = step - 1;
            while (j >= 0 && key > array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = key;
        }
        return array;
    }


    public static void getFinalList(){ // Reads from file and shows output on console.
        try{
            Scanner readInput = new Scanner(new File("finalist.txt"));
            System.out.println("The final list is:");
            while (readInput.hasNext()){
                String outputFile = readInput.nextLine();
                System.out.println(outputFile);
            }
        }catch (FileNotFoundException e){}
    }


    public static String get_a(String tempString){ // will return "I" from "I 3"
        int indexVal = tempString.indexOf(" ");
        String _a = (tempString.substring(0,indexVal));
        return _a;
    }


    public static String get_b(String tempString){ // will return "3" form "I 3"
        int indexVal = tempString.indexOf(" ");
        String _b = (tempString.substring(indexVal+1));
        return _b;
    }
}

