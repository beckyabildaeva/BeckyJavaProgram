package com.company.Class37;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        int [] num = {32, 54, 45, 67, 34};
        Scanner sc = new Scanner(System.in);
        try{
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a/b);
        }catch(InputMismatchException e){
            System.out.println("Please try again");
        }catch(ArithmeticException e){
            System.out.println("Please learn your math");
        }

        try{
            System.out.println(num[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Everything goes well but your logic");
        }

        System.out.println("This is the END");
    }
}
