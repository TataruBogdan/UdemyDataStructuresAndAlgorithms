package com.bogdantataru;

public class Main {

    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        for (int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--){

            int largestSoFar = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[largestSoFar]) {
                    largestSoFar = i;
                }
            }
            swap(intArray, largestSoFar, lastUnsortedIndex);
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
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
