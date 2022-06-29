package com.company.Class19;

public class PrintPatternSquare {


    public static void main(String[] args) {
        // print N numbers of rows
        for(int a = 1; a<=3; a++){
            //print 1 to N in same line
            for(int b = 1; b<=5; b++){
                System.out.print("*");
            }
            System.out.println();
            for(int c = 1; c<=5; c++){
                System.out.print("&");
            }
            // print enter
            System.out.println();

        }
    }
}
