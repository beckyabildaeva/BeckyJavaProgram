package com.company.Class16;

import java.util.Scanner;

public class MethodExample {
    static void printLineEqual(int length, char c) {
        for (int i = 1; i <= length; i++) {
            System.out.println(c);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        printLineEqual(30, '*');
        System.out.println("Please enter first number: ");
        printLineEqual(50, '=');
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        printLineEqual(100, '=');
        System.out.println("Please enter second number: ");
        int b = sc.nextInt();
        printLineEqual(70, '$');
        System.out.println("Please enter the operation (Add/ Div/ Sub/ Mul)");
        String operation = sc.next();

        switch (operation){
            case "Add":
                System.out.println(a+b);
                break;
            case "Sub":
                System.out.println(a-b);
                break;
            case "Div":
                System.out.println(a/b);
                break;
            case "Mul":
                System.out.println(a*b);
                break;
            default:
                System.out.println("Invalid choice...please try after hangout");
        }
    }
}
