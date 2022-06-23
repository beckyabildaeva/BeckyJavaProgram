package com.company.Class39;

import java.util.ArrayList;
import java.util.List;

// Create a list of data (int, String)
// Check if item is already available on list
// Enter duplicate item in the list and check if we can add duplicate items in list
// Check if list is empty
// Find size of list
// Print all elements of list in separate lines
public class ListAssignment {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Lipstick");
        list.add("Eyeshadow");
        list.add("Mascara");
        list.add("Eyeliner");
        list.add("Lipstick");

        System.out.println(list); // yes we can print out duplicates
        System.out.println(list.contains("Mascara")); //true
        System.out.println(list.isEmpty()); // false
        System.out.println(list.size()); // 5 String objects

        Object[] array = list.toArray(); // convert List to Object
        for(Object str : array){
            System.out.println(str.toString()); // type-cast Object to String literal
        }


    }

}
