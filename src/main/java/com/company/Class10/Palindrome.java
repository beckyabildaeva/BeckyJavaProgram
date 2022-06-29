package com.company.Class10;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String word, reversed = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word to find if it is a palindrome");
        word = scan.nextLine();
        int i = word.length();

        for (int j = i - 1; j >= 0; j--) {
            reversed = reversed + word.charAt(j);
        }
        if(word.equalsIgnoreCase(reversed)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is NOT a palindrome");
        }
    }
}





