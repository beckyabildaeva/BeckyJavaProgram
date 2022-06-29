package com.company.Class10;

public class SwapVariable {
    public static void main(String[] args) {
        int a = 10, b=20, c=0;
        c=a;
        a=b;
        b=c;

        System.out.println(a); //20
        System.out.println(b); //10

        //or without using a 3rd variable

        a=a+b;
        b=a-b;
        a=a-b;

        // or using * or /

        a=a*b;
        b=b/a;
        b=b/a;
    }
}
