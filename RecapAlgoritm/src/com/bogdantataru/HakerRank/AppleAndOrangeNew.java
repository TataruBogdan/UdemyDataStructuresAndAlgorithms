package com.bogdantataru.HakerRank;


import java.util.Arrays;
import java.util.List;

public class AppleAndOrangeNew {

    public static void main(String[]args){


        countApplesAndOranges(7, 10, 4, 12,
                Arrays.asList(2, 3, -4), Arrays.asList(3, -2, -4));

    }

    //determine the number of apples and oranges that land on Sam's house.
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {

        int fallenAppellsOnHouse = 0;
        int fallenOrangesOnHouse = 0;

        for (int i = 0; i < apples.size(); i++) {
            int distanceFromApple = apples.get(i);
            if((distanceFromApple + a >= s) && (distanceFromApple + a <= t)) {
                fallenAppellsOnHouse++;
            }
        }

        for (int i = 0; i < oranges.size(); i++) {
            int distanceFromOrange = oranges.get(i);
            if ((distanceFromOrange + b >= s) && (distanceFromOrange + b <= t)) {
                fallenOrangesOnHouse++;
            }
        }

        System.out.println(fallenAppellsOnHouse);
        System.out.println(fallenOrangesOnHouse);

    }
}




