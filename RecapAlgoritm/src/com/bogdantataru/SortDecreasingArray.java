package com.bogdantataru;

public class SortDecreasingArray {


    public static void main(String[] args) {


    }

    public static void sortArray(int[] intArray) {
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < intArray.length - 1; i++) {
                if (intArray[i] <= intArray[i + 1]) {
                    int temp = intArray[i];
                    intArray[i] = intArray[i + 1];
                    intArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
    }
}

