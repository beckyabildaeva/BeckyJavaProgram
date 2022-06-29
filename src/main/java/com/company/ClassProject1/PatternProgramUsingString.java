package com.company.ClassProject1;

// Write a program to print below pattern

//        H       H
//        He     eH
//        Hel   leH
//        Hell lleH
//        HellolleH


public class PatternProgramUsingString {
    public static void main(String[] args) {
        printStringPattern("Hello");
    }

    public static void printStringPattern(String word) {
        //Write code here
        String str = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            str = str + word.charAt(i);
        }

        for (int i = 0; i < word.length(); i++) {
            String str2 = word.substring(0, i + 1);

            for (int j = 0; j < word.length() * 2 - (i + 1) * 2; j++) {
                str2 = str2 + " ";
            }
            str2 += str.substring(str.length()-(i+1));
            System.out.println(str2);
        }
    }
}
