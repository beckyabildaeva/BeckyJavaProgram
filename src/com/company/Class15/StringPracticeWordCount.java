package com.company.Class15;

import java.util.Scanner;

// write a program to take one statement from user
// find out number of words we have inside the string
public class StringPracticeWordCount {
    public static void main(String[] args) {
        System.out.println("Enter a statement");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] words = str.split(" ");
        System.out.println("The number of words is: " + words.length);
    }
}
