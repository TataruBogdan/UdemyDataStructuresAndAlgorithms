package com.bogdantataru.HakerRank;

import java.util.Arrays;
import java.util.List;

public class BirthdayCakeCandles {

    public static void main(String[] args) {

        List<Integer> c = Arrays.asList(4,4,1,3);

        System.out.println(birthdayCakeCandles(c));
    }


    public static int birthdayCakeCandles(List<Integer> candles) {


        int candlesHeight = 0;
        int count = 0;

        for (int tempHeight : candles) {
            if (tempHeight > candlesHeight) {
                candlesHeight = tempHeight;
                count = 1;
            } else if (tempHeight == candlesHeight) {
                count++;
            }

        }

        return count;
    }
}
