package com.cbfacademy;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        // Array must be sorted in order for binary search to work.
        // check the number in the center of the array, checks if its the number being searched for, if yes exit, if not it asks if number being searched is smaller than center, if yes its to the left. if its higher, its to the right.

        int[] ints = {1,2,4,5,7,9,11};
        
        // System.out.println(binarySearch(ints, 11));
        
        System.out.println(Arrays.binarySearch(ints, 3));
    }

    private static int binarySearch(int[] numbers, int numberToFind){
        int highPointer = numbers.length - 1;
        int lowPointer = 0;

        while(lowPointer <= highPointer){
            int middlePosition = (lowPointer + highPointer) / 2;
            int middleNumber = numbers[middlePosition];

            if(numberToFind == middleNumber){
                return middlePosition;
            }
            if(numberToFind < middleNumber){
                highPointer = middlePosition - 1;
            }else{
                lowPointer = middlePosition + 1;
            }
        }
        return -1;
    }
}
