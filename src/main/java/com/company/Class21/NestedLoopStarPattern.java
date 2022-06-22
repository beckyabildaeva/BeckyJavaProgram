package com.company.Class21;

public class NestedLoopStarPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int a = 1; a <= 9 - i; a++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int k = 9; k >=1; k--){
            for(int l=1; l<=9-k; l++){
                System.out.print(" ");
            }
            for (int m = 1; m <= k*2-1; m++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

