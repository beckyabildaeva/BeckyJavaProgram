package com.company.Class31;

class GrandParent{
    int a = 40;
}

class Parent extends GrandParent{
    int a = 10; // instance variable of parent class
}

class Child extends Parent{
    int a = 20; // instance variable of child class

    public void printData(){
        int a = 50; // local variable
        System.out.println(a); // 50
        System.out.println(this.a); // 20 ->instance variable of current class
        System.out.println(super.a); // 10 ->parent variable
    }
}

public class ExampleOfThisAndSuper {
    public static void main(String[] args) {
        Child c = new Child();
        c.printData();
    }
}