package com.company.PracticeInterview;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a whole number and hit enter to find if it is prime or not: ");
        int num = sc.nextInt();
        isPrime(num);
    }
    static void isPrime(int num){
        // prime nums have exactly 2 factors
        // composite nums have more than 2 factors

        int counter = 0;

        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                counter++;
            }
        }

        if(counter == 2){
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is not Prime");
        }
    }
}
