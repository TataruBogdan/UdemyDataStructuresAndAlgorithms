package com.bogdantataru;

import java.util.Arrays;

public class DiscIntersections {


    public static void main(String[] args) {

        System.out.println(new DiscIntersections().solution(new int[]{1, 5, 2, 1, 4, 0}));
    }

    private int indexLessThan(Disc[] sortedDiskList, double i, int start, int last) {

        int mid = start + (last - start) / 2;

        if (last <= start && sortedDiskList[mid].start > i) return mid - 1;
        if (last <= start) return mid;
        if (sortedDiskList[mid].start > i)
            return indexLessThan(sortedDiskList,i, start, mid-1);
        else
            return indexLessThan(sortedDiskList, i, mid + 1,last);
    }

    public int solution (int[] A){

        int len = A.length;
        Disc[] discs = new Disc[len];

        for (int i = 0; i < len; i++) {
            discs[i] = new Disc(i - (long) A[i], i + (long) A[i]);
        }
        // order the discs using the starting position of each one of them
        // process each disc in the order that it was sorted
        Arrays.sort(discs);
        // when we are processing a particular disc what we need to do
        // is pick the ending position of that particular disc and find out the first disc that starts after that ending position.
        int total = 0;
        for (int i = 0; i < len; i++) {
            total += indexLessThan(discs, discs[i].end +0.5, 0, len -1)  - i;
            if (total > 10000000) return -1;
        }

        return total;
    }

    class Disc implements Comparable {

        final long start;
        final long end;

        Disc(long start, long end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Object o) {
            return Long.compare(start,((Disc) o).start);
        }
    }

}
