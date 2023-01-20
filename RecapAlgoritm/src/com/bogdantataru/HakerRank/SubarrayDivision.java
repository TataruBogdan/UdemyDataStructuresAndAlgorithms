package com.bogdantataru.HakerRank;

import java.util.Arrays;
import java.util.List;

public class SubarrayDivision {

    public static void main(String[] args) {

        List<Integer> asList =Arrays.asList(1, 2, 1, 3, 2);
        //List<Integer> asList =Arrays.asList(1, 1, 1, 1, 1);

        System.out.println(birthday(asList,3,2));
    }

    /*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    public static int birthday(List<Integer> s, int d, int m) {

        int count = 0;

        for (int i = 0; i < s.size(); i++) {
            int j = i;
            int sum = 0;
            int maxIndex = m+j;
            while (j < s.size() && j < maxIndex){
                sum += s.get(j);
                if (sum == d && maxIndex - j == 1) {
                    count++;
                    break;
                }
                j++;
            }

        }
        return count;
    }
}
