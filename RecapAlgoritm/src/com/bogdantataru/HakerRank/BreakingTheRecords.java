package com.bogdantataru.HakerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BreakingTheRecords {


    public static void main(String[] args) {

        List<Integer> a = Arrays.asList(10, 5, 20, 20, 4, 5, 2, 25, 1);

        System.out.println(breakingRecords(a));
    }

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {

        int min = 0;
        int max = 0;
        List<Integer> records = new ArrayList<>();

    //Points scored in the first game establish her record for the season, and she begins counting from there.
        int seasonRecordMin = scores.get(0);
        int seasonRecordMax = scores.get(0);

        int i = 1;
        while (i < scores.size()) {
            int gameScore = scores.get(i);
            if (gameScore < seasonRecordMin) {
                seasonRecordMin = gameScore;
                min++;
            }
            if (gameScore > seasonRecordMax){
                seasonRecordMax = gameScore;
                max++;
            }
            i++;
        }

        records.add(1, min);
        records.add(0, max);


        return records;
    }

}
