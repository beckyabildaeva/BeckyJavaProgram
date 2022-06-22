package com.company.Class16;

public class My2ndMethod {
    public static boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (isEven(i)) {
                System.out.println(i + " even");
            } else {
                System.out.println(i + " not even");
            }
        }
    }
}
