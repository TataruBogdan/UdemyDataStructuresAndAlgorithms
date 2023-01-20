package com.bogdantataru;

import java.util.HashSet;
import java.util.Set;

public class LargestK {

    // Function to find the largest
    // number k such that both k and
    // -k are present in the array
    public static int largestNum(int[] arr)
    {
        // Stores the array elements
        Set<Integer> set = new HashSet<>();

        // Initialize a variable res as
        // 0 to store maximum element
        // while traversing the array
        int res = 0;

        // Iterate through array arr
        for (int i = 0;
             i < arr.length; i++) {

            // Add the current element
            // into the set
            set.add(arr[i]);

            // Check if the negative of
            // this element is also
            // present in the set or not
            if (set.contains(-1 * arr[i])) {

                res = Math.max(
                        res, Math.abs(arr[i]));
            }
        }

        // Return the resultant element
        return res;
    }

    // Drive Code
    public static void
    main(String[] args)
    {

        int[] arr = { 3, 2, -2, 5, -3 };
        System.out.println(
                largestNum(arr));
    }
}
