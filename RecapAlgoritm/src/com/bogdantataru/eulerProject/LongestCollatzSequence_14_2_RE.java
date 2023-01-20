package com.bogdantataru.eulerProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestCollatzSequence_14_2_RE {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] arr = new int[t];

        for (int a = 0; a < t; a++) {
            int N = scanner.nextInt();
            int seq = new LongestCollatzSequence_14_2_RE().seq(N);
            arr[a] = seq;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public int numberOfSequence(int n){
        if (n <= 2){

            return 1;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        if (isEven(n)) {
            n = n / 2;
        } else {
            n = (n * 3) + 1;
        }

        if (!memo.containsKey(n)) {
            int seqNumber = numberOfSequence(n) + 1;
            memo.put(n, seqNumber);
        }
        return memo.get(n);
    }
    private Map<Integer, Integer> memo = new HashMap<>();

    public int seq(int n) {
        if (n < 0){
            throw new IllegalArgumentException("Number cannot be negative");
        }
        int maxSequences = 0;
        int maxNumber = 0;

        for (int i = 2; i <= n ; i++) {
            if (!memo.containsKey(i)) {
                int sequence = numberOfSequence(i);
                if (sequence >= maxSequences) {
                    maxSequences = sequence;
                    maxNumber = i;
                }
            }
        }
        return maxNumber;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
