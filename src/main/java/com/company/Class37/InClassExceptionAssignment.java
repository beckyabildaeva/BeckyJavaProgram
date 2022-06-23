package com.company.Class37;
// 1. Take two numbers from user
// 2. Divide first num with 2nd num
// 3. Try to handle the exception

import java.util.InputMismatchException;
import java.util.Scanner;

public class InClassExceptionAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 2 integers");
        try{
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println(num1/num2);
        }catch(Exception e) {
            System.out.println("Error. Please try again.");
        }finally{
            System.out.println("The End.");
        }
    }
}
