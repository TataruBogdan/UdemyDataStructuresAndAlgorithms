package com.bogdantataru;

// find  out maximum subarray
//// sum in linear time
//// using prefix sum.

public class PrefixSuffix {

    // Function to compute maximum
    // subarray sum in linear time.
    static int maximumSumSubarray(int arr[], int n) {
        // Initialize minimum
        // prefix sum to 0.
        int min_prefix_sum = 0;

        // Initialize maximum subarray
        // sum so far to -infinity.
        int res = Integer.MIN_VALUE;

        // Initialize and compute
        // the prefix sum array.
        int prefix_sum[] = new int[n];
        prefix_sum[0] = arr[0];
        for (int i = 1; i < n; i++)
            prefix_sum[i] = prefix_sum[i - 1]
                    + arr[i];

        // loop through the array, keep
        // track of minimum prefix sum so
        // far and maximum subarray sum.
        for (int i = 0; i < n; i++) {
            res = Math.max(res, prefix_sum[i] - min_prefix_sum);
            min_prefix_sum = Math.min(min_prefix_sum,
                    prefix_sum[i]);
        }

        return res;
    }

}
