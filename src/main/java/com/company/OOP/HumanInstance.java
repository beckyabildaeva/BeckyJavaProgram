package com.company.OOP;

public class HumanInstance {
    public static void main(String[] args) {
        Human newHuman = new Human("Becky", "Female", 5.5, 110);

        System.out.println("Name: " + newHuman.getName());
        System.out.println("Gender: " + newHuman.getGender());
        System.out.println("Height: " + newHuman.getHeight() + " ft");
        System.out.println("Weight: " + newHuman.getWeight() + " lbs");
    }
}
