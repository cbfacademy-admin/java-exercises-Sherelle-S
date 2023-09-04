package com.cbfacademy.classExercises;

import java.util.Arrays;
import java.util.Random;

public class BinarySearchExercise {
    // binary search class
    public static int binarySearch(int[] numbers, int x){
        // binary search method that takes in an array and an integer 
        int low = 0;
        // lowest point is assigned to 0;
        int high = numbers.length-1;
        // highest point is assigned to the last number in the numbers array.

        while(low <= high){
            // while low point is greater than high point
            int mid = (low + high) / 2;
            // declares a midpoint varable and does an equation to find the midpoint.

            if(numbers[mid] == x){
                // if midpoint of the numbers is equal to the number we are looking for 
                return mid;
                // return the midpoint number
            }else if(numbers[mid] < x){
                // or else if the midpoint is lower than the number we are looking for
                low = mid + 1;
                // lowest point is reassigned to midpoint + 1
            }else{
                high = mid - 1;
                // highest point is reassigned to midpoint - 1;
            }
        }

        return -1;
        // if elemnt is not found return -1;

    }
    // public static void main(String[] args) {
    // Random rand = new Random();
    // // new instance of random and naming it rand
    // int[] numbers = new int[10];
    // // delcaring a new array with 10 spaces in it.

    // for(int i = 0; i < numbers.length; i++){
    //     // Create a loop from 0 - the length of the numbers array
    //     numbers[i]= rand.nextInt(100);
    //     // assign each number in that array a random number between 0 and 1000;
    // }
    // // close the for loop

    // System.out.println("Before:");
    // // prints randome array before it was sorted
    // System.out.println(Arrays.toString(numbers));
    // // print the numbers array

    // MergeSort mergeSort = new MergeSort();
    // numbers = mergeSort(numbers);

    // System.out.println("After: ");
    // System.out.println(Arrays.toString(numbers));

    // }
    
}
