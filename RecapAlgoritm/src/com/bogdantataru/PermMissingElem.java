package com.bogdantataru;

public class PermMissingElem {

    public static void main(String[] args) {


        int[] intArray = new int[7];
//        System.out.println(intArray.length);

        intArray[0] = 3;
        intArray[1] = 4;
        intArray[2] = 2;
        intArray[3] = 6;
        intArray[4] = 5;
        intArray[5] = 1;
        intArray[6] = 8;

        //O(n) - search into an Array
//        int index = Integer.MIN_VALUE;
//        for (int i = 0; i < intArray.length; i++) {
//            //System.out.println(intArray[i]);
//            if (intArray[i] == 7) {
//               index = i;
//               break;
//            }
//        }
//        System.out.println("index = " + index);

//        for (int unsortedPartitionIndex = intArray.length - 1; unsortedPartitionIndex >0; unsortedPartitionIndex--) {
//            for (int i = 0; i < unsortedPartitionIndex ; i++) {
//                if (intArray[i] > intArray[i + 1]){
//                    swap(intArray, i, i+1);
//                    //if
//                }
//            }
//        }
//        for (int i = 0; i < intArray.length; i++) {
//            System.out.println(intArray[i]);
//        }

        // 1. Perm Missing NUmber - n(n+1) == n^2 + n -> CPU O(n^2) \ MEM O(n)
        // O(n+1) steps
        for (int x = 1; x <= intArray.length + 1; x++) {
            boolean found = false;
            // O(n) steps
            for (int i: intArray) {
                if (i == x){
                    found = true;
                }
            }
            if (!found){
                System.out.println(x);
            }
        }

        // create an new array with size n+2 - why? -> start from 1 not from 0 + we have one missing element !
        // CPU O(n) | MEM O(n)
        boolean[] newArray = new boolean[intArray.length + 2];
        for (int i : intArray) {
            newArray[i] = true;
        }
        for (int i = 1; i < newArray.length; i++) {
            if (!newArray[i]){
                System.out.println(i);
            }
        }


        //actualSum value of elements -- what is expected and what you have+ n steps + n+1 steps CPU O(n) | MEM O(n)
        // O(n)
        long actualSum = 0;
        for (int number:intArray) {
            actualSum += number;
        }
        // CPU - O(n)
//        int expectedSum = 0;
//        for (int i = 1; i <= intArray.length + 1 ; i++) {
//            expectedSum += i;
//        }
        //eliminate n+1 steps - Faster
        long maxNumber = intArray.length + 1;
        long expectedSum = (maxNumber * (maxNumber + 1) / 2);
        long missingValue = expectedSum - actualSum;
        System.out.println(missingValue);
    }

    public static void swap(int[] array, int i, int j){

        if (array[i] == array[j]){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}



