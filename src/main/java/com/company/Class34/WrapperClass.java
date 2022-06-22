package com.company.Class34;

public class WrapperClass { // is used to convert 1 data type to another
    public static void main(String[] args) {
        int i = 10; // variable
        Integer j = 20; // Auto Boxing // object -> you can use methods with object


        int k = j; // Auto Unboxing

        String s1 = "10", s2 = "20";

        // Convert String to Int
        System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2));

        // Convert Int to String
        System.out.println(String.valueOf(j) + i);

        // Convert Int to String
        System.out.println(j.toString() + i);
    }
}
