package com.company.JiraProject;

import java.util.Scanner;

public class GOL_7 {
    public static void main(String[] args) {
        System.out.println("Enter 2 digits in the range of 10 to 99");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(new GOL_7().logic(a, b));
    }

    public boolean logic(int a, int b) {
        if (a >= 10 && a <= 99) {
            return a / 10 == b / 10
                    || b % 10 == a % 10
                    || a / 10 == b % 10
                    || a % 10 == b / 10;
        } else {
            return false;
        }
    }
}
