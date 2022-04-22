package com.company.Class16;

public class PrimeNum1to50 {
    public static void main(String[] args) {
        isPrime(50);
    }

    static void isPrime(int n) {

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int b = 2; b < i; b++)
                if (i % b == 0) {
                    isPrime = false;
                }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}

