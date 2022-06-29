package com.company.Class17;

import java.util.Scanner;

// write a program to check given String is a palindrome or not
public class MethodCheckPalindrome {
    public static void main(String[] args) {
        System.out.println("Enter a word to check if it is a palindrome");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

            if(isPalindrome(word)){
            System.out.println("Palindrome");
        } else {
                System.out.println("Not a Palindrome");
            }

    }

    static boolean isPalindrome(String word) {
        String reversed = "";
        boolean isPalindrome = true;
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        if (word.equalsIgnoreCase(reversed)) {
            return true;
        } else {
            return false;
        }

    }

}
