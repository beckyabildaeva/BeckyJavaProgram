package com.company.Class39;
// print list data using 3 ways: for loop, enhanced, iterator

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        System.out.println("Countries I want to visit:");
        list.add("Norway");
        list.add("Switzerland");
        list.add("Iceland");
        list.add("Holland");

        System.out.println("====For Loop====");
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("====Enhanced For Loop====");
        for(String item : list){
            System.out.println(item);
        }
        System.out.println("====Iterator====");
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
