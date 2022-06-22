package com.company.Class16;

import java.util.Scanner;

public class PrimeMethodChirag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isPrime(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) { // divisors
                count++; // count how many factors
            }
        }
        if (count == 2) { // if exactly 2 factors, then prime
            return true;
        } else {
            return false;
        }
    }
}
