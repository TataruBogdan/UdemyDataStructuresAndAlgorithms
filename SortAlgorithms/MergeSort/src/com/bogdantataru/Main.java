package com.bogdantataru;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        mergeSort(intArray, 0, intArray.length);
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + ", ");
        }
    }
    //  {20, 35, 15, 7, 55, 1, 22}
    //   0    1   2  3   4  5   6
    // splitting faze
    public static void mergeSort(int[] input, int start, int end){
        // base case
        if (end - start < 2) {
            return;
        }
        int midpoint = (start + end)/2;
        mergeSort(input, start, midpoint);// 20, 35, 15,
        mergeSort(input, midpoint, end); // 7, 55, 1, 22
        merge(input,start,midpoint, end);
    }

    //  {20, 35, 15, 7, 55, 1, 22}
    //    0   1   2  3   4  5   6
    // merge faze - merge every left/right pair into a sorted array.
    public static void merge(int[] input, int start, int mid, int end) {

        if (input[mid - 1] <= input[mid]) {
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;

         int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }
        // second optimization.
        // we then have to copy the sorted values back into the original input array, the one that we're sorting, at the correct positions,
        System.arraycopy(input, i , input,start + tempIndex,mid - i );
        System.arraycopy(temp,0, input, start, tempIndex);

    }


}
