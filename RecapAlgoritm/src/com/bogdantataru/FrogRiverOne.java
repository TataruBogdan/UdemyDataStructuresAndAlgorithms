package com.bogdantataru;

public class FrogRiverOne {

    public static void main(String[] args) {

    }

    // x - width of the river -> transform in a boolean array of river positions
    public int solution(int x, int[] A) {

        //create an array - every element indicate that the space is empty - no life has falls
        //x+1 - because the spaces are numbered from 1 to 5 (ignore the first elem)
        boolean[] riverPositions = new boolean[x + 1]; // look up array

        //process the input array from left to right
        for (int time = 0; time < A.length; time++) {
            int pos = A[time];// what gap will fill the falling leaf
            //that particular river position is empty.
            // If that value is false, it means there is no leaf in that particular position.
            if (!riverPositions[pos]){
                riverPositions[pos] = true;
                //use x as counter
                x -= 1; //subtracting one from our input parameter.
                if (x == 0) return time; //we have an entire path of leaf's
            }
        }
        return -1;

    }

}
