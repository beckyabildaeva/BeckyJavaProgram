package com.company.Class23;
// for each - special for loop works with collections of data to
// iterate or traverse or visit each element of an array

public class EnhanceForLoop {
    public static void main(String[] args) {
        int data [] = {35, 33, 75, 43, 75, 67, 0, -100};
        int sum = 0;
        for( int num : data) {
            // right handside is a collection
            sum = sum + num;
            System.out.println(num);
        }
    }

}
