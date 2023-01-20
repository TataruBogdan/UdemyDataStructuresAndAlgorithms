package com.bogdantataru;

public class MyCode {

    public static void main(String[] args) {

        int[] intArray = {-22, -15, 1, 7, 20, 35, 55};

        int arrayLength = intArray.length;
        int valueToSearch = 1;

        binarySearch(intArray, valueToSearch);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }


    public static int binarySearch(int[] input, int valueToSearch){

        int start = 0;
        int end = input.length;

        int middle = (end + start)/2;

        if (input[middle] == valueToSearch) {
            return middle;
        }

        while (start < valueToSearch) {

            middle = (start + end)/2;
        }

        if (input[middle] > valueToSearch) {
            middle = (middle + end) /2;
        }
        return -1;
    }
}
