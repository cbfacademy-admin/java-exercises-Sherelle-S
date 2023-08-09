package com.cbfacademy.musings;

import java.util.Arrays;

public class QuicksortString {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "cherry", "date", "fig", "grape"};

        System.out.println("Original Array:");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("\nSorted Array:");
        printArray(arr);

        System.out.println(Arrays.binarySearch(arr, "cherry"));
        
    }

    public static void quickSort(String[] arr, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int pivotIndex = partition(arr, startIndex, endIndex);
            quickSort(arr, startIndex, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, endIndex);
        }
    }

    public static int partition(String[] arr, int startIndex, int endIndex) {
        String pivot = arr[endIndex];
        int pIndex = startIndex;

        for (int i = startIndex; i < endIndex; i++) {
            if (arr[i].compareTo(pivot) < 0) {
                // Swap arr[i] and arr[pIndex]
                String temp = arr[i];
                arr[i] = arr[pIndex];
                arr[pIndex] = temp;
                pIndex++;
            }
        }

        // Swap pivot and arr[pIndex]
        String temp = arr[endIndex];
        arr[endIndex] = arr[pIndex];
        arr[pIndex] = temp;

        return pIndex;
    }

    public static void printArray(String[] arr) {
        for (String value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
