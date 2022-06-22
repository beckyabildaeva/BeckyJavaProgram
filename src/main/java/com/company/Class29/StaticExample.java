package com.company.Class29;

class Car {
    // non static variables
    int maxSpeed;
    String color;
    double mileage;

    // class property, not an object property
    // static variable has only 1 copy
    // static is accessible to all objects of the class
    // if it is initialized multiple times, then last copy is the final copy
    // previous copies are deleted/overwritten by a new copy
    static int numOfCar;
}

    public class StaticExample{
        public static void main(String[] args) {
            Car c1 = new Car();
            Car c2 = new Car();
            System.out.println(Car.numOfCar);
            System.out.println(c1.color);
        }
    }


