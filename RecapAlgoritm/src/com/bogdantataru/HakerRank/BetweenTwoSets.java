package com.bogdantataru.HakerRank;

import java.util.Arrays;
import java.util.List;

/*
 * Complete the 'getTotalX' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */

public class BetweenTwoSets {

    public static void main(String[] args) {

        System.out.println(getTotalX(Arrays.asList(2, 4), Arrays.asList(16, 32, 96)));

    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {

        int count = 0;
        for (int i = 1; i <= 100; i++) {
            int first = 0;
            int second = 0;

            for (Integer num : a) {
                if (i % num == 0) first++;
                else break;
            }
            for (Integer num : b) {
                if (num % i == 0) second++;
                else break;
            }
            if (first == a.size() && second == b.size()) {
                count++;
            }
        }
        return count;
    }

    public static int getTotal(List<Integer> a, List<Integer> b) {

        int factor = 0;
        boolean notFactor = false;


        for (int i = 0; i < b.size(); i++) {
            int first = b.get(i);
            for (int k = 0; k < a.size(); k++) {
                int second = a.get(k);
                if (first % second != 0) {
                    notFactor = true;
                }
            }
            if (!notFactor) {
                factor++;
            }
        }
        return factor;

    }
}
