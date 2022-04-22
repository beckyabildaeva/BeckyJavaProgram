package com.company.Class16;

public class My1stMethod {
    //create a method
    public int sumOfNumbers (int a, int b) {
        int sum = a + b;
        // return value
        return sum;
    }

    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 50;

        //create an object of My1stMethod
        My1stMethod obj = new My1stMethod();
        // call a method

        int result = obj.sumOfNumbers(num1, num2);
        System.out.println(result);
    }
}
