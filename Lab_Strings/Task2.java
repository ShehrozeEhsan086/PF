package com.Shehroze;

public class Task2 {
    public static void  main(String[] args){
        String str_obj = new String("Pakistan is my homeland.I Love my country.");
        System.out.println("(a)");
        String[] token = str_obj.split("[.]");
        System.out.println("First Token: "+token[0]);
        System.out.println("Second Token: "+token[1]);

        System.out.println("(b)");
        String[] token_1 = token[0].split("[ ]");
        System.out.println("First token: "+token_1[0]);
        System.out.println("First token: "+token_1[1]);
        System.out.println("First token: "+token_1[2]);
        System.out.println("First token: "+token_1[3]);

        System.out.println("(c)");
        String[] token_2 = token[1].split("[ ]");
        System.out.println("First token: "+token_2[0]);
        System.out.println("First token: "+token_2[1]);
        System.out.println("First token: "+token_2[2]);
        System.out.println("First token: "+token_2[3]);
    }
}
