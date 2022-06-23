package com.company.Class41;
import java.util.*;
public class FindFrequencyOfWord {
    public static void main(String[] args) {
        String str = "The Times of India is an Indian English language daily newspaper and digital news media owned and managed by The Times Group. It is the third largest newspaper in India by circulation and largest selling English language daily in the world";

        // The - 2
        // Times - 2

        String[] words = str.split(" ");

        Map<String, Integer> frequency = new HashMap<String, Integer>();
        // key is the word
        // value is the count
        for(String word :  words){
            // if the word repeats
            if(frequency.containsKey(word)){ // checks if map has a Key of the word
                // increment the word count by 1
                int count = frequency.get(word); // .get gives value, which is Integer
                frequency.put(word, count + 1);
            } else {
                frequency.put(word, 1); // if the word does not repeat, then just count it as 1
            }
        }
        System.out.println(frequency);

    }
}
