package com.bogdantataru;

public class SelectionSortAsc {


    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        selectionSort(intArray);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static int[] selectionSort(int[] array) {

        for (int i = 0; i < array.length-1; i++) {

            int smallestSoFar = i;

            for (int j = i+1; j < array.length; j++) {

                if (array[j] < array[smallestSoFar]){
                    smallestSoFar = j;

                }
            }
            swap(array, smallestSoFar, i);
        }
        return array;

    }
    public static void swap(int[] array, int j, int i) {

        // if element are equal don't do anything - algorithm stable
        if (array[i] == array[j]){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

}
