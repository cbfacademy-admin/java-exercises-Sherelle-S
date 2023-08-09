package com.cbfacademy.musings;

import java.util.Arrays;
import java.util.Random;

public class QuickSort1 {
    public static void main(String[] args) {
             
        Random rand = new Random();
        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = rand.nextInt(50);
        }

        System.out.println("Before:");
        System.out.println(Arrays.toString(numbers));

         quicksort(numbers, 0, numbers.length - 1);

    System.out.println("After:");
    System.out.println(Arrays.toString(numbers));

    }

   private static void quicksort(int[] array, int startIndex, int endIndex){

    if(startIndex >= endIndex){
        return;
    }

    int pivot = array[endIndex];
    // creates pivot variable and assignes it to the high index position.
    int leftPointer = startIndex;
    // leftpointer is assigned to lowest index.
    int rightPointer = endIndex;
    // right pointer is assinged to highest index 

    while(leftPointer < rightPointer){

        while(array[leftPointer] <= pivot && leftPointer < rightPointer){
            leftPointer++;
        }

        System.out.println(Arrays.toString(array));
        while(array[rightPointer] >= pivot && leftPointer < rightPointer){
            rightPointer--;
        }
            System.out.println("the left pointer is "  + array[leftPointer]);
            System.out.println("the right pointer is " + array[rightPointer]);
            System.out.println("THE PIVOT IS " + pivot);
        System.out.println("in the while loop");
        
        swap(array, leftPointer, rightPointer);
    }

    swap(array, leftPointer, endIndex);
    quicksort(array, startIndex, leftPointer-1);
    quicksort(array, leftPointer+1, endIndex);
   }

   private static void swap(int[] array, int index1, int index2){
    // create a method called swap taking in paramterers of an array, interger called index1, interger called index2.
    int temp = array[index1];
    // create empty temporar variable and assign it to the first index of the array. 
    array[index1] = array[index2];
    // reassigns index 1 of the array to index 2, 
    array[index2] = temp;
    // assigns array 2 to the temporary variable and completing the swap 
   System.out.println("Swap is taking place" +Arrays.toString(array));
}
           

//    close the method 
}
// close the class
