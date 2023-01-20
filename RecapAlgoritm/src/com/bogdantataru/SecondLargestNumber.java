package com.bogdantataru;

// find second largest number in an array
// The logic is very simple. First sort the Array using sort method available in java.util.Arrays package.
// The second highest element is not located at index [arrayLength - 2]

import java.util.Arrays;

public class SecondLargestNumber {

    public static void main(String args[]) {
        int[] myIntArray = { 12, 13, 14, 15, 16, 89, 23, 1, 90, 100 };

        Arrays.sort(myIntArray);
        System.out.println(Arrays.toString(myIntArray));
        System.out.println("Second Highest "
                + myIntArray[myIntArray.length - 2]);
    }
}
