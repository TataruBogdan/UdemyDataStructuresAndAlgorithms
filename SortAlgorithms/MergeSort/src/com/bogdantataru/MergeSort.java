package com.bogdantataru;

public class MergeSort {

    //my implementation of merge sort
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        //int[] intArray = {20, -15};

        //sortSimple(intArray);
        mergeSort(intArray, 0, intArray.length-1);

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }

    }

    // i have sorted an array with 1 element and 2 elements
    public static int[] sortSimple (int[] array) {

        // if array has only one element
        if(array.length == 1) {
            return array;
        }

        // if arrays elements are sorted
        if (array.length == 2) {
            if (array[0] < array[1]) {
                return array;
            }
            // if the elements are unsorted - sort the elements
            else {
                int temp = array[1];
                array[1] = array[0];
                array[0] = temp;
            }
        }
        return array;
    }

    // We do the sorting during the merging phase.
    public static int[] merge(int[] leftArray, int[] rightArray) {

        int[] resultArray = new int[leftArray.length + rightArray.length];

        int i = 0;
        int j = 0;
        int k = 0;

        //atata timp cat exista elemente in cele doua array-uri
        while(i <= leftArray.length - 1 && j <= rightArray.length-1) {
            // if value from left array is smaller or equal to the value from right array
            if (leftArray[i] <= rightArray[j]){
                //save the smallest value into the result array
                resultArray[k] = leftArray[i];
                i++; // and we select the next position to see if it's smaller

            } else {
                resultArray[k] = rightArray[j];
                j++;
            }
            k++;
        }

        if (i > rightArray.length-1) {
            //i must copy all the elements leftArray into resultArray
            for (int l = i; l <= i; l++) {
                resultArray[k] = leftArray[l];
            }
        }

        if (j > leftArray.length-1) {
            for (int r = j; r <=j ; r++) {
                resultArray[k] = rightArray[r];
             }
        }
        return resultArray;
    }


    // The splitting phase is a preparation phase to make sorting faster during the merging phase.
    public static void mergeSort(int[] array, int leftElement, int rightElement ){

        // we break the given array midway into 2 sub-arrays until the subarrays are formed by one or two elements

        if (rightElement == leftElement || rightElement == leftElement + 1){
            sortSimple(array);
        }

        int range = (rightElement - leftElement) +1;

        int mid = (rightElement + leftElement) / 2;
        int n1 = mid - leftElement;
        int n2 = rightElement - mid + 1;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < mid; i++) {
            leftArray[i] = array[leftElement + i];
        }
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
        for (int j = 0 ; j < range-mid ; j++){
            rightArray[j] = array[mid + j];
        }

        merge(leftArray, rightArray);

    }

}
