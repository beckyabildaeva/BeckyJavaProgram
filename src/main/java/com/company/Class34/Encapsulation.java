package com.company.Class34;
// Encapsulation is wrapping private data and public methods into single class for security purpose.

class Person {
    private int medication;
    // Getter
    public int getMedication(){
        return medication;
    }
    // Setter
    // The point of setter is to be able to add extra security measures, limits, etc on the variable.
    public void setMedication(int medication){
        if(medication>100){
            System.out.println("Do not overload medication");
        } else {
            this.medication = medication;
        }
    }
}


public class Encapsulation {
    public static void main(String[] args) {
        Person chirag = new Person();
        chirag.setMedication(55); // accessing medication variable through setMedication method.
    }
}

