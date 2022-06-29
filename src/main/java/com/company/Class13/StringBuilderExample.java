package com.company.Class13;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        StringBuilder sb1 = new StringBuilder(455);
        sb.append("abc");
        sb.reverse();
        sb.delete(0,3); // first index inclusive, 2nd exclusive: will delete Hel
        sb.insert(1, "abc"); // number refers to index of the string, str refers to what needs to be inserted after the index

        //
        String b = sb.substring(3, 5);

        System.out.println(b);
        System.out.println(sb.capacity()); // // initial capacity is 16
        System.out.println(sb); // will have 1 object that is mutable/changeable

        String a = "Hello World";
        a = a + "abc";
        System.out.println(a); // will have 2 different string locations, because string is immutable
    }
}
