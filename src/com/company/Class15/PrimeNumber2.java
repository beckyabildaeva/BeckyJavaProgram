package com.company.Class15;

import java.util.Scanner;

public class PrimeNumber2 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;

        for(int i =1; i <= num; i ++){
            if (num% i == 0) { // divisors
                count++; // count how many factors
            }
        }
        if (count==2){ // if exactly 2 factors, then prime
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
