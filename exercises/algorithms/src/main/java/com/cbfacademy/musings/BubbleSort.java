package com.cbfacademy.musings;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
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

    // Sorting algo

    boolean swappedSomething = true;
    // creates a boolean that shows true;

    while(swappedSomething){
        // creates a while loop that cheks if wappedSomethng is true. while it is true run the loop.  

        swappedSomething = false;
        // sets swappedSomethig to false at the beginning of each loop
                for(int i = 0; i < numbers.length -1; i++){
                // Create a loop that goes from beginnning to last number in the array, hence -1.
                if(numbers[i] > numbers[i + 1]){
                    // if numbers[i] is greater than the next number in the array
                swappedSomething = true;
                // if something needs to be swapped, swappedSomethng then changes to true and the loop will run again when it finishes.
                    int temp = numbers[i];
                    // create a tempt variable to hold the number in while it is being swapped.
                    numbers[i] = numbers[i + 1];
                    // this swaps the number formerly in i to number that was in i + 1,
                    numbers[i + 1] = temp;
                    // reassigns the number that was in numbers i + 1 to the number being held in the temp variable 


        }
    }
    
    }
    System.out.println("After:");
    System.out.println(Arrays.toString(numbers));
    }

   

    
}
