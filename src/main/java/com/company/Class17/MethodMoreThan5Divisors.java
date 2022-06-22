package com.company.Class17;

public class MethodMoreThan5Divisors {
    static boolean MoreThan5Div(int num) {
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

    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (MoreThan5Div(i)) {
                System.out.println(i);
            }
        }
    }
}
