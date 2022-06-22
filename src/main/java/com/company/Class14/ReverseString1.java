package com.company.Class14;

import java.util.Scanner;

//Write a program to take one String from user and print reverse of it
public class ReverseString1 {
    public static void main(String[] args) {
        System.out.println("Enter a word");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String reverse = "";
        for(int i = str.length()-1; i >= 0; i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.println("Reversed word is " + reverse);
    }

}
