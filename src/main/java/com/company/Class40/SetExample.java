package com.company.Class40;

import java.util.*;

// sets don't execute in order from top to bottom, it has random positions
// doesn't print duplicates

// create Set called nums
// add a couple of integers including duplicate values
// print all data from set using index-based for loop

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<>();

        // System.out.println(nums.add(50));

        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(30); // duplicate

        // enhanced for-loop
        for(Integer i : nums){
            System.out.println(i);
        }
        System.out.println();

        // iterator
        Iterator<Integer> itr = nums.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
