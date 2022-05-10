package com.company.Class21;

//============== Homework =======================
//Write a program to find maximum digit from the given number (Example input - 4346345, Ouput - 6)
//Write a program to Count Number of Digit (Example input - 4345, Output - 4)
//Write a program to Reverse number (Example input - 4345, Output - 5434)
//Write a program to Check Given number is Palindrome or not (Example input - 23532, Ouput - Yes)
public class PatternHW {
    public static void main(String[] args) {
        maximumDigit(4346345);
        countDigits(4345);
        reverseNumber();
        numberPalindrome();
    }

    static void maximumDigit(int num) {
        int max = 0;
        while (num > 0) {
            // need if condition to check for max value
            num = num / 10;
        }
        System.out.println("Maximum Digit is: " + max);
    }

    static void countDigits(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println("Count of Digits is: " + count);
    }

    static void reverseNumber() {

    }

    static void numberPalindrome() {

    }
}
