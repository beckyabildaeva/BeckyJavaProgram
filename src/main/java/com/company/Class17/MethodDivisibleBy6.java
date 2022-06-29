package com.company.Class17;

//Write a program to print all even numbers which are divisible by 6 from 1 to 50
public class MethodDivisibleBy6 {

    static boolean isDivisibleBy6(int num) {
        if (num % 6 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (isDivisibleBy6(i)) {
                System.out.println(i + " is Divisible by 6");
            }
        }
    }
}