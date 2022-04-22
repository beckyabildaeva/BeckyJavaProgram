package com.company.Class15;
 // write a program to take 1 String from user
// print occurence of given character in String
public class FindOccurenceOfChar {
    public static void main(String[] args) {
        String str = "This is my java program!";
        char c = 'a';
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c) {
                count++;
            }
        }
        System.out.println(count);
    }
}
