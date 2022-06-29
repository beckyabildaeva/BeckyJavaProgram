package com.company.Class14;

// write a program to print each component of String into separate line
public class FindEachComponentOfAddress {
    public static void main(String[] args) {
        String address = "200 Highway West Suite-14 Houston Texas 77047";
        String[] words = address.split(" ");
        for (int i = 0; i < 7; i++) {
            System.out.println(words[i].trim());
        }
    }
}
