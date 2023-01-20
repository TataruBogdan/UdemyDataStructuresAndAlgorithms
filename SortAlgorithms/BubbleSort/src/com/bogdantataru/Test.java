package com.bogdantataru;

public class Test {

    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        // partition the array into sorted partition and unsorted partition - logical partitioning
        // we have a field - unsortedPartitionIndex -> when we START THIS WILL BE 6 because the entire array is the unsorted partition
        // lastUnsortedIndex of the unsorted partition
        // first element si sorted - one element
        // i starts at the left of the array, or at index 0- USED TO traverse the array from left to right
        // and what we do we compare the element at index 0 with the element at index 1
        //  and if the element at index 0 is greater than the element at index 1, we SWAP the elements.
        //  we want to move larger elements towards the end of the array because we're sorting in ascending order.
        //  at the end We have completed the first traversal of the array (first incrementation)
        //  and at this point I is equal to the last unsorted partition index so we stop.


        // create an unsortedPartitionIndex - because we use an array we take the length of the array = 7
        // on each iteration we decrement by one element because the biggest element bubble up to 6
        for (int unsortedPartitionIndex = intArray.length - 1; unsortedPartitionIndex > 0; unsortedPartitionIndex--) {
            // we use the i to traverse the array from left to right
            for (int i = 1; i <= unsortedPartitionIndex; i++) {
                // compare the the element at index 0 with the element at index 1
                if (intArray[i-1] > intArray[i]) {
                    swap(intArray, i-1, i);
                }
            }
        }

        for (int i = 0; i < intArray.length-1; i++) {
            System.out.println(intArray[i]);
        }
    }
    //this function swap the elements from the array
    public static void swap(int[] array, int i, int j){
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}
