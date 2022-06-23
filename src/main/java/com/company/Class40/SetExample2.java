package com.company.Class40;
// Take the String "a compulsory contribution to state revenue levied by the government on workers income and business profits or added to the cost of some goods services and transactions"
// Print all duplicate words from the String

import java.util.HashSet;
import java.util.Set;

public class SetExample2 {
    public static void main(String[] args) {

        String str1 = "a compulsory contribution to state revenue levied by the government on workers income and business profits or added to the cost of some goods services and transactions";

        String[] words = str1.split(" ");

        Set<String> str = new HashSet<>();

        for(String word : words){
            if(str.add(word)==false) // .add only adds
                    System.out.println(word);

                }
            }
        }

