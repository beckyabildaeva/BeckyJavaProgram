package com.company.Homework;
// Find divisor of given number (Input - 6, output will be 1 2 3 6)

import java.util.Scanner;

public class FindDivisorOfGivenNumber {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i = 1; i <= num; i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
    }
}
