package com.bogdantataru.HakerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClimbingTheLeaderboard {

    public static void main(String[] args) {

        System.out.println(climbingLeaderboard(Arrays.asList(100, 90,90,80), Arrays.asList(70, 80, 105)));

    }

    /*
     * Complete the 'climbingLeaderboard' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY ranked
     *  2. INTEGER_ARRAY player
     */

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {


        List<Integer> ranks = new ArrayList<>();
        List<Integer> newRanks = new ArrayList<>();

        for (int score : player) {
            int left = 0;
            int right = ranked.size() - 1;

            while (left <= right) {
                int rank = 0;
                int mid = (left + right) / 2;

                if (ranked.get(mid) == score ) {
                    rank = mid + 1;
                    break;
                } else if (ranked.get(mid) > score) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }

                if ((ranked.get(mid)< score && ranked.get(left - 1) < score)) {
                    rank = left + 1;
                } else {
                    rank = left;
                }

                ranks.add(rank);
                newRanks.add(rank - 1, score);
            }
        }
        return ranks;
    }
}
