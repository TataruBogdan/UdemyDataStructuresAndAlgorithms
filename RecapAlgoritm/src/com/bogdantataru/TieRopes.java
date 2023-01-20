package com.bogdantataru;

public class TieRopes {

    public static void main(String[] args) {

                // r - 0  1  2  3  4  5  6
        int[] input = {1, 2, 3, 4, 1, 1, 3};

        System.out.println(new TieRopes().solution(4, input));

    }

    public int solution (int k, int[] A) {

        int count = 0;
        int ropeLength = 0;

        for (int rope : A) {
            ropeLength += rope;
            if (ropeLength >= k) {
                count++;
                ropeLength = 0;
            }
        }
        return count;
    }


    //return total number of ropes >= k
    // We say that two ropes I and I + 1 are adjacent. Two adjacent ropes can be tied together with a knot,
    // and the length of the tied rope is the sum of lengths of both ropes. The resulting new rope can then be tied again.
    public int mySolution (int k, int[] A) {

        // suma a doua funii adiacente este >=4
        //ex A[0] + A[1] = 3 >= 4 ? no count = 2 -> A[0] + A[1] + A[2] >= 4 ? count = 3 return count
        int count = 0;
        for (int r = 0; r < A.length; ) {
            int lenOfRope = 0;
            //if there are adjacent? - start and start of each rope - create the window
            while (lenOfRope < k) {
                lenOfRope += A[r];
                r++;
            }
            count +=1;
            // every time we tie adjacent ropes the length of new formed rope is equal to the sum of the two ropes
        }
        return count;

    }

}
