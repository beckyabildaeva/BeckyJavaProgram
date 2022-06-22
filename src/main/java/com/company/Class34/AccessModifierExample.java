package com.company.Class34;
// Access modifier/ Access specifier:
//Public -> everyone can access
//Private -> can be accessed in class only
//Protected -> can be accessed in the same package, or outside package but only in child/sub class
//Default -> accessible in the same package.


// Same package class 1
class Bank{ // default class can only be accessed inside the package
    private int balance; // cannot access outside of Bank class

    public void displayBalance(){
        System.out.println(balance);
    }
}

// Same package class 2
public class AccessModifierExample {
    int num;

    public void method1(){
        Bank b = new Bank();

    }
}
