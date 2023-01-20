package com.bogdantataru;

public class Dominator {

    public static void main(String[] args) {

        int[] array = new int[] {2, 4, 3, 3, 3, 2, 3};

        System.out.println(new Dominator().solution(new int[] {3, 0, 1, 1, 4, 1, 1}));
        System.out.println(new Dominator().solution(new int[] {1, 2, 3, 4, 5, 6, 7}));
        Dominator obj = new Dominator();
        System.out.println(obj.solution(array));
    }

    public int solution(int[] A) {

        int consecutiveSize = 0;
        int candidate = 0;
        // we first find the possible candidate !!!
        for (int item : A) {
            //for the first candidate we say that this item can be a candidate can be a candidate
            if (consecutiveSize == 0){
                candidate = item;
                consecutiveSize +=1;
            // if next candidate is the same candidate as the one that we initially found consecutiveSize +1
            } else if (candidate == item){
                consecutiveSize +=1;
            // We move on to the next item and because this item is different than the candidate value what we have to do is subtract the consecutiveSize by 1.
            } else {
                consecutiveSize -= 1;
            }
        }
        // at the end of processing the entire array we grab the candidate leader represented by our variable
        // scanning the number of times the candidate matches in our input array to see if it's LEADER OR NOT.
        int occurrences = 0;
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            // If we find our candidate  - if the item in the array at position i is equal to our candidate leader
            if (A[i] == candidate){
                occurrences ++;
                index = i; // store the index of i. In this manner we're storing the last index of the leader.
            }
        }
        if (occurrences > A.length/2) {
            return index;
        }
        return -1;
    }
}
