package com.company.Class13;

public class StringBuilderReverse {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("Hello world.");
        int count = 0;
        for(int i = 0; i < builder.length(); i++){
            builder.insert(count, builder.charAt(builder.length()-1)); // put last char at index 0
            builder.deleteCharAt(builder.length()-1); // deletes the last char
            count++;
        }
        System.out.println(builder);

    }

}
