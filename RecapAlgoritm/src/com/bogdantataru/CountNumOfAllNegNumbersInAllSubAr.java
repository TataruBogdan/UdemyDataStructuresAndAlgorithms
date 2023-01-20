package com.bogdantataru;

public class CountNumOfAllNegNumbersInAllSubAr {

    // Function to count the number of
    // negative elements in every window
    // of size K
    public static void countNegative(int[] arr, int k)
    {
        // Initialize the window pointers
        int i = 0;
        int j = 0;

        // Store the count of negative numbers
        int count = 0;
        int n = arr.length;

        // Traverse the array, arr[]
        while (j < n) {

            // Increase the count
            // if element is less then 0
            if (arr[j] < 0) {
                count++;
            }

            // If size of the window equal to k
            if (j - i + 1 == k) {
                System.out.print(count + " ");

                // If the first element of
                // the window is less than 0,
                // decrement count by 1
                if (arr[i] < 0) {
                    count--;
                }
                i++;
            }

            j++;
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        // Given Input
        int[] arr = { -1, 2, -2, 3, 5, -7, -5 };
        int k = 3;

        // Function Call
        countNegative(arr, k);
    }
}
