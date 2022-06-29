package com.company.JiraProject;

import com.github.javafaker.Faker;

import java.util.Scanner;

// Given 2 int values greater than 0,
// return whichever value is nearest to 21 without going over.
// Return 0 if they both go over.
public class GOL_20Fernando {
    public static void main(String[] args) {

        Faker faker = new Faker();
        System.out.println(faker.company().profession());

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two digits");
        System.out.println(max(sc.nextInt(), sc.nextInt()));


    }
    public static int max(int a, int b) {

        if (a > 21 && b > 21) {
            return 0;
        } else if (a > 21) {
            return b;
        } else if (b > 21) {
            return a;
        }
        int sumA = 21 - a;
        int sumB = 21 - b;
        if (sumA > sumB) {
            return b;
        } else {
            return a;
        }
    }
}