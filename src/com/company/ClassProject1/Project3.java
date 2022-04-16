package com.company.ClassProject1;

import java.util.Scanner;

/**
//         * Take two words from the user, concatenate  words
//         that have three characters one by one and print them
//         * if any of the words has more than three characters
//         print Error message "Incorrect input! Cannot merge".
//         *
//         * ex
//         * "ice", "sea"

import java.util.Scanner;

//         * output:
//         * isceae
//         *
//         * ex2:
//         * "Hot", "Day"
//         *
//         * output:
//         * HDoaty
//         *
//         * ex3:
//         * "Hello", "Day"
//         * output:
//         * Incorrect input! Cannot merge
//         */
public class Project3 {
    public static void main(String[] args) {
        System.out.println("Enter two words");
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();
        // length of word1 = 3
        String result = "";
        if(word1.length()==3 && word2.length()==3) {
            for (int i = 0; i < 3; i++) {
                result = result + word1.charAt(i) + word2.charAt(i);
            }
            
            System.out.println(result);
        }else if (word1.length() > 3 || word2.length()>3) {
            System.out.println("Incorrect input! Cannot merge.");
        }
    }
}
