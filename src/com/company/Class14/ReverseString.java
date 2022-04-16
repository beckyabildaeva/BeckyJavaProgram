package com.company.Class14;

import java.util.Scanner;

// print reverse of given string
public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter any string");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String reversed = "";
        int i = str.length();

        for (int j = i - 1; j >= 0; j--) {
            reversed += str.charAt(j);
        }
        System.out.println(reversed);
    }

}
