package com.company.OOP;

public class Human {
    // variables/attributes
    String name;
    String gender;
    double height;
    int weight;

    // constructor/assign info to the object
    Human(String name, String gender, double height, int weight){
        // set the object's data with the provided data (name, gender, etc.)
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    // methods/behavior
    public void speak() { System.out.println("Hi, I am " + name + "!"); }
    // set the name of the object
    public void setName(String newName) { this.name = newName; }
    // return name, gender, height, weight of the object
    public String getName() { return name; }
    public String getGender() { return gender; }
    public double getHeight() { return height; }
    public int getWeight() { return weight; }

}
