package com.cbfacademy.classExercises;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    
    public static void mergeSort(int[] numbers, int left, int right) {
        if(left < right){
            // if left side of array is larger than right side
            int mid = (left + right)/ 2;
            // find the mid point by adding left and right side toether and dividing by two.

            mergeSort(numbers, left, mid);
            // merge sort the numbers array from the left to the midpoint;
            mergeSort(numbers, mid + 1, right);
            // merge sort the the numbers from the right of the midpoint and up.

            merge(numbers, left, mid, right);
            // merge the numbers from the left, midpoint and right of the array.
        }

    }

    public static void merge(int[] numbers, int left, int mid, int right) {
        // creates the mergesort method.
        int n1 = mid - left + 1;
        // creates int variable n1 and assigns it to midpoint - left side + 1;
        int n2 = right - mid;
        // creates int variable and assigns it to right side - midpoint;

        int[] leftSide = new int[n1];
        // creates an empty array and adds n1 to it.
        int[] rightSide = new int[n2];
        // creates an empty array and adds n2 to it.

        for(int i = 0; i < n1; i++){
            // loops through the length of the n1 array 
            leftSide[i] = numbers[left + i];
            // assigns the index of the left side to the numbers index of the numbers array + 1
        }

        for(int j = 0; j < n2; j++){
            // loops through the length of the right side of the nubers array.
            rightSide[j] = numbers[mid + 1 + j];
            // assigns each index to numbers array, 1 number past the midpoint + j;
        }

        int i = 0, j = 0, k = left;

        while(i < n1 && j < n2){
            // while i is less than n1 and while j is less than n2
            if(leftSide[i] <= rightSide[j]){
                // if index of left side is greater than index of j. 
                numbers[k] = leftSide[i];
                // numbers in the leftindex will equal leftside index 
                i++;
                // incrament the index of i each iteration
            }else{
                // else
                numbers[k] = rightSide[j];
                // if index of  right side is greater than index of j. k will be reassigned to equal the index of j;
                j++;
                // incrament j after the iteration
            }
            k++;
            // incrament k. all indexes will incrament and iterate together.
        }

        while(i < n1){
            // while i is smaller than n1
            numbers[k] = leftSide[i];
            // the current index of k will be reassigned to equal left index 
            i++;
            // incrament i 
            k++;
            // incrament k
        }

        while(j < n2){
            // while j is smaller than n2
            numbers[k] = rightSide[j];
            // the current index of k will be reassigned to the index of j
            j++;
            // incrament j
            k++;
            // incrament k
        }
    
    }
    
}
