package com.company.Class41;

import java.util.*;
import java.util.Map.Entry;

// Create hashmap of any data
// Perform all operations we did in class

public class MapAssignment {
    public static void main(String[] args) {
        Map<String, String> countryLanguage = new HashMap<>();
        countryLanguage.put("USA", "English");
        countryLanguage.put("Russia", "Russian");
        countryLanguage.put("France", "French");
        countryLanguage.put("Brazil", "Portuguese");

        System.out.println("=====Print Key & Value=====");
        System.out.println(countryLanguage);

        System.out.println("=====Get Value of Given Key=====");
        System.out.println(countryLanguage.get("France"));

        System.out.println("=====Find Size of Map=====");
        System.out.println(countryLanguage.size());

        System.out.println("=====Check if Value Has a Key=====");
        System.out.println(countryLanguage.containsKey("Brazil")); // true
        System.out.println(countryLanguage.containsKey("Spain")); // false

        System.out.println("=====Print Only Values of Map=====");
        Collection<String> values =  countryLanguage.values();
        for(String value : values){
            System.out.println(value);
        }

        System.out.println("=====Print Key & Values w/keySet=====");
        Set<String> keyValue = countryLanguage.keySet();
        for(String keyValues : keyValue) {
            System.out.println(keyValues + " = " + countryLanguage.get(keyValues));
        }

        System.out.println("=====Print Key & Values w/entrySet=====");
        Set<Entry<String, String>> pair = countryLanguage.entrySet();
        for(Entry<String, String> pairs: pair){
            System.out.println(pairs);
        }
    }
}
