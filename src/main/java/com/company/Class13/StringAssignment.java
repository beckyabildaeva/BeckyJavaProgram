package com.company.Class13;

import java.util.Scanner;

// create 3 string variables,
// initialize 2 variables with constant value
// take third variable value from user using scanner
// compare 1st and 2nd using ==
// compare 2nd and 3rd using ==
// compare 1st and 3rd using .equals method
public class StringAssignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = "Vegetable";
        String str2 = "Vegetable";
        String str3 = scanner.nextLine();

        if (str1 == str2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if (str2 == str3) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if (str1.equals(str3)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}


