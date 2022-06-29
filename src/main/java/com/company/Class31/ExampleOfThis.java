package com.company.Class31;

class SuperClass{
    public void method1(){
        System.out.println("1");
    }
}

class SubClass extends SuperClass{

    public void method1(){
        super.method1();
        System.out.println("2");
    }
    public void method2(){
        System.out.println("3");
    }
}

public class ExampleOfThis {
    public static void main(String[] args) {
        SubClass sc = new SubClass(); //
        sc.method1(); // must call method, because it's not constructor
    }
}