package com.company.Class30;


class Car{
    static int staticCount; // single copy!
    int instanceCount; // multiple copies

    Car(){ // constructor is called when obj is created in main, line 21-25
        staticCount++;
        // reassign static to instance
        // so that we can create a backup copy of the static to get classic count++
        instanceCount = staticCount;
    }

    void printCount(){
        System.out.println(instanceCount);
    }
}


public class Question12 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();
        Car c4 = new Car();
        Car c5 = new Car();

        c2.printCount();
        c5.printCount();

    }
}
