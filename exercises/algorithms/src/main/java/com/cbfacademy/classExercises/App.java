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
    // prints random array before it was sorted
    System.out.println(Arrays.toString(numbers));
    // print the numbers array

    MergeSort.mergeSort(numbers, 0, numbers.length-1);
    // create a new instance of mergeSort and calling the mergeSort method on it, numbers array, left assigned to 0, and the right assigned to the last number in the numbers array are assigned as parameters

    System.out.println("After: ");
    // prints the array after it has been sorted
    System.out.println(Arrays.toString(numbers));
    // calling the to String method on the Arrays library and parsing the numbers array into it to print it

    try (Scanner scanner = new Scanner(System.in)) {
        // creates a new instance of scanner surrounded in try with resources to ensure scanner is closed after it has been used.
        System.out.println("what number would you like to search for?");
        // promts user to enter a number to search for
        int target = scanner.nextInt();
        // assigns number to search for to the integer target

        System.out.println("Checking to see if the array contains number " + target);
        // responding message to client.
        BinarySearchExercise binarySearch = new BinarySearchExercise();
        // creating a new instance of binary search exercise

        int result = binarySearch.binarySearch(numbers, target);
        // assignes an integer called resukt to the binary search method that tells the search to check if the target number is located in the numbers array

        if(result == -1){
            // if result is -1 it means the target is not inside of the array
            System.out.println(target +" cannot be found in this array.");
            // return the following message
        }else{
            // or else the target should be in the array
            System.out.println(target +" has been located at index " + result +" of the array.");
            // return this message along with the index it is located at.
        }
        // close if else statement
    }catch(Exception e){
        // catch with a generic exception (i know this is the wrong exception)
        e.printStackTrace();
        // print location that exception is throwns at
    }
    // close try catch block

    }
    // close main 
    
}
// close class
