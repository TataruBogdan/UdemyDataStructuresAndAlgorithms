package com.bogdantataru.HakerRank;

public class SaveThePrisoner {


    public static void main(String[] args) {
        System.out.println(saveThePrisoner(4,6,2));
    }


    /*
     * Complete the 'saveThePrisoner' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER m
     *  3. INTEGER s
     */

    public static int saveThePrisoner(int n, int m, int s) {

        // chair num of the last prisoner to recieve candy
        int lastPrisoner =( s + m -1) % n;

        if (lastPrisoner == 0) {
            return n;
        } else {
            return lastPrisoner;
        }


    }
}
