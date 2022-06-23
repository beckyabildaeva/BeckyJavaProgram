package com.company.PracticeInterview;

import java.util.Scanner;

public class Prime1to50Method {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Enter a number");
            n = sc.nextInt();
        }while(n<=1);


        for(int i = 2; i<=n; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    static boolean isPrime(int n){
        // Prime is a number with exactly 2 factors/divisor (1 and itself)
        // If a number has more than 2 factors -> it is composite
        // Numbers 1 and 0 are special (neither prime, nor composite)

        int count = 0;
        for( int i = 1; i<=n; i++) {
            if (n % i == 0) {
                count++; // number of factors
            }
        }
        return count == 2;
    }
}
