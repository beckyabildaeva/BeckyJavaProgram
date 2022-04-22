package com.company.Class15;

import java.util.Scanner;
// StringBuffer is: thread-safe, synchronized, since java 1.0, slower
// StringBuilder is: not thread-safe, not synchronized, since java 1.5, faster

public class StringDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "Hello";
// String buffer uses the buffer mechanism to protect data from being
// accessed and updated simultaneously, so it's thread-safe

        // String buffer is good for multiple processes, but it's slow
        StringBuffer sBuffer = new StringBuffer("Hello");
        sBuffer.reverse();

        // String builder doesn't have buffer mechanism, so it's faster than StringBuffer
        StringBuilder sBuilder = new StringBuilder("Hello");
        sBuilder.reverse();
    }
}
