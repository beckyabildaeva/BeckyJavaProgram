package com.company.Class33;
// 1. Create a parent class of your choice
// 2. Create a child class of your choice having an IS-A relation with parent class
// 3. Override parent class method inside the child class
// 4. Create a class with main method & create object of child class and call child class method.

// parent class
class Coffee{
    public void displayCoffeeStrength() {
        System.out.println("Gives energy to work with Java programming");
    }
}
// child class
class Starbucks extends Coffee{
    @Override
    public void displayCoffeeStrength(){
        System.out.println("Get your name misspelled on the coffee cup");
    }
}
// child class
class Nescafe extends Coffee{
    @Override
    public void displayCoffeeStrength(){
        super.displayCoffeeStrength();
        System.out.println("Make your own coffee at home that tastes ok");
    }
}
public class CoffeeClass {
    public static void main(String[] args) {
        Nescafe nc = new Nescafe();
        Starbucks sb = new Starbucks();

        nc.displayCoffeeStrength();
        System.out.println();
        sb.displayCoffeeStrength();
    }
}
