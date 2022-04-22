package com.company.Class17;

import java.util.Scanner;
// Method components
// method name - mandatory
// method parameter - optional
// method return type - mandatory (if we don't want to return anything we write void)
// method body - if void -> optional, if not void -> mandatory
public class MergeTwoWords {
    /* Merge two words with three characters one by one and print them
     * if words have more than three characters print Error message "Incorrect input! Cannot merge".
     * "ice", "sea"

     * output:
     * isceae
     * ex2:
     * "Hot", "Day"
     *
     * output:
     * HDoaty
     */
    public static void main(String[] args) {
        System.out.println("Enter 2 words (with 3 letters each)");
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        System.out.println(printMerge(word1, word2));
    }

    static String printMerge(String word1, String word2) {
        String merge = "";
        if(word1.length()>3 || word2.length()>3){
            System.out.println("Invalid Input");
        }else {
            for (int i = 0; i < word1.length(); i++) {
                merge = merge + word1.charAt(i) + word2.charAt(i);
            }
        }
        return merge;
    } // how to enter empty string into scanner
}

