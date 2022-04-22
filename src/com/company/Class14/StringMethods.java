package com.company.Class14;
// String is non primitive data type in Java which represents an array of characters.
// It is immutable, meaning it cannot be changed, unless a new string is created and the old one with the same name gets destroyed by Java.

// there is string literal and string object.
// string literal is stored in a string pool.
// string object is stored in a heap memory.
// if you create two string variables with the same name, they are stored as one in same location in a String Pool.
// however if you create a new object of the string with the same name, then it stores both separately in heap memory.
import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "hello World";
        String str3 = "Hello World! Welcome to DevX!";
        // 1. Check equality of 2 strings - case-sensitive
        System.out.println("1. Equality: " +str1.equals(str2));
        System.out.println("===========================================");

        // 2. Check equality of 2 strings ignoring the case
        System.out.println("2. Equality ignoring case: " +str1.equalsIgnoreCase(str2));
        System.out.println("===========================================");

        // 3. Check if one string contains another string
        System.out.println("3. Contains: " +str1.contains(str3)); // false
        System.out.println("3.0 Contains: " +str3.contains(str1)); // true

        // check contains ignoring case
        String str3LowerCase = str3.toLowerCase();
        String str2LowerCase = str2.toLowerCase();
        System.out.println("3.1 Contains: " +str3LowerCase.contains(str2LowerCase));
        // or
        System.out.println("3.1 Contains: " +str3.toLowerCase().contains(str2.toLowerCase()));
        System.out.println("===========================================");

        // 4. Changing the case of String
        System.out.println("4. Upper Case: " +str3.toUpperCase());
        System.out.println("4. Lower Case: " +str3.toLowerCase());
        System.out.println("===========================================");

        // 5. Find index of character
        System.out.println("5. Index of Char: " +str1.indexOf('W')); // starts with 0 -> 6
        System.out.println("5. Last Index of Char: " +str3.lastIndexOf('W')); // 13
        System.out.println("===========================================");

        // 6. Find character at index
        System.out.println("6. Char at Index: " +str1.charAt(0)); // H
        System.out.println("===========================================");

        // 7. Find length of String
        System.out.println("7. Length of String: " +str1.length()); // starts with 1, 2, 3, etc. and prints how many chars are in a string
        System.out.println("7. Length of String: " +str3.length());// prints length. starts with 1, 2, 3....
        // index starts with 0, length starts with 1
        System.out.println("===========================================");

        // 8. Empty string or not
        str1="                ";
        str3="";
        System.out.println("8. Empty: " +str1.isEmpty()); // false
        System.out.println("8. Empty: " +str3.isEmpty()); // true
        // System.out.println("8. Blank " +str1.isBlank()); true
        // System.out.println("8. Blank: " +str3.isEmpty()); true
        System.out.println("===========================================");

        // 9. Replace & ReplaceAll
        str1 = "Welcome User";
        str3 = "Devx";
        System.out.println("9. Replace: " +str1.replace( "User",str3)); // Welcome Devx
        System.out.println("9.1 Replace: " + str1.replace("User", "Devx")); // Welcome Devx

        // 9.1 Replace & ReplaceAll with regular expression
        // Regex works like a filter
        str1 = "INR 200 INR 300 INR 500";
        System.out.println("9.1 Replace Regex: " +str1.replace("INR", "USD"));
        System.out.println("9.1 Replace Regex: " +str1.replaceAll("[a-zA-Z]", ""));
        System.out.println("===========================================");

        // 10. Format
        str1 = "Welcome %s! Welcome to %s!";
        System.out.println("10. Format: " +String.format(str1,"Becky", "Ebay"));
        System.out.println("===========================================");

        // 11. Substring
        // substring has startIndex and endIndex
        // startIndex is inclusive, endIndex is exclusive
        String s1="javatpoint";
        System.out.println("11. Substring: " +s1.substring(2,5));//returns vat
        System.out.println("11. Substring: " +s1.substring(2));//returns vatpoint

        String substr = s1.substring(0); // Starts with 0 and goes to end -> javatpoint
        System.out.println( "11. Substring: "+substr);
        String substr2 = s1.substring(5,10); // Starts from 5 and goes to 10  -> point
        System.out.println("11. Substring: " +substr2);
        // String substr3 = s1.substring(5,15); // Returns Exception/Error

        // 11.1 Substring is a sequence of characters within a string

        str1 = "Welcome to Java Class. Today is fun day";
        System.out.println("11.1 Substring: " +str1.substring(7));
        System.out.println("11.1 Substring: " +str1.substring(0,7));
        System.out.println("===========================================");


        // 12. Split
        // Split() method in string splits the string into parts
        // regex – a delimiting regular expression
        // Limit – the resulting threshold
        String str = "geekss@for@geekss";
        String[] arrOfStr = str.split("@", 2);

        for (String a : arrOfStr)
            System.out.println("12. Split: " +a); // geeks  for@geekss

        String str5 = "geekss@for@geekss";
        String[] arrOfStr5 = str.split("@", 5);

        for (String a : arrOfStr)
            System.out.println("12. Split: " +a);

        // 12.1 Split continued
        str1 = "Good Morning 5th Grade Math";
        String[] words = str1.split(" ");
        System.out.println("12.1 Split: " +words[0]);
        System.out.println("12.1 Split: " +words[1]);
        System.out.println("12.1 Split: " +words[2]);
        System.out.println("12.1 Split: " +words[3]);
        System.out.println("12.1 Split: " +words[4]);

        // 12.2 Split with For Loop
        for(int i = 0; i <= 4; i++) {
            System.out.println("12.2 Split Loop: " +words[i]);
        }
        // 12.3 Split Length
        System.out.println("12.3 Split Length: " + words.length);
        for(int i = 0; i<words.length; i++) {
            System.out.println("12.3 Split Length: " +words[i]);
        }
        System.out.println("===========================================");

    }
}
