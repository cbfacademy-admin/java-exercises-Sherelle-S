package com.cbfacademy.classExercises;

import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};

        System.out.println("before");

        printArray(arr);

        quicksort(arr, 0, arr.length-1);

        System.out.println("After");
        printArray(arr);
    }

   public static void quicksort(int[] arr, int beginningIndex, int endIndex){
    
        if (beginningIndex < endIndex){
           int pivotIndex = partition(arr, beginningIndex, endIndex);
            quicksort(arr, beginningIndex, pivotIndex);
            quicksort(arr, pivotIndex + 1, endIndex);
            }
   }

   public static  int partition(int[] arr, int beginningIndex, int endIndex){
    int pivot = arr[endIndex];
    int pivotIndex = beginningIndex - 1;

    for (int i = beginningIndex; i < endIndex-1; i++){
        if (arr[i] < pivot){
            pivotIndex++;

            int temp = arr[i];
    // create empty temporar variable and assign it to the first index of the array. 
        arr[i] = arr[pivotIndex];
    // reassigns index 1 of the array to index 2, 
        arr[pivotIndex] = temp;
        }
    }
    int temp = arr[endIndex];
    // create empty temporar variable and assign it to the first index of the array. 
        arr[endIndex] = arr[pivotIndex + 1];
    // reassigns index 1 of the array to index 2, 
        arr[pivotIndex + 1] = temp;
       
           return pivotIndex + 1;
    }

    public static void printArray(int[] arr){
    
    System.out.println(Arrays.toString(arr));
    }
    }
    
    

