package com.company.Review;

public class TwoDArray {
    public static void main(StringReview[] args) {
        //create array , but not initialize it
        int nums [][] = new int [3][2];

        int data [][] = {{1,2,3},{5,3,1},{7,2,5}};

        // Number of Rows
        System.out.println(data.length);

        // Number of Columns
        System.out.println(data[0].length);

        // if it is 3 by 3 then data.length in inner and outer loop doesn't matter
        // if its not 3 by 3, then data.length in inner and outer will only print 2 rows
        for(int i = 0; i<data.length; i++){
            for(int j = 0; j<data[i].length; j++){
                System.out.print(data[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
