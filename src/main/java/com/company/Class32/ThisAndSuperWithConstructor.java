package com.company.Class32;

class Animal {
    Animal(){
        System.out.println("1");
    } // 1) prints 1

}

class Dog extends Animal{
    Dog(){
        this("Abc");
        System.out.println("2"); // 4) prints 2
    }

    Dog(String name){
        super();
        System.out.println(name); // 2) prints Abc
        System.out.println("3"); // 3) prints 3
    }
}

public class ThisAndSuperWithConstructor {
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}
