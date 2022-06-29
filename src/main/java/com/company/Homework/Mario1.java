package com.company.Homework;

import java.util.Scanner;

public class Mario1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do
        {
            System.out.println("Enter Positive Number: ");
            n = sc.nextInt();
        }
        // while condition to check if the user entered a positive num
        // if not go back to line 9
        while (n < 1);

        for(int i = 0; i<=n; i++){ // prints n rows
            for (int k = 0; k < n-i; k++){ // print spaces
                System.out.print(".");
            }

            for(int j = 0; j < i ; j++){ // prints # in the row backwards 1 - 5
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
