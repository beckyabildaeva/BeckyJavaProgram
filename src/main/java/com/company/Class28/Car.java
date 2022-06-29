package com.company.Class28;
//Create a class called car
//Create variables and methods inside car
//Create constructor which takes CarName and CarYear from user
//Create one method in car class which print car configuration (all variable)
//Call car configuration method from main method

public class Car {
    // variables/attributes of a car
    String make;
    String model;
    int year;
    String color;
    String edition;

    //constructor
    Car(String make, String model, int year, String color, String edition){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.edition = edition;
    }
    public void carConfiguration(){
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Edition: " + edition);
    }
}
