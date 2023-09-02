package com.cbfacademy;

public class MergeSort {
    int inputLength = inputArray.length;
        // declare the left and right variables, which will mark the extreme indices of the array of size n
        // Array arrayOne = a[0]...a[n/2];
        // Array arrayTwo = a[n/2+1]...a[n];
        if(inputLength < 2){
            return;
            // we return right now as if the input array has only one element in it or is empty if is already sorted and so does not need any more work
        }

        // left will be assigned to 0 and right will be assigned to n-1
        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];
        // now populate the two arrays 
        /* for(int i = 0; i < midIndex; i++){
            leftHalf[i] = inputArray[i];
        } 
        for(int i = 0; i < midIndex; i++){
            rightHalf[i - midIndex] = inputArray[i];
        } 
        */
        // Find mid = (left + right) / 2
        // Call mergeSort on (left, mid) and (mid + 1, right)
        /*mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge (inputArray, leftHalf, rightHalf)

        */

        // Continue the above until left > right
        // Then call merge on the 2 sub-problems
        // Given what we've learned about this algorithm, create a program that implements it in Java.
        
        // mergeSort(arr, left, right):
        //     if left > right 
        //         return
        //     mid = (left+right)/2
        //     mergeSort(arr, left, mid)
        //     mergeSort(arr, mid+1, right)
        //     merge(arr, left, mid, right)
        /*create a method to merge the arrays
         * private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalt){
         * int leftSize = leftHalf.length;
         * int rightSize = rightHalt.length;
         * 
         * int i = 0;
         * int j = 0;
         * int k = 0;
         * 
         * while (i < leftSize && j < rightSize){
         * if(leftHalf[i] <= rightHalf[j]){
         * inputArray[k] = leftHalf[i];
         * i++;
         * }else{
         * inputArray[k] = rightHalf[j];
         * j++;}
         * k++
         * }
         * whie (i< leftSize){
         * inputArray[k] = leftHalf[i];
         * i++;
         * k++;
         * }
         * while (j < rightSize){
         * inputArray[k] = rightHalf[j];
         * j++;
         * k++;
         * }
         * }
         * ** dealing with these arrays this can throw an ArrayIndexOutOfBoundException**
        */
        // end
         }

}
