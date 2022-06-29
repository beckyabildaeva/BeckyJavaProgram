package com.company.Review;

import java.util.Scanner;

public class StringReview {
    public static void main(StringReview[] args) {
        // use trim

        String str1 = "     Hello! Welcome to Ebay      ";
        String str2 = "Hello! Welcome to Ebay";
        System.out.println(str1.trim());
        System.out.println(str1.trim().equals(str2));


        // use format
        String str3 = "Welcome to %s classes";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your fav programming - ");
        String pl = sc.nextLine();

        System.out.println("Enter your fav mentor - ");
        String mentor = sc.nextLine();

        System.out.println(String.format(str3, pl, mentor));

        // use split
        String str4 = "This is my statement to split";
        String[] words = str4.split(" ");

        for(String word : words){
            System.out.println(word);
        }

    }
}
