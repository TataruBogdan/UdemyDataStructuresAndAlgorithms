package com.bogdantataru;

import java.util.Arrays;

public class CountDistinctSliceSchool {

    public static void main(String[] args) {

        System.out.println(CountDistinctSliceSchool.solution(5, new int[] {3, 4, 5, 5, 2}));
//        System.out.println(CountDistinctSliceSchool.solution(5, new int[] {2, 4, 1, 7, 4, 9, 7, 3, 5, 5, 8, 7, 1}));

    }

    // return the number of slices with now duplicates items
    public static int solution(int M, int[] A) {


        int count = 0; //count of the total slices
        // the first arguments to our function signature the arguments named M will be nine
        // implement the mechanism that will allow us to find out whether we have repeat numbers in our window or not
        // create an array an container where we can store different flags depending on whether we have encountered a number or not.
        // while we are processing this list we encountered number three we mark the number three
        // to say that we have already encountered the number three the size of this array is m plus 1.
        // Remember that M is one of the arguments to our function codility gives us the maximum number that we will find in our input.
        // we will find in our input.

        boolean[] inWindow  = new boolean[A.length+1];
        Arrays.fill(inWindow, false);
        int front = 0;
        // we increment each time the front pointer with one unit
        // and our counter and keep adding the number of items to it
        for (int back = 0; back < A.length-1; back++) {

            //this is our window
            //atata timp cat pointerul front nu depaseste lungimea array-lui si valuarea de la pozitia lui front nu se afla in WINDOW
            while(front < A.length &&!inWindow[A[front]]) {
                // modific in inWindow[A[front]] la pozitia = valoarea din A si setez TRUE - adica am intalnit aceasta valoare
                inWindow[A[front]] = true ;
                int size = front - back + 1;
                count = count + size;
                front++;
                if (count > 1000000000) return 1000000000;
            }
            //while we're moving the back pointer we unmark the values as we go along
            // we unmark first position , then next ...
            inWindow[A[back]] = false;
        }
        return count;
    }

}
