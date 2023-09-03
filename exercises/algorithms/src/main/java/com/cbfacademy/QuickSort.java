package com.cbfacademy;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        // choose  a pivot
        // partition all numbers less than pivot on the left, all numbers higher on the right.
        // recursivley quicksort all values onthe left choosing a pivot and  partitioning, then recursivley quicksort the numbers on the other side.
    Random rand = new Random();
    int[] numbers = new int[10];

    for(int i = 0; i < numbers.length; i++){
        numbers[i] = rand.nextInt(100);
    }

    System.out.println("Before:");
    System.out.println(Arrays.toString(numbers));

    quicksort(numbers);

    System.out.println("After quicksort:");
    System.out.println(Arrays.toString(numbers));
    
    }

    private static void quicksort(int[] array){
        quicksort(array, 0, array.length - 1);
    }

    private static void quicksort(int[] array, int lowIndex, int highIndex){

        if(lowIndex >= highIndex){
            return;
        }

        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = array[pivotIndex];
        swap(array, pivotIndex, highIndex);

        int leftPointer = partition(array, lowIndex, highIndex, pivot);
        

        quicksort(array, lowIndex, leftPointer - 1);
        quicksort(array, leftPointer + 1, highIndex);
    }

    private static int partition(int[] array, int lowIndex, int highIndex, int pivot){
        
         pivot = array[highIndex];
        
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        // if(pivot != null){

        // }

        while(leftPointer < rightPointer){

            while(array[leftPointer] <= pivot && leftPointer < rightPointer ){
                leftPointer++;
            }

            while(array[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }

            swap(array, leftPointer, rightPointer);

        }
        swap(array, leftPointer, highIndex);
        return rightPointer;
    }

    private static void swap(int[] array, int index1, int index2){
        int temp = array[index2];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
}
