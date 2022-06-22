package com.company.Review;

public class Array {
    public static void main(StringReview[] args) {
        // int [] data = new int[5];
        // System.out.println(data[5]); // prints nothing

        int [] data = {20, 10, 12, 60, 40};
        System.out.println("Num at Index 4 " +data[4]);
        System.out.println("==================");

        // print all data from array
        for(int i = 0; i<data.length; i++){
            System.out.println(data[i]);
        }
        System.out.println("==================");
        // use enhanced for loop to print all array
        for(int i : data){
            System.out.println(i);
        }
        System.out.println("==================");
        // reverse array
        for(int i = data.length-1; i>=0; i--){
            System.out.println(data[i]);
        }
        System.out.println("==================");

        // reverse array
        int[] data1 = {30, 40, 10};
        // last num in array
        int j = data1.length-1;
        for(int i = 0; i<data1.length/2; i++){
            // swapping 1st and last digit
            int temp = data1[i];
            data1[i] = data1[j];
            data1[j] = temp;

            // decrementing
            j--;
        }
        for(int num : data1){
            System.out.println(num);
        }
        System.out.println("==================");

        // print maximum
        int [] data2 = {20, 20, 12, 60, 40};
        int max = data[0];
        for (int i = 0; i<data2.length; i++){
            if(data2[i]>max){
                max = data2[i];
            }
        }
        System.out.println("Max " +max);
        System.out.println("==================");

        // print minimum
        int min = data[0];
        for(int num : data2){
            if(num < min){
                min = num;
            }
        }
        System.out.println("Min" + min);




    }



}
