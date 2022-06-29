package com.company.ClassProject1;

public class PatternProgramVolo {
    public static void main(String[] args) {


        String word = "Hello";
        String wordRev = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            wordRev = wordRev + word.charAt(i);
        }
        System.out.println(wordRev);
        String newWord = word.substring(0, word.length() - 1) + wordRev;
        System.out.println(newWord);
    }
}
