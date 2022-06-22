package com.company.Class42;

// enum is a class that holds constants
enum DaysOfWeek {
    // constants:
    SUNDAY(0), MONDAY(1), TUESDAY(2), WEDNESDAY(3);

    int num;

    DaysOfWeek(int num){
        this.num = num;
    }
    public int getValue(){
        return num;
    }
}

public class EnumDaysOfWeek {
    public static void main(String[] args) {
        System.out.println(DaysOfWeek.MONDAY.getValue());
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println();
        System.out.println(str1==str2);

        /*String s1=null;
        if(s1.length() == 0){
            System.out.println("zero");
        } else if (s1.isEmpty()){
            System.out.println("empty");
        } else if(s1==null){
            System.out.println("null");
        } else {
            System.out.println("Something else");
        }
         */
    }
}
