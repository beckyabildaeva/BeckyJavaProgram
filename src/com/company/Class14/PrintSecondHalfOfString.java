package com.company.Class14;

import java.util.Scanner;

// print exactly second half of the string
public class PrintSecondHalfOfString {
    public static void main(String[] args) {
        System.out.println("Enter any String: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.length() % 2 == 0) {
            System.out.println(str.substring(str.length() / 2));
        } else {
            System.out.println(str.substring(str.length() / 2 + 1));
        }
    }
}
