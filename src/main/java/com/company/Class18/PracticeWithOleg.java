package com.company.Class18;

import java.util.Scanner;

public class PracticeWithOleg {
    public static void main(String[] args) {
    //Inside the main create a scanner to put into our method.
    //P.S Don't forget to put your return method inside a System.out.print(methodname);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for 1st method");
        double num = sc.nextDouble();
        practiceWithOleg(num); // no need to print out because void in method1
        line();

        System.out.println("Enter 3 numbers for 2nd method");
        double first = sc.nextDouble();
        double second = sc.nextDouble();
        double third = sc.nextDouble();
        System.out.println(averageNum(first, second, third));
        line();
    }

//1.
//Create a method that has a return type of boolean
//Make it return true if given number is even and false if odd.
//It should use a parameter
    public static void practiceWithOleg(double number) {
        //could use boolean, then need to add return statement, and print out in main method
        if(number%2==0){
            System.out.println("even");
        }else{
            System.out.println("not even");
        }
    }

//2.
//Create another method that will find the average of three given numbers
//You can hard code the given numbers to average them up, or use scanner inside the main
//method
//All your calculations should go inside the method.
    public static double averageNum(double a, double b, double c){
        // because it's not void, you need to print it out in main method
        return (a+b+c)/3;
    }

//3. Create a method which will simply print a line to separate our other methods.
//Example: When we call the method in our main it will just print a line.
    public static void line(){
        System.out.println("================");
    }

}

