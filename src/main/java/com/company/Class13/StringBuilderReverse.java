package com.company.Class13;

public class StringBuilderReverse {
    public static void main(String[] args) {
        // StringBuilder builder1 = new StringBuilder("abc")
        // builder.append("abc");
        // builder.reverse(

        StringBuilder builder = new StringBuilder("Hello world.");
        int count = 0;
        for(int i = 0; i < builder.length(); i++){
            builder.insert(count, builder.charAt(builder.length()-1));
            builder.deleteCharAt(builder.length()-1);
            count++;
        }
        System.out.println(builder);

    }

}
