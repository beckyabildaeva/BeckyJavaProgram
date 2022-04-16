package com.company.Class13;

import java.util.Scanner;
// string is immutable
// immutable means we cannot change value of string once we initialized it in the memory
// when you create a new string with the same name, it destroys the old one, overrides it with a new one.
// string pool
// object
public class StringExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = "Hello";// datatype variable = value
        // constant value stored into string variable in string pool

        String str2 = scanner.nextLine();
       // value "hello" from user using scanner class stored in heap memory

        String str3 = new String("Hello");
        // object of string stored into heap memory

        /*when we compare string with == it will just compare memory location of two String
        when we create 2 string variable with same constant valu, java will create 1 value
        in string pool memory, and both variable will point to the same memory location
        because it has same value. so comparingthat variables using == will give you true */

        // == compares address of string
        // .equals compares the content/value of string







    }
}
