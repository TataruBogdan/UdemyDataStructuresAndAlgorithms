package com.bogdantataru.HakerRank;

import java.util.Arrays;
import java.util.List;

public class DivisibleSumPairs {


    public static void main(String[] args) {

        System.out.println(divisibleSumPairs(6, 3, Arrays.asList(1, 3, 2, 6, 1, 2)));
    }

    /*
     * Complete the 'divisibleSumPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n -
     *  2. INTEGER k - positive
     *  3. INTEGER_ARRAY ar
     */
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {

        int count = 0;

        for (int i = 0; i < n; i++) {
            int j = i + 1;
            while (j < n) {
                if ((ar.get(i) + ar.get(j)) % k == 0){
                    count++;
                }
                j++;
            }

        }
        return count;

    }
}
