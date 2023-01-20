package com.bogdantataru;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

            quickSort(intArray, 0, intArray.length);


        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }

    public static void quickSort(int[] input, int start, int end) {
        if (end - start < 2){
            return;
        }

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1 , end);
    }

    public static int partition (int[] array, int start, int end) {

        // This is using the first element as the pivot
        int i = start;
        int j = end;
        int pivot = array[start];

        while (i < j){
            //NOTE : empty loop body - we're just basically using the loop to keep decrementing J
            // until we either find an element that's less than the pivot or J crosses I.
            while(i < j && array[--j] >= pivot);
            //J hasn't crossed I, if I is still less than J, then we want to move the element at J into position I
            // because basically we have found the first element that is less than the pivot
            if (i < j){
                array[i] = array[j];
            }

            //NOTE: empty loop body
            while (i<j && array[++i] <= pivot);
            if (i < j){
                array[j] = array[i];
            }
        }

        array[j] = pivot;
        return j;


 /*       while (i < j) {

            for (j = end ; i < j ; j--) {
                if (array[j] < pivot)
                array[i] = array[j];
                for (i = 1; i < j ; i++) {
                    if (array[i] > pivot){
                        array[j] = array[i];
                        break;
                    }
                }
            }
        /
        array[i] = pivot;
        return i ;
        */
    }
}
