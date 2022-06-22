package com.company.Class32;

class Vehicle{

    Vehicle(int num){
        System.out.println(num);
    } // prints 10 passed from child class using super(num)

}

class Car extends Vehicle{

    Car(int num){
        super(num); // passes num to parent class
        System.out.println(num); // prints out 10 from child class
    }
}

public class ThisAndSuperImpQuestion {
    public static void main(String[] args) { Car c = new Car(10); }
}