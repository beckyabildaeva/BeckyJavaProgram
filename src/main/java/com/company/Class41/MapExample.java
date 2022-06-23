package com.company.Class41;

import java.util.*;
import java.util.Map.Entry;
// key - value
// key cannot be duplicate
// value can be duplicate

public class MapExample {
    public static void main(String[] args) {
        Map<String, String> countryCurrencyData = new HashMap<String, String>();
        countryCurrencyData.put("USA", "USD");
        countryCurrencyData.put("India", "INR");
        countryCurrencyData.put("Dubai", "Dirham");
        countryCurrencyData.put("Qatar", "Rial");
        countryCurrencyData.put("UK", "pound");
        countryCurrencyData.put("Turkey", "Lira");
        countryCurrencyData.put("Australia", "USD");

        // Print Map
        System.out.println(countryCurrencyData);

        // Get value from key
        System.out.println(countryCurrencyData.get("UK"));

        // Find size of Map
        System.out.println(countryCurrencyData.size());

        // Check if there is a key provided  -> answers true or false
        // it is case sensitive
        System.out.println(countryCurrencyData.containsKey("Japan"));
        System.out.println(countryCurrencyData.containsKey("india"));

        // Traverse the HashMap - how to iterate through maps
        // 1) Print all VALUES of hashmap
        Collection<String> values = countryCurrencyData.values();
        for(String str : values){
            System.out.println(str);
        }
        // 2) Print all KEY-VALUE pair of hashmap using keySet
        System.out.println("========All Keys===========");
        Set<String> keys = countryCurrencyData.keySet();
        for (String key: keys){
            System.out.println(key+ " = " +countryCurrencyData.get(key));
        }
        // 3) Print all KEY-VALUE pair of hashmap using entrySet
        System.out.println("=========All Key Value===========");
        // entry will store set of pairs, it is data type, Entry<K,V> will store generic objects of any type

        Set<Entry<String, String>> pairs = countryCurrencyData.entrySet();
        for(Entry<String, String> pair: pairs){
            System.out.println(pair.getKey() + " = " + pair.getValue());
        }


        // erase data from map
        System.out.println("========Erase All Data=========");
        countryCurrencyData.clear();
        System.out.println(countryCurrencyData);

    }
}
