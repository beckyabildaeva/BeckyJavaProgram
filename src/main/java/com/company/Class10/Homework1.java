package com.company.Class10;

public class Homework1 {
    public static void main(String[] args) {
        int i = 4, j = 4, k = 4;
        int m = i++ + j-- + --k; // m=4+4+3=9 k=3
        System.out.println(i); //5
        System.out.println(j); //3
        System.out.println(k); //3
        System.out.println(m); //11
    }
}
