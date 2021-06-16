package com.Shehroze;

public class Task9 {
    public static void main(String[] args) {
        String text = "hello$world! This is <Pak123istan>.";
        String textReplaced = text.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(textReplaced);
    }
}
