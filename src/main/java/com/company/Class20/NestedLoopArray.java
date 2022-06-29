package com.company.Class20;
// if ++ then <=
// if -- then >=
public class NestedLoopArray {
    public static void main(String[] args) {

        for (int a = 5; a <= 9; a++) { // row
            for (int b = 9; b >= a; b--) {  // line
                System.out.print(b);
            }
            System.out.println();
        }
    }
}

