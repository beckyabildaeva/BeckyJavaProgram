package com.company.Class17;

import java.util.Scanner;

public class CheckReverse {
    public static void main(String[] args) {
        // Take string form user
        System.out.println("Enter string to see its reverse");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // Find reverse of given string
        String rev = getReverse(str);

        //Compare Rev with original String to check if palindrome
        if (str.equals(rev)) {
            System.out.println("It's Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    //This method will find reverse of given String

    static String getReverse(String str){
        String rev = "";

        for(int i = str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        return rev;
    }
}
