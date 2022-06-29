package com.company.PracticeInterview;

public class WhileVsForLoop {
    // Where is the difference between while and for loop

    public static void main(String[] args) {
        // While loops runs until condition is no longer true
        int i = 5;
        while (i < 1) {
            i++;
        }

        int n = 10000000;
        while (n != 0) {
            n /= 10;
            System.out.println(n);
        }

        System.out.println("----------------------------");
        // For loop runs for predetermined amount of iterations
        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }

        // Do while loop
        boolean myBoolean = false; // boolean is always false by default
        int count = 0;
        do {
            myBoolean = false;
            if (Math.random() <= 0.5) {
                myBoolean = true;
                count++;
                System.out.println("Coin flipped Heads " + count + " times");
            }
        } while (myBoolean);
    }
}
