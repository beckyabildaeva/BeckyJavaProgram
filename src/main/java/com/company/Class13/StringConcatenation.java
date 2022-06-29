package com.company.Class13;

public class StringConcatenation {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Devx";
        int a = 10;
        int b = 20;
        int c = 5;
        System.out.println("Addition"+ a + b); // Addition1020
        System.out.println("Addition" + a + b + c); // Addition10205
        System.out.println("Add" + a + b * c); // Add10100
        System.out.println(a + b + "Add"); // 30Add
        System.out.println(a + b + "Add" + a + b); // 30Add1020
        System.out.println(a + "Add" + (b-c)); // () have higher priority, so 10Add15
        // System.out.println(a + "Add" + b - c); minus cannot be used with String

        // string + i = StringInteger
        // string + string = StringString
        // i + string = integerString
        // i + i = sum of i
        // string + i + i * i = stringi2i
    }
}
