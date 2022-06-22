package com.company.Class21;

public class Pattern1NestedForLoop {
    public static void main(String[] args) {
        // print 5 rows
        for(int i = 1; i <= 10; i++){
            //print spaces before the digits
            for(int b = 1; b<=10-i; b++){
                System.out.print(" ");
            }
            //print 1st set of digits in each line
            for(int c = 1; c<=i; c++){
                System.out.print(c);
            }
            //print 2nd set of reversed digits in each line
            for(int d = i - 1; d>=1; d--){
                System.out.print(d);
            }
            System.out.println();
        }
    }
}
