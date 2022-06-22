package com.company.OOP;

public class School extends SchoolDistrict implements Interface{
    private String schoolName; // encapsulate data
    private String principal;
    private int staffNumber;
    private int studentEnrollment;

    public School(String schoolName, String principal, int staffNumber, int studentEnrollment){
        this.schoolName = schoolName;
        this.principal = principal;
        this.staffNumber = staffNumber;
        this.studentEnrollment = studentEnrollment;
    }
    @Override
    public void schoolDistrict(){
        districtName = "BISD";
        city = "Houston";
        state = "TX";
        tierSystem = "Tier I";
    }
    @Override
    public void printSchoolDistrict() {
        System.out.println("District Name: " + districtName);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Tier System: " + tierSystem);
    }
    @Override
    public void setSchoolName(String schoolName) {this.schoolName = schoolName;}
    @Override
    public void setPrincipal(String principal) {this.principal = principal;}
    @Override
    public void setStaffNumber(int staffNumber) {this.staffNumber=staffNumber;}
    @Override
    public void setStudentEnrollment(int studentEnrollment) {this.studentEnrollment=studentEnrollment;}
    @Override
    public String getSchoolName() {return schoolName;}
    @Override
    public String getPrincipal() {return principal;}
    @Override
    public int getStaffNumber() {return staffNumber;}
    @Override
    public int getStudentEnrollment() {return studentEnrollment;}
}
