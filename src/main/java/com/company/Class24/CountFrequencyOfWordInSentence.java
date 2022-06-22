package com.company.Class24;

import java.util.Locale;
/*You can create another array of words you've visited
and each time you need to check new word is already available in array then skip*/

public class CountFrequencyOfWordInSentence {
    public static void main(String[] args) {
        String str = "This is java class and in this class we learn java programs";
        String words[] = str.toLowerCase().split(" ");


        for (int i = 0; i < words.length; i++) {
            int frequency = 0;

            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])){
                    frequency++;
                }
            }
            System.out.println(words[i] + ": " + frequency + " times");
        }
    }
}
