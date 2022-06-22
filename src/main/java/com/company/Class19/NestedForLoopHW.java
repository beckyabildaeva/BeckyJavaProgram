package com.company.Class19;

// print the following pattern
// 1
// 12
// 123
// 1234
// 12345
public class NestedForLoopHW {
    public static void main(String[] args) {
    pattern();
    }

    static void pattern() {

        for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print(a);
            }
            System.out.println();
        }
    }
}

