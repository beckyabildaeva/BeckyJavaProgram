package com.company.ClassProject1;

//Write a program to print below pattern

//        1 2 3 4 5
//        2 3 4 5 6
//        3 4 5 6 7
//        4 5 6 7 8
//        5 6 7 8 9


public class PatternProgram1 {
    public static void main(String[] args) {
        printPatternUpToTenNumbersExlusevely();
    }

    public static void printPatternUpToTenNumbersExlusevely() {
        //Write code here
        //print 5 rows
        for(int i = 1; i<=5; i++){
            // print columns 1-5, 2-6, 3-7, 4-8, 5-9
            for(int j = i; j < 5+i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
