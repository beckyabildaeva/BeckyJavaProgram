package com.company.Class40;
// Take the String "a compulsory contribution to state revenue levied by the government on workers income and business profits or added to the cost of some goods services and transactions"
// Print all duplicate words from the String

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetExample1 {
    public static void main(String[] args) {
        Set<String> str = new HashSet<>();
        String str1 = "a compulsory contribution to state revenue levied by the government on workers income and business profits or added to the cost of some goods services and transactions";

        String[] words = str1.split(" ");

        for(int i = 0; i<words.length; i++){
            for(int j = i+1; j<words.length; j++){
                if(words[i].equals(words[j])){
                    System.out.println(words[i]);
                    break;
                }
            }
        }
    }
}
