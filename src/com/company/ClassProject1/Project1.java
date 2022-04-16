package com.company.ClassProject1;
/* Take two words from from the user and concatenate two words together
 * however if the concatenation creates a  double char, then omit one of the characters. Save the result of concatenation and print it out.
 * ex:
 * "abc" "cat" -> "abcat"
 *
 * ex2:
 * abc", "xyz" -> "abcxyz"
 *
 * ex3:
 * "happy", "yolk" -> happyolk
 */

import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two words");
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();
        String combined = "";
        if (word1.charAt(word1.length() - 1) == word2.charAt(0)) {
            combined = word1.concat(word2.substring(1));
        } else {
            combined = word1.concat(word2);
        }
        System.out.println(combined);
    }
}
