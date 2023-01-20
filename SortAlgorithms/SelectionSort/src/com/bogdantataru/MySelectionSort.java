package com.bogdantataru;

public class MySelectionSort {

    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

//        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
//
//            int largestSoFar = 0; //- index used to traverse the array from left to right - the largest element we know so far
//            for (int i = 1; i <= lastUnsortedIndex ; i++) {
//                // start by comparing the element at position one to whatever is at position zero,
//                while (intArray[largestSoFar] < intArray[i] && i <= lastUnsortedIndex ) {
//                    largestSoFar = i;
//                }
//
//            }
//            swap(intArray, largestSoFar, lastUnsortedIndex);
//        }
//         sortArray(intArray);



        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }


    public int[] sortArray (int[] intArray) {

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){

        int largestSoFar = 0; //- index used to traverse the array from left to right - the largest element we know so far

        for (int i = 1; i <= lastUnsortedIndex ; i++) {
            // start by comparing the element at position one to whatever is at position zero,
            while (intArray[i] > intArray[largestSoFar] && i <= lastUnsortedIndex ) {
                largestSoFar = i;
            }

        }
        swap(intArray, largestSoFar, lastUnsortedIndex);
    }
    return intArray;
}

    public static void swap(int[] array, int i, int j){
        int temp;
        if (i == j){
            return;
        }

        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
