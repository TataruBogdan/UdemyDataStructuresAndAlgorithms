package com.bogdantataru;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {7, 35, -15, 20, 55, 1, -22, -41, 2};

        // gap - the unsorted partition
        for (int gap = intArray.length / 2; gap > 0; gap /= 2 ) {
            //first unsorted index = whatever is on gap index
            for (int i = gap; i < intArray.length; i++){
                int newElement = intArray[i];

                int j = i;
                // don't want to go outside the unsorted partition
                while (j >= gap && intArray[j - gap] > newElement) {
                    intArray[j] = intArray[j - gap];
                    j -= gap;
                }
                intArray[j] = newElement;
            }
        }

        for (int i = 0; i < intArray.length; i++ ) {
            System.out.println(intArray[i]);
        }
    }
}
