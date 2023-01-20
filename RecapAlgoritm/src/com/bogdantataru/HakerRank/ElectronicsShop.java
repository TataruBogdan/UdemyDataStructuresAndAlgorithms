package com.bogdantataru.HakerRank;

public class ElectronicsShop {

    public static void main(String[] args) {



    }

    /*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {


        int maxCost = -1;

        for (int i = 0; i < keyboards.length; i++) {

            for (int j = 0; j < drives.length; j++) {
                if (keyboards[i] + drives[j] <= b && keyboards[i] + drives[j] > maxCost) {
                    maxCost = keyboards[i] + drives[j];
                }
            }
        }


        return maxCost;

    }
}



