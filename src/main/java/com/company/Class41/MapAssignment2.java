package com.company.Class41;
// Create hashmap of number and its square, from 5 to 10
// Find sum of all values from hashMap
import java.util.*;
public class MapAssignment2 {
    public static void main(String[] args) {
        Map<Integer, Integer> square = new HashMap<Integer, Integer>();

        int sum = 0;
        for(int i = 5; i<=10; i++){
            int squareOfi = i*i;
            square.put(i, squareOfi);
            sum += squareOfi;
        }

        System.out.println(square);
        System.out.println(sum);
    }
}
