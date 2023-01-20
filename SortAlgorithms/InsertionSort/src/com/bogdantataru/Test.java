package com.bogdantataru;

public class Test {

    public static void main(String[] args) {


        int[] intArray = { 20, 35, -15, 7, 55, 1, -22};

        insertionSortSimple(intArray);

        for (int i = 0; i < intArray.length-1; i++) {
            System.out.println(intArray[i]);
        }

    }

    public static int[] insertionSortSimple(int[] array) {


        for (int firstInsertedIndex = 1 ; firstInsertedIndex < array.length; firstInsertedIndex++ ) {

            int newElement = array[firstInsertedIndex];


            int i;
            for (i = firstInsertedIndex; i >0 && array[i-1] > newElement; i--) {
                array[i] = array[i - 1];
            }
            array[i] = newElement;

        }
        return array;
    }
}
