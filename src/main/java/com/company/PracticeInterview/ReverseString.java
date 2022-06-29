package com.company.PracticeInterview;

public class ReverseString {
    public static void main(String[] args) {
        // to reverse i need the last character of the word, then the second from last, etc
        reverseAString("MacBook Pro");

        StringBuilder sb = new StringBuilder();
        reverseAStringBuilder(new StringBuilder("MacBook Air"));

    }

    public static void reverseAStringBuilder(StringBuilder sb){

        for (int i = 0; i < sb.length(); i++){
            sb.insert(i, sb.charAt(sb.length()-1)); // replace 1st char (0) with the last char (sb.length()-1)
            sb.deleteCharAt(sb.length()-1); // delete the last char of string
            // count++; // don't need it, if instead of 'count' just use 'i' in insert function
        }
        System.out.println(sb);
    }

    public static void reverseAString(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }
}