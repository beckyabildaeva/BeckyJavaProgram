package com.company.Class35;
// Rules of Abstract Class:
//Cannot create an object (instantiate) of an Abstract class, because it has no body in its method.
//Abstract class can have abstract methods as well as non-abstract methods.
//Child class is responsible to implement all abstract methods of abstract parent class. (it HAS to!). If it doesn’t then child class has to be abstract.
//Abstract class can have instance variable.
//Abstract class can have constructor and this constructor will get called when we create an object of child class.
//Abstract class can have static variables and static methods as well.
//If at least one method inside the class is abstract we must make the class abstract.

abstract class Engineer {
    // Abstract method
    public abstract void work();

    // Concrete method
    public void sleep(){
        System.out.println("No Sleep!");
    }
}
// if child doesn't implement methods of abstract class,
// then it should also be abstract
abstract class ComputerEngineer extends Engineer{

}
// child class of abstract class MUST implement its methods
class Programmer extends Engineer {
    public void work() {
        System.out.println("Coding");
    }
}

class ElectronicsEngineer extends Engineer {
    public void work(){
        System.out.println("Work with wires and get shocked");
    }
}

public class AbstractClass1{
    public static void main(String[] args) {
        Programmer pr = new Programmer();
        pr.work();
        pr.sleep();

    }
}