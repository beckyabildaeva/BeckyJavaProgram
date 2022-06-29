package com.company.Class29;

import java.util.Scanner;

public class ExampleToUnderstandStatic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int c = a; // temporarily save a value
        a = b; // reassign a value to b
        b = c; // reassign b value to temporary a value

        System.out.println(a); // value of b
        System.out.println(b); // value of a
    }
}
