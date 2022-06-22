package com.company.Class28;
//Create class called Person
//Create variable and methods of Person class
//Create constructor which will take name and age of Person
//Create another Constructor which will take zero argument
//Create another constructor which will take name and phoneNumber of Person
//Create Person tester and create 3 objects of person using different Constructor
//Try to print all variables of Person class.

public class Person {
    //variables
    String name;
    int age;
    String phoneNumber;

    //parameterized constructor
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    Person(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    //no Arg constructor
    Person(){
        name = "Mike";
        age = 30;
    }

    //default constructor -> don't need to create,
    //Java will create it when we compile the program

    public void personInformation(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Phone Number: "+phoneNumber);
    }
}
