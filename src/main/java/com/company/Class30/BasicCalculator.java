package com.company.Class30;

// Parent - Super - Base Class
public class BasicCalculator {
    public void sum(int a, int b){
        System.out.println("Sum: " + (a+b));
    }
    public void sub(int a, int b){
        System.out.println("Sub: " + (a-b));
    }
}

// Child - Sub - Derived Class
class AdvanceCalculator extends BasicCalculator{
    public void div(int a, int b){
        System.out.println("Sum: " + (a/b));
    }
    public void mul(int a, int b){
        System.out.println("Sub: " + (a*b));
    }
}
