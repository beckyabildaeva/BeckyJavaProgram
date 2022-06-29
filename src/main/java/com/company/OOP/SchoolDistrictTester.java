package com.company.OOP;

public class SchoolDistrictTester {
    public static void main(String[] args) {
        School school = new School("Rasco Middle School", "Joseph Klein", 50, 900);
        school.schoolDistrict();
        school.printSchoolDistrict();
        System.out.println();

        System.out.println("Name: " + school.getSchoolName());
        System.out.println("Principal: " + school.getPrincipal());
        System.out.println("Staff Number: " + school.getStaffNumber() + " teachers");
        System.out.println("Student Enrollment: " + school.getStudentEnrollment() + " students");

    }
}
