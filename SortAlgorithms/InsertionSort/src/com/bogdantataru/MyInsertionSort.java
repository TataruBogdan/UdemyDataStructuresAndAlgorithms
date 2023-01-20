package com.bogdantataru;

public class MyInsertionSort {

    public static void main(String[] args) {


        int[] intArray = { 20, 35, 15, 7, 55, 1, -22};

        insertionSort(intArray);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static int[] insertionSort(int[] array) {

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length ; firstUnsortedIndex++) {

            int newElement = array[firstUnsortedIndex]; // value of the first element from unsorted partition

            //traverse the sorted partition from right to left and we search the correct value by comparing the value from
            // unsorted partition with the value from sorted partition until we find an element that si smaller than the value of new element
            // and then we shift to the right the element from sorted partition to make place for the element in front of it


            int i;
            for (i = firstUnsortedIndex; i > 0 && array[i-1] > newElement; i--) {
                array[i] = array[i-1];

            }

            array[i] = newElement;

        }
        return array;
    }

}
