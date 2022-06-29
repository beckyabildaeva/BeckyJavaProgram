package com.company.Class15;
// HW1: Check if given # is Prime or not
// HW2:

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean isPrime = true;

        for (int i = 2; i <= num / 2; i++) {
            System.out.println(num + " is divisible by " + i);
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

            if (isPrime) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is a not prime number");
            }
        }
    }





