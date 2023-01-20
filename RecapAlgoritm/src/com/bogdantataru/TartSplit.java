package com.bogdantataru;

public class TartSplit {

    public static void main(String[] args) {

        new TartSplit().solution(27, 39);


    }

    //in how many slices a number o tarts must be sliced so that every guest can have one slice
    // A- number of tarts
    // B - number of quests
    public void solution(int tartsNumber, int guestsNumber){
        //t2 - number of tarts with 1 slice
        int t2 = guestsNumber % tartsNumber;
        //t1 - number of tarts with 1 slice minder
        int t1 = tartsNumber - t2;
        //numberOfBigSlices of tart
        int bigSlices =(int) Math.floor(guestsNumber / tartsNumber);
        //small slices of tart
        int smallSlices = bigSlices + 1;

        System.out.printf("You have to slice %d tarts for %d guests %n", tartsNumber, guestsNumber);
        System.out.printf("You have to slice %d tarts in %d slices %n" , t1, bigSlices);
        if (t2 != 0) System.out.printf("You have to slice %d tarts in %d slices", t2, smallSlices);


    }

}
