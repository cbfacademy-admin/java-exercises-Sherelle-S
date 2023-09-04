package com.cbfacademy.classExercises;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        Random rand = new Random();
    // new instance of random and naming it rand
    int[] numbers = new int[10];
    // delcaring a new array with 10 spaces in it.

    for(int i = 0; i < numbers.length; i++){
        // Create a loop from 0 - the length of the numbers array
        numbers[i]= rand.nextInt(100);
        // assign each number in that array a random number between 0 and 1000;
    }
    // close the for loop

    System.out.println("Before:");
    // prints randome array before it was sorted
    System.out.println(Arrays.toString(numbers));
    // print the numbers array

    MergeSort.mergeSort(numbers, 0, numbers.length-1);

    System.out.println("After: ");
    System.out.println(Arrays.toString(numbers));

    Scanner scanner = new Scanner(System.in);

    System.out.println("what number would you like to search for?");
    int target = scanner.nextInt();

    System.out.println("Checking to see if the array contains number " + target);

    BinarySearchExercise binarySearch = new BinarySearchExercise();

    int result = binarySearch.binarySearch(numbers, target);

    if(result == -1){
        System.out.println(target +" cannot be found in this array.");
    }else{
        System.out.println(target +" has been located at index " + result +" of the array.");
    }
    }
    
    
}
