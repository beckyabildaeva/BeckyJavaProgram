package com.company.PracticeInterview;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // to reverse i need the last character of the word, then the second from last, etc
        reverseAString("java");

    }

    public static void reverseAString(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);

        if (str.equals(rev)) {
            System.out.println(str + " is Palindrome");
        } else {
            System.out.println(str + " is not a Palindrome");
        }
    }
}