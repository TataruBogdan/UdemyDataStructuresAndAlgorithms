package com.bogdantataru.HakerRank;

public class ViralAdvertising {


    public static void main(String[] args) {

        System.out.println(viralAdvertising(3));
    }


    /*
     * Complete the 'viralAdvertising' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int viralAdvertising(int n) {

        int likes = 0;
        int recipients = 5;

        for (int i = 1; i <= n; i++) {
            likes += recipients / 2;
            recipients = recipients / 2*3;
        }
        return likes;

    }
}
