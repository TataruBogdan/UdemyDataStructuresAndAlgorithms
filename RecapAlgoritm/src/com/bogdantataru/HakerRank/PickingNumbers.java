package com.bogdantataru.HakerRank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PickingNumbers {


    public static void main(String[] args) {

    }

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {

        int max=0;
        for (int i = 0; i < a.size(); i++) {
            int count=0;
            for (int j = 0; j < a.size(); j++) {
                if ((a.get(i) - a.get(j)) <= 1 && (a.get(i) - a.get(j)) >= 0 )
                    count++;
            }
            if (count>max)
                max=count;
        }

        return max;
    }

}
