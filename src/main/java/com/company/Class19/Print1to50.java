package com.company.Class19;

public class Print1to50 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (isNumHasMoreThan5Div(i)) {
                System.out.println(i);
            }
        }
    }
        //Method Definition / Method Implementation
        //from static main method you can only call static method
        static boolean isNumHasMoreThan5Div(int num) {
            int count = 0;
            for (int i = 1; i <= 50; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count > 5) {
                return true;
            } else {
                return false;
            }
        }
    }
