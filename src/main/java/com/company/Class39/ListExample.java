package com.company.Class39;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<Integer>();
        List<String> myList1 = new ArrayList<String>();

        myList.add(9);
        myList.add(18);
        myList.add(27);

        myList1.add("Tomato");
        myList1.add("Potato");
        myList1.add("Apple");


        Integer j = 9;
        myList.remove(j); // to remove a num, create its variable, and remove its reference
        myList.remove(1); // remove num at index 1
        myList1.remove("Tomato");

        System.out.println(myList);
        System.out.println(myList1);
        System.out.println(myList1.contains("Apple"));
        System.out.println(myList1.get(0));
        System.out.println(myList1.isEmpty());
        System.out.println(myList.size());

        // Converting List (which is an interface, and you can't instantiate it) to object Array
        Object[] array = myList1.toArray(); //Object is the parent class of the classes

        for(Object str : array){
            System.out.println(str.toString()); // type-casted object to string literal
        }

        // Print all list data using Index-based for loop
        System.out.println("Print data with index-based for loop");
        for(int i = 0; i<=myList1.size(); i++){
            System.out.println(myList1.get(i));
        }

        // Print all list data using Enhanced for loop
        System.out.println("Print data with enhanced for loop");
        for(String item : myList1){
            System.out.println(item);
        }

        // Print all list data using Iterator
        Iterator<String> itr = myList1.iterator();
        System.out.println(itr.hasNext()); // check if we have next element
        System.out.println(itr.next()); // get data at current position and move to next position

        // Print all list data using Iterator
        while(itr.hasNext()){ // while itr.hasNext() == true
            System.out.println(itr.next());
        }
    }
}
