package com.company.Class10;

import java.util.Scanner;

public class Palindrome2 {
    public static void main(String[] args) {
        System.out.println("Enter a word to check if it is a palindrome");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String reversed = "";
        int length = word.length();

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }
        System.out.println(reversed);

        if (word.equalsIgnoreCase(reversed)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is a NOT a palindrome.");
        }
    }
}
