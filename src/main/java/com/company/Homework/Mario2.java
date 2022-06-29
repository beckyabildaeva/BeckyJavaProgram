package com.company.Homework;

import java.util.Scanner;

public class Mario2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Height of the tower up to 8: ");
            n = sc.nextInt();
        } while (n<1);

        // print rows
        for(int i = 0; i<=n; i++) {
            // print spaces
            for(int j = 0; j<n-i; j++){
                System.out.print(" ");
            }
            // print left hashes
            for(int k = 0; k<i; k++){
                System.out.print('#');
            }
            // print gap (2 spaces)
            for(int l = 0; l<=2; l++){
                System.out.print(" ");
            }
            // print right hashes
            for(int m = 0; m < i; m++){
                System.out.print('#');
            }
            System.out.println();

        }
    }
}
