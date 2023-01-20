package com.bogdantataru.HakerRank;

import java.util.List;

public class BetweenTwoSetsNew {

    public static void main(String[] args) {


    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {


        int counterFactors = 0;

        for (int i = 0; i < b.size(); i++) {
            int considerdInteger = b.get(i);
            for (int j = 0; j < a.size(); j++) {
                int factor = a.get(j);
                if (considerdInteger % factor == 0 ){
                    counterFactors++;
                }
            }
        }
        return counterFactors;
    }
}
