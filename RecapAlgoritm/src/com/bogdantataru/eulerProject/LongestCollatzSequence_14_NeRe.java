package com.bogdantataru.eulerProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestCollatzSequence_14_NeRe {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] arr = new int[t];

        for (int a = 0; a < t; a++) {
            int N = scanner.nextInt();
            int seq = new LongestCollatzSequence_14_NeRe().numberOfSequence(N);
            arr[a] = seq;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public int numberOfSequence(int n){

        int maxCount = 0;
        int maxNumber = 0;
        for (int i = 2; i <= n; i++) {
            int k = i;
            int count = 0;
            while(k > 1){
                if (isEven(k)){
                    k = k /2;
                    if (memo.containsKey(k)){
                        count = memo.get(k) + count + 1;
                        break;
                    }
                } else {
                    k = (k * 3) + 1;
                    if (memo.containsKey(k)){
                        count = memo.get(k) + count + 1;
                        break;
                    }
                }
                count++;
            }
            memo.put(i, count);
            if (count >= maxCount){
                maxCount = count;
                maxNumber = i;
            }
        }
        return maxNumber;
    }

    private Map<Integer, Integer> memo = new HashMap<>();

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

}
