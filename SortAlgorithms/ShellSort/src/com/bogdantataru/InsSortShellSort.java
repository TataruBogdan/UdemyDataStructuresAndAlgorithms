package com.bogdantataru;

public class InsSortShellSort {

    public static void main(String[] args) {

        int[] intArray = { 20, 35, 15, 7, 55, 1, -22};

        for (int gap = intArray.length/2; gap >0; gap/=2){


            for (int firstUnsortedIndex = gap; firstUnsortedIndex < intArray.length;  firstUnsortedIndex++){

                int newElement = intArray[firstUnsortedIndex];

                int i = firstUnsortedIndex;
                while (i >= gap && intArray[i-gap] > newElement) {
                    intArray[i] = intArray[i-gap];
                    i -= gap;
                }

                intArray[i] = newElement;

            }
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
