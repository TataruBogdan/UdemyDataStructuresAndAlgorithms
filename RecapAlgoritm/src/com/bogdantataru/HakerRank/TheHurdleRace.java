package com.bogdantataru.HakerRank;

import java.util.List;

public class TheHurdleRace {

    public static void main(String[] args) {


    }


    /*
     * Complete the 'hurdleRace' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY height
     */

    public static int hurdleRace(int k, List<Integer> height) {


        int maxHurtleHeight = Integer.MIN_VALUE;

        for (Integer h : height) {
            if (h > maxHurtleHeight) {
                maxHurtleHeight = h;
            }
        }

        return Math.max(0, maxHurtleHeight - k);
    }
}
