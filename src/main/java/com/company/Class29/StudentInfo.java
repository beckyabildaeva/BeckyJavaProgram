package com.company.Class29;
// use static & instance methods & variables to display student information

class Student {
    // instance variable -> available with the object only
    String name;
    int studentID;

    // static variable -> available with the entire class
    static String schoolName;

    // static counter -> to set student ID -> if not static, wouldn't count up
    static int count = 50000;

    // constructor -> to assign info to Student class variables - instance variables
    public Student(String name){
        this.name = name;
        // assign student ID variable with setStudentID() method to set unique ID #
        this.studentID = setStudentID();
    }
    // static variable(count) -> to set unique Student ID # and count it up
    static int setStudentID(){
        count++;
        return count;
    }
    // static method -> can be called directly in the main method w/o object
    static void setSchool(){
        schoolName = "Rasco Middle School";
    }
    // instance method -> can be called in the main after creating an object of Student class
    void getStudentInfo(){
        System.out.println("Student Name: " + this.name);
        System.out.println("Student ID: " + this.studentID);
        //accessing static variable-> same copy for all students
        System.out.println("School Name: "+schoolName);
    }
}
public class StudentInfo{
    public static void main(String[] args) {
        //call static method w/o instantiating Student class/creating object of class
        Student.setSchool();

        //create object of Student class/instantiate it to call an instance method
        Student student1 = new Student("John Garza");
        Student student2 = new Student("Blake Layne");
        Student student3 = new Student("Wyatt Rock");

        //call instance method to get Student information
        student1.getStudentInfo();
        System.out.println();
        student2.getStudentInfo();
        System.out.println();
        student3.getStudentInfo();
    }
}




